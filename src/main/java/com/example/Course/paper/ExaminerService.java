package com.example.Course.paper;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount);
}