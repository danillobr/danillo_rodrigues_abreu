package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.domain.TableGame;

public interface TableGameRepository extends JpaRepository<TableGame, Integer> {

}
