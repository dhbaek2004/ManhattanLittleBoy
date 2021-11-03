package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
    private ItemDetail itemDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Basket basket;

    // == 연관관계 메서드 == //

    /**
     * BasketItem - ItemDetail 간의 연관관계 메서드
     * @param itemDetail
     */
    public void setItemDetail(ItemDetail itemDetail) {
        this.itemDetail = itemDetail;
        itemDetail.getBasketItems().add(this);
    }

    /**
     * BasketItem - Basket 간의 연관관계 메서드
     * @param basket
     */
    public void setBasket(Basket basket) {
        this.basket = basket;
        basket.getBasketItems().add(this);
    }

    // == 생성 메서드 == //
    public static BasketItem createBasketItem(int basketItemQuantity,
                                              int basketItemPrice,
                                              ItemDetail itemDetail,
                                              Basket basket) {

    }
}
