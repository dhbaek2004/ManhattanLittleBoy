package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.controller.ItemForm;
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
}
