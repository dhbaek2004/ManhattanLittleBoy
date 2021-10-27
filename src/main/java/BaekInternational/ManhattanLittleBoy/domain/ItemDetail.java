package BaekInternational.ManhattanLittleBoy.domain;

import BaekInternational.ManhattanLittleBoy.exception.NotEnoughStockException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class ItemDetail {
    @Id
    @GeneratedValue
    //@Column(name = "id_sequence")
    private int itemDetailSequence;

    private String itemDetailOption;
    private int itemDetailOptionPrice;
    private int itemDetailOptionQuantity;
    private String itemDetailImage;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Item item;

    @OneToMany(mappedBy = "itemDetail")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToMany(mappedBy = "itemDetail")
    private List<BasketItem> basketItems = new ArrayList<>();

    // == 연관관계 메서드 == //

    /**
     * Item - ItemDetail 간의 연관관계 메서드
     * @param item
     */
    public void setItem(Item item) {
        this.item = item;
        item.getItemDetail().add(this);
    }

    // == 비즈니스 로직 == //
    /**
     * 재고 수량 증가 메서드
     * @param quantity
     */
    public void addStock(int quantity) {
        this.itemDetailOptionQuantity += quantity;
    }

    /**
     * 재고 수량 감소 메소드
     * @param quantity
     */
    public void removeStock(int quantity) {
        if (this.itemDetailOptionQuantity < quantity) {
            // 예외 처리
            throw new NotEnoughStockException("재고가 부족합니다");
        }
        else {
            this.itemDetailOptionQuantity -= quantity;
        }
    }

    /**
     * 상품 기본 가격과 상품 옵션 가격을 더한 가격을 리턴하는 메서드
     * @return
     */
    public int getPriceSum() {
        return this.itemDetailOptionPrice + this.getItem().getItemPrice();
    }

}
