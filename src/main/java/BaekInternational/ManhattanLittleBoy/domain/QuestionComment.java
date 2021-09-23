package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class QuestionComment {
    @Id
    @GeneratedValue
    @Column(name = "qc_seq")
    private int questionCommentSeq;

    private String questionCommentContent;
    private LocalDateTime questionCommentRegisterTime;
    private LocalDateTime questionCommentModifyTime;

    private int userSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;
}
