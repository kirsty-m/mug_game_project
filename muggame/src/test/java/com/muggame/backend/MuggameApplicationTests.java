package com.muggame.backend;

import com.muggame.backend.models.PlayerCharacter;
import com.muggame.backend.repositories.PlayerCharacterRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MuggameApplicationTests {

	@Autowired
	PlayerCharacterRepository playerCharacterRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPlayerCharacter() {
		PlayerCharacter testChar = new PlayerCharacter("MacGuffin");
		playerCharacterRepository.save(testChar);
	}
}
