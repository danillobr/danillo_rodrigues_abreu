package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.domain.LogicGame;

public interface LogicGameRepository extends JpaRepository<LogicGame, Integer> {

}
