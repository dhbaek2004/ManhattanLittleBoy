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
public class Question {
    @Id
    @GeneratedValue
    @Column(name = "q_seq")
    private int questionSeq;

    private String questionTitle;
    private String questionContent;
    private LocalDateTime questionRegisterTime;
    private LocalDateTime questionModifyTime;

    private Item item;
    private User user;
    private List<QuestionComment> questionComments;

}
