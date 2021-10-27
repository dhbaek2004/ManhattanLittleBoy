package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import BaekInternational.ManhattanLittleBoy.service.ItemService;
import BaekInternational.ManhattanLittleBoy.service.MemberService;
import BaekInternational.ManhattanLittleBoy.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ItemService itemService;
    private final MemberService memberService;

    public String 주문화면이동(int itemDetailSequence, int memberSequence, Model model) {


        return "";
    }


}
