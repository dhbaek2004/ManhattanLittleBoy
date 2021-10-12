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

    // 생성 메서드


    // 비즈니스 로직

}
