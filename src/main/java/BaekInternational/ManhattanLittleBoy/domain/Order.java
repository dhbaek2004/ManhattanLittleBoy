package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Order {
    @Id @GeneratedValue
    @Column(name = "o_seq")
    private int o_seq;
    private LocalDate o_date;

    // o_charge 추가 요망
    private int o_price;
    private String o_address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "u_seq")
    private User user;

    // 이 아래에 주문상품과의 연관 관계 정의 구현 요망

}
