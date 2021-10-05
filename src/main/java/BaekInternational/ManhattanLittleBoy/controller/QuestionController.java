package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.service.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    // 질문 등록 FORM 띄우기
    @GetMapping("/form")
    public String form(){
        // TODO 세션추가 (회원UID, 상품UID)
        return "qna/createform";
    }

    // create Question
    @PostMapping("/post")
    public String postQuetions(QuestionForm form) {
        Question question = new Question();
        question.setQuestionTitle(form.getTitle());
        // TODO 세션, 글내용 가져오기
        questionService.createQuestion(question);
        log.info("form 에서 넘어온 값 : " + form.getTitle());
        return "redirect:/";

    }



}
