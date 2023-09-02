package com.muggame.mug.components;

import com.muggame.mug.models.DialogueOption;
import com.muggame.mug.models.Location;
import com.muggame.mug.models.Player;
import com.muggame.mug.models.User;
import com.muggame.mug.models.items.Item;
import com.muggame.mug.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    DialogueOptionRepository dialogueOptionRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        Location testLocation = new Location("Kitchen", "A shabby kitchen");
        locationRepository.save(testLocation);
        Player testPlayer = new Player("Yurtle");
        playerRepository.save(testPlayer);
        DialogueOption testDialogue = new DialogueOption( 2L, "Open your eyes", "You see nothing. The room is completely dark",  testLocation, null);
        dialogueOptionRepository.save(testDialogue);
        DialogueOption testDialogue2 = new DialogueOption(null, "Eat the sandwich", "You eat the sandwich", null, null);
        dialogueOptionRepository.save(testDialogue2);
        Item testItem = new Item("Mug", "Your mug, in all it's glory. It reads 'Allergic To Idiots'", testLocation, null);
        itemRepository.save(testItem);

        User testUser = new User("test@test.co", "testUser");
        userRepository.save(testUser);
    }
}
