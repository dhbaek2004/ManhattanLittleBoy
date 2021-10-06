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
    private Item item;

    // == 생성 메서드 == //
    /**
     * OrderItem 생성 메서드
     * @param item
     * @param price
     * @param quantity
     * @return
     */
    public static OrderItem createOrderItem(Item item, int price, int quantity) {
        OrderItem orderItem = new OrderItem();
        orderItem.setItem(item);
//        orderItem.setOrderItemPrice(item.getItemPrice());
        orderItem.setOrderItemQuantity(quantity);

        return orderItem;
    }

    // == 비즈니스 로직 == //

}
