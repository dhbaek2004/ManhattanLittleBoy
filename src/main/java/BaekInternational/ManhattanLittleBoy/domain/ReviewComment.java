package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class ReviewComment {
    @Id
    @GeneratedValue
    @Column(name = "rc_seq")
    private int reviewCommentSeq;

    private String reviewCommentContent;
    private LocalDateTime reviewCommentRegisterTime;
    private LocalDateTime reviewCommentModifyTime;

    private User user;
    private Review review;
}
