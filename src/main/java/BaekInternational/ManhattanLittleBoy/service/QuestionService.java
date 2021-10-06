package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public int createQuestion(Question question) {
        questionRepository.save(question);
        return question.getQuestionSequence();
    }

    public List<Question> findAllQuestions() {
        return questionRepository.findAll();
    }

//    public List<Question> findBySeq(int itemSequence) {
//        return questionRepository.findBySeq(itemSequence);
//    }

    public void deletePost(int id) {
        Optional<Question> question = questionRepository.findById(id);
        if(question.isPresent()) {
            Question question1 = question.get();
            questionRepository.deleteById(id);
        }
    }
}
