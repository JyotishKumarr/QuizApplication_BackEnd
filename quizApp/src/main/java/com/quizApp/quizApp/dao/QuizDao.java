package com.quizApp.quizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizApp.quizApp.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
