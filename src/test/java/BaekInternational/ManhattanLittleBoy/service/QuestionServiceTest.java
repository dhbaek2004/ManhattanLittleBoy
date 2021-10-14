package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.repository.QuestionRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;



@ExtendWith(SpringExtension.class)
@SpringBootTest // 통합테스트임 , 통합테스트보단 단위테스트가 좋다 -김0한
@Transactional
class QuestionServiceTest {
    LocalDateTime currentDateTime = LocalDateTime.now();
    @Autowired QuestionService questionService;
    @Autowired QuestionRepository questionRepository;

    @BeforeEach
    void beforeEach() {
        questionService = new QuestionService(questionRepository);

    }

    @AfterEach
    void afterEach() {

    }

    @Test
    void 질문등록() throws Exception {
        //given

        // Question question = new Question();
        //question.setQuestionTitle("질문 제목");
        //question.setQuestionContent("질문 내용");
        //question.setQuestionRegisterTime(currentDateTime);
        // questionService.createQuestion(question);


            Question question = Question.builder() // @Builder 사용시
                    .questionTitle("통합 테스트 제목")
                    .questionContent("통합 테스트 컨텐츠")
                    .questionRegisterTime(currentDateTime)
                    .build();



        //when
        questionRepository.save(question);

        //then
        List<Question> questionList = questionRepository.findAll();
        System.out.println(questionList.get(0).getQuestionTitle().toString());

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