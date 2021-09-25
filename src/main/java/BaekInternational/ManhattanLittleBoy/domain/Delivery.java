package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
// @Table(name="delivery")
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "d_seq")
    private int deliverySeq;

    @Enumerated
    private DeliveryStatus deliveryStatus;

    private LocalDateTime deliveryExpDate;
    private LocalDateTime deliveryArrDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "o_seq")
    private Order order;

}
