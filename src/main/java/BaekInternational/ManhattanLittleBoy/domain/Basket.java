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
    @GeneratedValue
    @Column(name = "b_seq")
    private int basketSeq;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "u_seq")
    private User user;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.MERGE)
    private List<BasketItem> basketItems = new ArrayList<>();
}
