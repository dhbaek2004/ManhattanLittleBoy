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
    @GeneratedValue
    @Column(name = "i_seq")
    private int itemSeq;
    private String itemName;
    private int itemRating;
    private int itemPrice;
    private String itemContents;

    @OneToMany(mappedBy = "item", cascade = CascadeType.MERGE)
    private List<ItemDetail> itemDetail = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<Question> questions = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<Question> reviews = new ArrayList<>();

}
