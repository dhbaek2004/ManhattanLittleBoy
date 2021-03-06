package BaekInternational.ManhattanLittleBoy.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
public class Question {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
