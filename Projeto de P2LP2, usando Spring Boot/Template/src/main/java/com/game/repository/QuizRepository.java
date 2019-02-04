package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.domain.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
