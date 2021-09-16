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
    @Column(name = "oi_seq")
    private int orderItemSeq;
    private int orderItemQuantity;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "o_seq")
    private Order order;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "i_seq")
    private Item item;

}
