package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import BaekInternational.ManhattanLittleBoy.service.ItemService;
import BaekInternational.ManhattanLittleBoy.service.MemberService;
import BaekInternational.ManhattanLittleBoy.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ItemService itemService;
    private final MemberService memberService;

    // 장바구니화면에서 주문버튼클릭
    @GetMapping("/order")
    public String 주문화면이동1(Model model) {
        return "주문화면으로이동";
    }

    // 아이템상세화면에서 주문버튼 클릭
    @GetMapping("/order/itemdetail")
    public String 주문화면이동2(Model model) {
        return "주문화면으로이동";
    }


    //

}
