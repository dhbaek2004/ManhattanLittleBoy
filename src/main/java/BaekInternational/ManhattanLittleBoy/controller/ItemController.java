package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.Item;
import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import BaekInternational.ManhattanLittleBoy.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    // 메인 화면에 있는 상품 중, 상품 상세 화면을 보여주는 메서드
    @GetMapping("/items/{itemSequence}")
    public String 상품상세보여주기(@PathVariable int itemSequence, Model model) {
        Item item = itemService.findItem(itemSequence);
        model.addAttribute("item", item);

        return "items/itemDetail";
    }

    // 아이템 등록 화면 이동 메서드
    @GetMapping("/item/new")
    public String 아이템등록화면이동 (Model model) {

        return "";
    }

    // 아이템 등록 메서드, POST
     @PostMapping("/items/new")
     public String 아이템저장(Model model, ItemForm itemForm) {

        return "아이템등록화면";
     }

     // 아이템 수정 화면 이동 메서드, GET
    @GetMapping("item/update")
    public String 아이템수정화면이동(Model model) {
        return "아이템수정화면";
    }

    // 아이템 수정 저장 메서드, POST
    @PostMapping("item/update")
    public String 아이템수정사항저장(Model model, ItemForm itemForm) {
        return "아이템목록";
    }

    // 아이템 삭제 메서드
    @GetMapping("item/remove")
    public String 아이템삭제(Model model) {
        return "아이템삭제";
    }




}
