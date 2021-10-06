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
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "o_seq")
    private int orderSeq;

    private LocalDateTime orderDate;
    private int orderPrice;
    private String orderAddress;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Enumerated(EnumType.STRING)
    private OrderPayment orderPayment;

    // User 와의 Relation
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
        // TODO 추가할 것 많음
        Order order = new Order();
        order.setMember(member);
        order.setDelivery(delivery);

        return order;
    }

    // == 비즈니스 로직 == //

    /**
     * 주문의 총 가격 구하는 메서드
     * @param orderItems
     * @return
     */
    public int getOrderPrice(List<OrderItem> orderItems) {
        int totalPrice = 0;

        for (OrderItem orderItem : orderItems) {
            for (ItemDetail itemDetail: orderItem.getItem().getItemDetail()) {
                totalPrice += itemDetail.getPriceSum();
            }
        }
        return totalPrice;
    }

    public void cancelOrder() {
        if (this.delivery.getDeliveryStatus() == DeliveryStatus.DELIVERY_READY) {
            // 이미 배송중인 경우, 취소 불가
        }
        this.setOrderStatus(OrderStatus.CANCEL);
        this.delivery.setDeliveryStatus(DeliveryStatus.DELIVERY_CANCEL);

        // 재고 증가 로직 추가 요망


    }


}
