package BaekInternational.ManhattanLittleBoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("index") //http://localhost:8080/hello
    public String hello(Model model){
        model.addAttribute("data","hello");

        return "index";
    }



}
