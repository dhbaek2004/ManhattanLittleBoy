package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import BaekInternational.ManhattanLittleBoy.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
    final private ItemRepository itemRepository;

    public ItemDetail findItemDetail(int itemSequence) {
        ItemDetail itemDetail = itemRepository.findOne(itemSequence);

        return itemDetail;

    }
}
