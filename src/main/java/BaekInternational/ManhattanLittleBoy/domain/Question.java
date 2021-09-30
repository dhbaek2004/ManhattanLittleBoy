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
public class Question {
    @Id
    @GeneratedValue
    //@Column(name = "q_sequence")
    private int questionSequence;

    private String questionTitle;
    private String questionContent;
    private LocalDateTime questionRegisterTime;
    private LocalDateTime questionModifyTime;
    private int memberSequence;

    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;

    @OneToMany(mappedBy = "question")
    private List<QuestionComment> questionComments = new ArrayList<>();

}