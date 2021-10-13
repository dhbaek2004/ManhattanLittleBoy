package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@Slf4j
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
     * @param
     * @return
     */
//    public List<Question> findBySeq(int itemSequence) {
//        return em.createQuery("select q from Question q where q.itemSequence = :itemSequence", Question.class)
//                .setParameter("itemSequence", itemSequence)
//                .getResultList();
//    }

    public void deleteById(int seq) {
        log.info("리포지트리 deleteById 작동");
        log.info(String.valueOf(seq));
        Question question = em.find(Question.class, seq);
        em.remove(question);
    }


}
