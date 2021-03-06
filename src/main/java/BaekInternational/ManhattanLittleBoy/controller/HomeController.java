package BaekInternational.ManhattanLittleBoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // 리스트로 보여주는 함수로 바꿔야함(경석)
    @GetMapping("/") // http://localhost:8080
    public String mainHome(Model model){
        model.addAttribute("data","hello");
        return "index";
    }
}
