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
public class QuestionComment {
    @Id
    @GeneratedValue
    @Column(name = "qc_seq")
    private int questionCommentSeq;

    private String questionCommentContent;
    private LocalDateTime questionCommentRegisterTime;
    private LocalDateTime questionCommentModifyTime;

    private User user;
    private Question question;
}
