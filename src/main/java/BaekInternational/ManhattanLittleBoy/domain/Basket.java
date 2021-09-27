package BaekInternational.ManhattanLittleBoy.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "b_sequence")
    private int basketSequence;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Member member;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.MERGE)
    private List<BasketItem> basketItems = new ArrayList<>();
}
