package com.quiz.services;

import java.util.List;

import com.quiz.entity.Quiz;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	List<Quiz> get();
	Quiz get(Long id);

}
