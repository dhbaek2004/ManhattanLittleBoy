package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
    private ReviewService reviewService;

    @GetMapping("/rev")
    public String list(Model model){
        // List<BoardDto> boardDtoList = boardService.getBoardList();
        // model.addAttribute("boardList", boardDtoList);
        return "list.html";
    }

}
