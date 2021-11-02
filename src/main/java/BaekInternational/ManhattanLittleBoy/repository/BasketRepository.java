package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.Basket;
import BaekInternational.ManhattanLittleBoy.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.HashMap;

@Repository
@RequiredArgsConstructor
public class BasketRepository {
    private final EntityManager em;

    public Basket findBasketByMemberSequence(int memberSequence) {
        return em.find(Basket.class, memberSequence);
    }

    public HashMap<String, Integer> save(Member member, int itemDetailSequence) {

        em.persist();
    }

    public HashMap<String, Integer> remove(int memberSequence) {
        HashMap<String, Integer> resultMap = new HashMap<>(String, Integer);
        return resultMap;
    }
}
