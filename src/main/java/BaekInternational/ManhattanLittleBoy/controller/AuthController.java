package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.Member;
import BaekInternational.ManhattanLittleBoy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/auth")
public class AuthController {

    private MemberRepository memberRepository;

    @GetMapping("/login")
    public String join() {
        return "auth/login";
    }

    @PostMapping("/signIn")
    public String signIn(String inputEmail, String inputPassword) {
        log.info("id : {} , pw : {}", inputEmail, inputPassword);
        MemberRepository memberRepository = this.memberRepository.findMember(inputEmail, inputPassword);
        if(memberRepository != null) {
            return "auth/loginOK";
        }
        return "auth/loginFail";
    }



    

}
