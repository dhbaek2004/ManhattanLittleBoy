package BaekInternational.ManhattanLittleBoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BasketController {

    // 장바구니 화면으로 이동하는 메서드, GET
    @PostMapping("/basket")
    public String 장바구니추가버튼클릭 (Model model) {
        return "";
    }

    // 장바구니 비우기 버튼 클릭했을 때 요청 처리, GET?
    @GetMapping("/basket/clear")
    public String 장바구니비우기버튼클릭(Model model) {

        return "";
    }

    // 장바구니 항목 제거 메서드
    @GetMapping("/basket/remove")
    public int 장바구니제거버튼클릭(Model model) {
        return 0;
    }


}
