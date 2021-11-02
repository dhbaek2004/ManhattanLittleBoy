package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.BasketItem;
import BaekInternational.ManhattanLittleBoy.domain.Member;
import BaekInternational.ManhattanLittleBoy.repository.BasketRepository;
import BaekInternational.ManhattanLittleBoy.repository.ItemRepository;
import BaekInternational.ManhattanLittleBoy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketService {
    final private BasketRepository basketRepository;
    final private MemberRepository memberRepository;
    final private ItemRepository itemRepository;

    // 장바구니 아이템 추가 메서드
    public HashMap<String, Integer> addBasket(int memberSequence, int itemDetailSequence) {
        Member member = memberRepository.findMember(memberSequence);

        HashMap<String, Integer> resultMap = basketRepository.save(memberSequence, itemDetailSequence);
        return resultMap;
    }

    // 장바구니 특정 아이템 삭제 메서드
    public HashMap<String, Integer> removeBasketItem(int memberSequence, List<Integer> basketItemDetails ) {
        HashMap<String, Integer> resultMap = basketRepository.remove(memberSequence, basketItemDetails);
        return resultMap;
    }

    // 장바구니 아이템 업데이트 메서드
    public int updateBasketItem(int memberSequence) {
        return 0;
    }

    // 장바구니 아이템 모두 조회 메서드
    public List<BasketItem> getAllBasketItems(int memberSequence) {
        return basketRepository.findAllByMemberSequence(memberSequence);
    }
}

