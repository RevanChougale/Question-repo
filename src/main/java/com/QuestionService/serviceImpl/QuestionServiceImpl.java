package com.QuestionService.serviceImpl;


import com.QuestionService.entity.Question;
import com.QuestionService.repository.QuestionRepo;
import com.QuestionService.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepo questionRepo;

    public QuestionServiceImpl(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Question add(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public List<Question> getAll() {
        return questionRepo.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepo.findById(id).orElseThrow(()->new RuntimeException("Id not found"));
    }

    @Override
    public List<Question> findByQuestionsOfQuiz(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }


}
