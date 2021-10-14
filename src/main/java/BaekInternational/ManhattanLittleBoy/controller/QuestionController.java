package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.Question;
import BaekInternational.ManhattanLittleBoy.service.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
//    @PostMapping("/post")
//    public ModelAndView postQuetions(QuestionForm form, HttpSession session) {
//        // TODO 세션가져오기(아이템 고유번호, 회원고유번호)
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        log.info("form 에서 넘어온 값 : " + form.getTitle());
//        Question question = new Question();
//        ModelAndView mv = new ModelAndView("qna/testView");
//
//        // DB로 넘기기 작업
//        question.setQuestionTitle(form.getTitle()); // 질문의 제목
//        question.setQuestionContent(form.getContent()); // 질문의 내용
//        question.setQuestionRegisterTime(currentDateTime); // 질문의 등록시간
//
//        // question.setMemberSequence(session.getAttribute("memberSequence")); // 회원고유번호
//        // question.setItem(session.getAttribute("itemSequence")); // 아이템 고유번호
//        questionService.createQuestion(question); // 서비스로 보내보리기
//
//        return mv; // 해당 상품의 상세화면을 보여주는 Form 있어야할듯
//
//    }

    /**
     * 해당 상품에대한 질문 리스트
     * ItemController에 합쳐질 예정
     * @param session
     * @param model
     * @return
     */
//    @GetMapping("/list")
//    public String getListQuestions(HttpSession session,
//                                   Model model) {
//        Question question = new Question();
//        // TODO 세션에서 해당 상품의 번호를 가져와야함
//        // int itemSequence = ((Integer)(session.getAttribute("itemSequence"))).intValue(); // 상품 시퀀스넘버
//        List<Question> questionList = questionService.findAllQuestions();
//        // List<Question> questionList = questionService.findBySeq(1);
//        model.addAttribute("questionList", questionList);
//        return "qna/list";
//    }

    // TODO 질문 삭제기능
    // 해당 유저가 맞는지 확인, 세션에서 해당 질문seq 가져오기
    @PostMapping("/delete")
    public String delete(int id) {
        questionService.deletePost(id);
        return "redirect:/";
    }


    // TODO 질문에 대한 답변기능




    // TODO 질문 수정기능


}