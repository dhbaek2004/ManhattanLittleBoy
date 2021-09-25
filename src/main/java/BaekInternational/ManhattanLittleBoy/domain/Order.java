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
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "o_seq")
    private int orderSeq;

    private LocalDateTime orderDate;
    private OrderPayment orderPayment;
    private int orderPrice;
    private String orderAddress;

    // User 와의 Relation
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "m_seq")
    private Member member;

    // OrderItem 과의 Relation
    @OneToMany(mappedBy = "order", cascade = CascadeType.MERGE)
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "d_seq")
    private Delivery delivery;

}
