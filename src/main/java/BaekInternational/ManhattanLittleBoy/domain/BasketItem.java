package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class BasketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "bi_sequence")
    private int basketItemSequence;
    private int basketItemQuantity;
    private int basketItemPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Basket basket;


}
