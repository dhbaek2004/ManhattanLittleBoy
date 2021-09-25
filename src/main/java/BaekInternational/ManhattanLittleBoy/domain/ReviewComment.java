package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class ReviewComment {
    @Id
    @GeneratedValue
    // @Column(name = "rc_seq")
    private int reviewCommentSeq;

    private String reviewCommentContent;
    private LocalDateTime reviewCommentRegisterTime;
    private LocalDateTime reviewCommentModifyTime;

    private int userSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;
}
