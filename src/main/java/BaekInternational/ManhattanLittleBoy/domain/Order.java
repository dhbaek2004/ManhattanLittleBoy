package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
@Table(name="orders") //order는 postgresql의 예약어 이므로 table 명을 orders로 매칭
public class Order {
    @Id
    @GeneratedValue
    //@Column(name = "o_sequence")
    private int orderSequence;

    private LocalDateTime orderDate;
    @Enumerated(EnumType.STRING)
    private OrderPayment orderPayment;
    private int orderPrice;
    private String orderAddress;

    // member 와의 Relation
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Member member;

    // OrderItem 과의 Relation
    @OneToMany(mappedBy = "order", cascade = CascadeType.MERGE)
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn
    private Delivery delivery;

    // == 연관관계 메서드 == //
    // Order - OrderItem 간의 연관관계 메서드
    public void addOrderItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    // Order - Member 간의 연관관계 메서드
    public void setMember(Member member) {
        this.member = member;
        member.getOrders().add(this);
    }

    // Order - Delivery 간의 연관관계 메서드
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
        delivery.setOrder(this);
    }

    // == 생성 메서드 == //

    public static Order createOrder(Member member, Delivery delivery, List<OrderItem> orderItems) {
        Order order = new Order();
        order.setMember(member);
        order.setDelivery(delivery);

        order.setOrderPrice(getOrderPrice(orderItems));

        return order;
    }

    // == 비즈니스 로직 == //
    // itemDetail ????
    public static int getOrderPrice(List<OrderItem> orderItems) {
        int totalPrice = 0;

        for (OrderItem orderItem : orderItems) {
            totalPrice += orderItem.getItem().getItemPrice();
        }
        return totalPrice;
    }
}
