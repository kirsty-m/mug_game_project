package com.muggame.mug.repositories;

import com.muggame.mug.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
