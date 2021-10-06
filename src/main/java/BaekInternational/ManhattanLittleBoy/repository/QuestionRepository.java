package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuestionRepository {
    private final EntityManager em;

    public void save(Question question) {
        em.persist(question);
    }

    public List<Question> findAll() {
        return em.createQuery("Select q from Question q", Question.class)
                .getResultList();
    }
}
