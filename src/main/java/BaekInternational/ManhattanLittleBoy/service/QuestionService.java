package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public int createQuestion(Question question) {
        questionRepository.save(question);
        return question.getQuestionSequence();
    }

    public List<Question> findQuestions() {
        return questionRepository.findAll();
    }
}
