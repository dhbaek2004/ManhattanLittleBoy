package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class QuestionServiceTest {
    LocalDateTime currentDateTime = LocalDateTime.now();
    QuestionService questionService;

    @Test
    void 질문등록() {
        //given
        Question question = new Question();
        question.setQuestionTitle("질문 제목");
        question.setQuestionContent("질문 내용");
        question.setQuestionRegisterTime(currentDateTime);


        //when
        //questionService.createQuestion(question);


        //then
        //questionService.findAllQuestions();

    }

    @Test
    void 모든질문출력() {
    }

    @Test
    void 질문삭제() {
    }
}