package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "i_sequence")
    private int itemSequence;
    private String itemName;
    private int itemScore;
    private int itemPrice;
    private String itemContents;

    @OneToMany(mappedBy = "item", cascade = CascadeType.MERGE)
    private List<ItemDetail> itemDetail = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<Question> questions = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<Question> reviews = new ArrayList<>();

    // == 연관관계 메서드 == //
    // Item - ItemDetail 간의 연관관계 메서드
    public void setItemDetail(ArrayList<ItemDetail> itemDetails) {
        this.setItemDetail(itemDetails);
        for (ItemDetail itemDetail: itemDetails) {
            itemDetail.setItem(this);
        }
    }

    // 생성 메서드
    public Item createItem(String itemName, int itemScore, int itemPrice, String itemContents, ArrayList<ItemDetail> itemDetails) {
        Item item = new Item();

        item.setItemName(itemName);
        item.setItemScore(itemScore);
        item.setItemPrice(itemPrice);
        item.setItemContents(itemContents);
        item.setItemDetail(itemDetails);

        return item;
    }

    // 비즈니스 로직

}
