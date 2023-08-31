package com.muggame.mug;

import com.muggame.mug.models.DialogueOption;
import com.muggame.mug.models.items.Item;
import com.muggame.mug.models.Location;
import com.muggame.mug.models.Player;
import com.muggame.mug.repositories.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MugApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	DialogueOptionRepository dialogueOptionRepository;

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	PlayerRepository playerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createLocationAndDialogueOptionAndItemAndPlayer() {
		Location testLocation = new Location("Kitchen", "A shabby kitchen");
		locationRepository.save(testLocation);
		Player testPlayer = new Player("Yurtle");
		playerRepository.save(testPlayer);
		DialogueOption testDialogue = new DialogueOption( 2L, "Open your eyes", "You see nothing. The room is completely dark",  testLocation);
		dialogueOptionRepository.save(testDialogue);
		Item testItem = new Item("Mug", "Your mug, in all it's glory. It reads 'Allergic To Idiots'", testLocation);
		itemRepository.save(testItem);
	}

	@Test
	public void addItemToPlayerInventory(){
		Optional<Item> optionalItem = itemRepository.findById(1L);
		Optional<Player> optionalPlayer = playerRepository.findById(1L);
		if (optionalItem.isPresent() && optionalPlayer.isPresent()) {
			Player testPlayer = optionalPlayer.get();
			Item testItem = optionalItem.get();
			testPlayer.addToInventory(testItem);
			assertEquals(testItem, testPlayer.getInventory().get(0));
		}
	}


}
