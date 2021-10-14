package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.Item;
import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
    public final EntityManager em;

    public Item findOne(int itemSequence) {
        Item item = em.find(Item.class, itemSequence);
        return item;
    }

    public void save(Item item) {
        em.persist(item);
    }

    public int delete(Item item) {
        int itemSequence = item.getItemSequence();
        em.remove(item);

        return itemSequence;
    }

}
