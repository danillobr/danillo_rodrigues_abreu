package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.domain.BoardGame;

public interface BoardGameRepository extends JpaRepository<BoardGame, Integer> {

}
