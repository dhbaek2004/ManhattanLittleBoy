package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class BasketItem {
    @Id
    @GeneratedValue
    @Column(name = "bi_seq")
    private int basketItemSeq;

    private int basketItemQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "i_seq")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "b_seq")
    private Basket basket;


}
