package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    // OrderItem과의 Relation 오더아이템이 오더의 자식
    @OneToMany(mappedBy = "User", cascade = CascadeType.MERGE)
    private List<User> userList = new ArrayList<>();


}
