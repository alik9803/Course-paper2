package com.example.Course.paper.Service;

import com.example.Course.paper.ExaminerService;
import com.example.Course.paper.Question;
import com.example.Course.paper.QuestionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public List<Question> getQuestions(int amount) {
        if (amount > questionService.getAllQuestions().size()) {
            throw new IllegalArgumentException("Requested amount exceeds available questions");
        }

        List<Question> questions = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}