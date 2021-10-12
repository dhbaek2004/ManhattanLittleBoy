package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
    public final EntityManager em;

    public ItemDetail findOne(int itemSequence) {
        ItemDetail itemDetail = em.find(ItemDetail.class, itemSequence);

        return itemDetail;
    }
}
