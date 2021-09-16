package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
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
    private Order order;

}
