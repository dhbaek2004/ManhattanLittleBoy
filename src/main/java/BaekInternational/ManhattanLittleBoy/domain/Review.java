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
public class Review {
    @Id
    @GeneratedValue
    //@Column(name = "r_sequence")
    private int reviewSequence;

    private String reviewTitle;
    private String reviewContent;
    private LocalDateTime reviewRegisterTime;
    private LocalDateTime reviewModifyTime;
    private int reviewScore;
    private int memberSequence;

    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;

    @OneToMany(mappedBy = "review")
    private List<ReviewComment> reviewComments = new ArrayList<>();

}
