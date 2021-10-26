package BaekInternational.ManhattanLittleBoy.service;

import BaekInternational.ManhattanLittleBoy.domain.Order;
import BaekInternational.ManhattanLittleBoy.repository.ItemRepository;
import BaekInternational.ManhattanLittleBoy.repository.MemberRepository;
import BaekInternational.ManhattanLittleBoy.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    final private ItemRepository itemRepository;
    final private OrderRepository orderRepository;
    final private MemberRepository memberRepository;

    private int order(int itemSequence, int memberSequence) {
        // 1. item 가져오기
        // 2. member 가져오기
        // 3. Form 에서 itemDetail 가져오기
        // 4. orderItemDetail 리스트 만들기
        // 5. 저장
        return 1;
    }

    private void cancelOrder(Order order) {
        order.cancelOrder();
    }

}
