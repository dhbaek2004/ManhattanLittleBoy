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
    public String signIn(String inputId, String inputPw) {
        log.info("id : {} , pw : {}", inputId, inputPw);
        MemberRepository memberRepository = this.memberRepository.findMember(inputId, inputPw);
        if(memberRepository != null) {
            return "auth/loginOk";
        }
        return "auth/loginFail";
    }


}


    
