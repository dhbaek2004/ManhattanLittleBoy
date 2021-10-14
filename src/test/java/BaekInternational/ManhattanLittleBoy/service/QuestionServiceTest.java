package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.repository.QuestionRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(SpringExtension.class)
// @SpringBootTest // 통합테스트임 , 통합테스트보단 단위테스트가 좋다 -김0한
// @Transactional
class QuestionServiceTest {
    LocalDateTime currentDateTime = LocalDateTime.now();


    @BeforeEach
    void beforeEach() {
        QuestionService questionService;
        QuestionRepository questionRepository;

    }

    @AfterEach
    void afterEach() {

    }

    @Test
    void 질문등록() {
        //given
        Question question = new Question();
        question.setQuestionTitle("질문 제목");
        question.setQuestionContent("질문 내용");
        question.setQuestionRegisterTime(currentDateTime);
        // questionService.createQuestion(question);

        //when

        //then

    }

    @Test
    void 모든질문출력() {
//        List<Question> questionList = questionService.findAllQuestions();
//        for(int i=0; i<questionList.size(); i++) {
//            System.out.println(questionList.get(i));
//        }
    }

    @Test
    void 질문삭제() {
    }
}