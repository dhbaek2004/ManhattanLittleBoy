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

    /**
     * 질문을 DB로 보내기
     * @param question
     */
    public void save(Question question) {
        em.persist(question);
    }


    /**
     * 질문 전체 조회
     * @return
     */
    public List<Question> findAll() {
        return em.createQuery("Select q from Question q", Question.class)
                .getResultList();
    }


    /**
     * 세션에서 아이템Seq를 받아 조건부 검색
     * @param itemSequence
     * @return
     */
    public List<Question> findBySeq(int itemSequence) {
        return em.createQuery("select q from Question q where q.itemSequence = :itemSequence", Question.class)
                .setParameter("itemSequence", itemSequence)
                .getResultList();
    }
}
