package BaekInternational.ManhattanLittleBoy.controller;


import BaekInternational.ManhattanLittleBoy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;


    @GetMapping("/login")
    public String login(HttpSession session) {
        if(session.getAttribute("msg") == null || session.getAttribute("msg").equals("")) {
            return "login/index";
        } else {
            return "login/index";
        }
    }


}




