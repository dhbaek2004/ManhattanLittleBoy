package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/questions")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // 질문 등록 FORM 띄우기
    @GetMapping("/form")
    public String form(){
        // TODO 세션추가 (회원UID, 상품UID)
        return "qna/createform";
    }

    // 질문 등록하기
    @PostMapping("/post")
    public void postQuetions(QuestionForm form) {
        Question question = new Question();


        System.out.println(form.getTitle());
    }



}
