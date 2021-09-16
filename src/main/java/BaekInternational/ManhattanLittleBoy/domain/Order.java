package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "orderSeq")
    private int orderSeq;
    private LocalDateTime orderDate;
    private OrderPayment orderPayment;
    private int orderPrice;
    private String orderAddress;


    // User 와의 Relation
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userSeq")
    private User user;

    // OrderItem과의 Relation
    @OneToMany(mappedBy = "OrderItem", cascade = CascadeType.MERGE)
    private List<OrderItem> orderItems = new ArrayList<>();

}
