package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/member")
public class MemberController {
    private MemberRepository memberRepository;

    @GetMapping("/")
    public String join() {
        return "join";
    }


}
