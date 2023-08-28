package com.muggame.backend.repositories;

import com.muggame.backend.models.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Long> {

}
