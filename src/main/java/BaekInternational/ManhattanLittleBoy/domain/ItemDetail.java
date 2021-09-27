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

}
