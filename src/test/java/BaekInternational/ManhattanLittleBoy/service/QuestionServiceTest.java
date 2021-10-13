package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
public class QuestionServiceTest {
    LocalDateTime currentDateTime = LocalDateTime.now();
    @Autowired QuestionService questionService;

    @Test
    void 질문등록() {
        //given
        Question question = new Question();
        question.setQuestionTitle("질문 제목");
        question.setQuestionContent("질문 내용");
        question.setQuestionRegisterTime(currentDateTime);

        //when
        questionService.createQuestion(question);

        //then
        List<Question> qaa = questionService.findAllQuestions();
        System.out.println("아놔 이 쉬바" + qaa);

    }

    @Test
    void 모든질문출력() {
    }

    @Test
    void 질문삭제() {
    }
}