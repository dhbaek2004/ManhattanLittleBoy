package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.controller.ItemUpdateForm;
import BaekInternational.ManhattanLittleBoy.domain.Item;
import BaekInternational.ManhattanLittleBoy.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class ItemServiceTest {

    @Autowired ItemService itemService;
    @Autowired ItemRepository itemRepository;
    @Autowired EntityManager em;

    @Test
    public void saveItem() {
        // given
        Item item = new Item();
        item.setItemName("말잘듣는매니저");

        // when
        int savedItemSequence = itemService.saveItem(item);

        // then
        assertEquals(savedItemSequence, item.getItemSequence());
    }

    @Test
    void validDuplicateName() throws IllegalStateException {
        // given
        Item item1 = new Item();
        item1.setItemName("말잘듣는 매니저");
        int itemId = itemService.saveItem(item1);

        Item item2 = new Item();
        item2.setItemName("말잘듣는 매니저");

        // then
        assertThrows(IllegalStateException.class, () -> {
            itemService.validDuplicateName(item2);
        });
    }

    @Test
    public void findItem() {
        // given
        Item item = new Item();
        item.setItemName("첫아이템");

        int id1 = itemService.saveItem(item);

        // when
        int id2 = itemService.findItem(id1).getItemSequence();

        // then
        assertEquals(id1, id2);
    }

    @Test
    public void deleteItem() {
        // given
        Item item = new Item();
        item.setItemName("지워질아이템");
        int seq1 = itemService.saveItem(item);

        // when
        int seq2 = itemService.deleteItem(item);

        // then
        assertEquals(seq1, seq2);
    }

    @Test
    public void updateItem() {
        // given
        Item item = new Item();
        item.setItemName("before");
        int id1 = itemService.saveItem(item);
        System.out.println("item1 name: " + item.getItemName());

        ItemUpdateForm itemUpdateForm = new ItemUpdateForm();
        itemUpdateForm.setNewItemName("after");

        // when
        Item newItem = itemService.updateItem(item, itemUpdateForm);

        // then
        System.out.println("item2 name: " + newItem.getItemName());
        assertEquals(item.getItemName(), itemService.findItem(id1).getItemName());
    }


    @Test
    void findItems() {
        // given
        Item item1 = new Item();
        Item item2 = new Item();

        em.persist(item1);
        em.persist(item2);

        // when
        List<Item> items = itemService.findItems();

        // then
        assertEquals(2, items.size());
    }
}