package com.QuestionService.service;

import com.QuestionService.entity.Question;

import java.util.List;

public interface QuestionService {


    Question add (Question question);


    List<Question> getAll();


    Question getOne(Long id);

    List<Question>findByQuestionsOfQuiz(Long quizId);
}
