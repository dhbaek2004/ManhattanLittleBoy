package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.controller.ItemForm;
import BaekInternational.ManhattanLittleBoy.controller.ItemUpdateForm;
import BaekInternational.ManhattanLittleBoy.domain.Item;
import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import BaekInternational.ManhattanLittleBoy.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
    final private ItemRepository itemRepository;

    public Item findItem(int itemSequence) {
        Item item = itemRepository.findOne(itemSequence);

        return item;
    }

    public int saveItem(Item item) {
        itemRepository.save(item);

        return item.getItemSequence();
    }

    public void validDuplicateName(Item item) {
        Item findItem = itemRepository.findOne(item.getItemSequence());
        if (findItem == null) {
            throw new IllegalStateException("이미 존재하는 아이템입니다");
        }
    }

    public int deleteItem(Item item) {
        int itemSequence = itemRepository.delete(item);

        return itemSequence;
    }

    public Item updateItem(Item item, ItemUpdateForm itemUpdateForm) {
        item.setItemName(itemUpdateForm.getNewItemName());

        return item;
    }
}
