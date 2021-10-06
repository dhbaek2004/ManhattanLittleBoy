package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
