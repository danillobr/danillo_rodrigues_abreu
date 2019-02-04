package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.domain.VideoGame;

public interface VideoGameRepository extends JpaRepository<VideoGame, Integer> {

}