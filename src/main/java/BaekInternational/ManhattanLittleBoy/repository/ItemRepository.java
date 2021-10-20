package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.Item;
import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
    public final EntityManager em;

    public Item findOne(int itemSequence) {
        Item item = em.find(Item.class, itemSequence);
        return item;
    }

    public Item findOneByName(String name){
        Item item = em.createQuery("select i from Item i where i.itemName = :name",Item.class)
                .setParameter("name", name)
                .getSingleResult();

        return item;
    }

    public List<Item> findAll() {
        return em.createQuery("select i from Item i", Item.class)
                .getResultList();
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
