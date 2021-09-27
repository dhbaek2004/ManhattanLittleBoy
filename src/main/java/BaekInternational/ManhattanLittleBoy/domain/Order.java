package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
@Table(name="orders") //order는 postgresql의 예약어 이므로 table 명을 orders로 매칭
public class Order {
    @Id
    @GeneratedValue
    //@Column(name = "o_sequence")
    private int orderSequence;

    private LocalDateTime orderDate;
    @Enumerated(EnumType.STRING)
    private OrderPayment orderPayment;
    private int orderPrice;
    private String orderAddress;

    // member 와의 Relation
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Member member;

    // OrderItem 과의 Relation
    @OneToMany(mappedBy = "order", cascade = CascadeType.MERGE)
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn
    private Delivery delivery;

}
