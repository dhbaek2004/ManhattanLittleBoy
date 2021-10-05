package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.service.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    /**
     * 질문 등록 FORM 띄우기
     * @return
     */
    @GetMapping("/form")
    public String form(HttpSession session){
        // TODO 세션추가 (회원UID, 상품UID)
        // 로그인 세션이 존재할경우
//        if(session.getAttribute("memberSequence") != null) {
//            return "qna/createform";
        // 세션 없을시 홈컨트롤러 작동
//        } else {return "redirect:/";}

        return "qna/createform";

    }

    /**
     * 질문 등록하기
     * @param form
     * @return
     */
    @PostMapping("/post")
    public ModelAndView postQuetions(QuestionForm form, HttpSession session) {
        // TODO 세션가져오기(아이템 고유번호, 회원고유번호)
        LocalDateTime currentDateTime = LocalDateTime.now();
        log.info("form 에서 넘어온 값 : " + form.getTitle());
        Question question = new Question();
        ModelAndView mv = new ModelAndView("qna/testView");

        // DB로 넘기기 작업
        question.setQuestionTitle(form.getTitle()); // 질문의 제목
        question.setQuestionContent(form.getContent()); // 질문의 내용
        question.setQuestionRegisterTime(currentDateTime); // 질문의 등록시간
        // question.setMemberSequence(session.getAttribute("memberSequence")); // 회원고유번호
        // question.setItem(session.getAttribute("itemSequence")); // 아이템 고유번호
        questionService.createQuestion(question); // 서비스로 보내보리기

        return mv; // 해당 상품의 상세화면을 보여주는 Form 있어야할듯

    }

    /**
     *
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String getListQuestions(HttpSession session,
                                   Model model) {
        List<Question> question = questionService.findQuestions();
        model.addAttribute("question", question);
        return "qna/test";
    }

}