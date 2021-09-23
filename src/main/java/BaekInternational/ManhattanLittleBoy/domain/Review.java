package BaekInternational.ManhattanLittleBoy.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue
    @Column(name = "r_seq")
    private int reviewSeq;

    private String reviewTitle;
    private String reviewContent;
    private LocalDateTime reviewRegisterTime;
    private LocalDateTime reviewModifyTime;

    private Item item;
    private User user;
    private List<ReviewComment> reviewComments;

}
