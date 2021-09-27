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
    // @Column(name = "rc_Sequence")
    private int reviewCommentSequence;

    private String reviewCommentContent;
    private LocalDateTime reviewCommentRegisterTime;
    private LocalDateTime reviewCommentModifyTime;

    private int memberSequence;

    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;
}
