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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "b_seq")
    private int basketSeq;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "m_seq")
    private Member member;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.MERGE)
    private List<BasketItem> basketItems = new ArrayList<>();
}
