package com.muggame.mug;

import com.muggame.mug.models.DialogueOption;
import com.muggame.mug.models.Location;
import com.muggame.mug.repositories.DialogueOptionRepository;
import com.muggame.mug.repositories.LocationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MugApplicationTests {

	@Autowired
	DialogueOptionRepository dialogueOptionRepository;

	@Autowired
	LocationRepository locationRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createLocationAndDialogueOption() {
		Location testLocation = new Location("Kitchen", "A shabby kitchen");
		locationRepository.save(testLocation);
		DialogueOption testDialogue = new DialogueOption( 2L, "You wake up in a dark room", testLocation);
		dialogueOptionRepository.save(testDialogue);
	}

//	@Test
//	public void createLocation() {
//		Location testLocation = new Location("kitchen", "A lovely kitchen");
//		locationRepository.save(testLocation);
//	}


}
