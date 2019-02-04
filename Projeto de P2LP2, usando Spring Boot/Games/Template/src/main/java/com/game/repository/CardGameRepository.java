package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.domain.CardGame;

public interface CardGameRepository extends JpaRepository<CardGame, Integer> {

}
