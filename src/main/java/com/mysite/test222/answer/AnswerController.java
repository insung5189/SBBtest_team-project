package com.mysite.test222.answer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerRepository answerRepository;

    @GetMapping("/answer/list")
    public String list(Model model) {
        List<Answer> answerList = this.answerRepository.findAll();
        model.addAttribute("answerList", answerList);
        return "answer_list";
    }
}
