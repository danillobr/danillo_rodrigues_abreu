package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.domain.MemoryGame;

public interface MemoryGameRepository extends JpaRepository<MemoryGame, Integer> {

}
