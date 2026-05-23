package com.QuestionService.Controller;

import com.QuestionService.entity.Question;
import com.QuestionService.serviceImpl.QuestionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {



    private  QuestionServiceImpl questionServiceImpl;

    public QuestionController(QuestionServiceImpl questionServiceImpl) {
        this.questionServiceImpl = questionServiceImpl;
    }


    @PostMapping
    public Question save(@RequestBody Question question){
        return questionServiceImpl.add(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionServiceImpl.getAll();
    }


    @PostMapping("/{id}")
    public Question getOne(@PathVariable Long id){
        return questionServiceImpl.getOne(id);
    }


    @GetMapping("/quiz/{quizId}")
    public List<Question> questionsOfQuiz(@PathVariable Long quizId){
        return questionServiceImpl.findByQuestionsOfQuiz(quizId);
    }
}
