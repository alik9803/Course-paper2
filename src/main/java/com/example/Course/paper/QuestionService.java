package com.example.Course.paper;

import java.util.List;

public interface QuestionService {
    void addQuestion(Question question);

    void removeQuestion(Question question);

    List<Question> getAllQuestions();

    Question getRandomQuestion();
}