package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity

public class OrderItem {
    @Id
    @GeneratedValue
//    @Column(name = "oi_sequence")
    private int orderItemSequence;
    private int orderItemQuantity;
    private int orderItemPrice;

    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private Order order;

    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private ItemDetail itemDetail;

    // == 연관 관계 메서드 == //

    /**
     * ItemDetail - OrderItem 간의 연관 관계 메서드
     * @param itemDetail
     */
    public void setItemDetail(ItemDetail itemDetail) {
        this.itemDetail = itemDetail;
        itemDetail.getOrderItems().add(this);
    }

    /**
     * OrderItem - Order 간의 연관 관계 메서드
     * @param order
     */
    public void setOrder(Order order) {
        this.order = order;
        order.getOrderItems().add(this);
    }

    // == 생성 메서드 == //

    // == 비즈니스 로직 == //

}
