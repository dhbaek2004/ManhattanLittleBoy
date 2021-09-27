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

    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private Order order;

    @ManyToOne(fetch = LAZY)
    @JoinColumn
    private Item item;

}
