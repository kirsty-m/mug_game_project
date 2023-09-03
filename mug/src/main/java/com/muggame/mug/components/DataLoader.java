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

import java.awt.*;

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

        Location firstLocation = new Location("Home",
                "Dropping your work bag onto the floor, as you step into your cosy apartment, you give a sigh of relief. Today has been a long day. " +
                        "You pop on the kettle and settle yourself on the couch. The new season of Stranger Things is out and you’re excited to get stuck in. \n" +
                "\n" +
                "Upon entering your cosy apartment, a sigh of relief escapes you as you drop your work bag on the floor. " +
                        "The day has felt incredibly long. Switching on the kettle and making yourself comfortable on the couch, you anticipate diving into the newly released season of Stranger Things.\n" +
                "\n" +
                "As the gentle click of the kettle resonates, the show’s theme music fills the room. " +
                        "The recollection that your mug rests within your work bag nudges you off the couch, propelling you towards the front door. With a careful unzip, the abrupt realisation hits that the mug remains abandoned at the office. " +
                        "The hour-and-a-half commute, which easily stretches to two and a half hours due to traffic, does not phase you in the slightest. Abandoning the television's glow and the boiled kettle, you venture out. Retrieving the mug is paramount.");
        DialogueOption firstLocationOption1 = new DialogueOption(2L, "What do you want to get?", "The mug",firstLocation, null );
        DialogueOption firstLocationOption2 = new DialogueOption(3L, "What do you want to get?", "The mug",firstLocation, null );
        DialogueOption firstLocationOption3 = new DialogueOption(4L, "What do you want to get?", "The mug",firstLocation, null );


        Location secondLocation = new Location("Car",
                "Rain patters against your car’s windshield, almost rhythmically, as scarlet clouds weep freshwater tears. " +
                        "These slide down the glass in muddy channels, eventually joining together to form temporary pools on the sill. " +
                        "Gradually, the city draws further and further away until its polluting light no longer stains the night sky. " +
                        "The office is not far, now. ");
        DialogueOption secondLocationOption1 = new DialogueOption(5L, "What do you think about", "The mug",secondLocation, null );
        DialogueOption secondLocationOption2 = new DialogueOption(6L, "What do you think about", "The mug",secondLocation, null );
        DialogueOption secondLocationOption3 = new DialogueOption(7L, "What do you think about", "The mug",secondLocation, null );


        Location thirdLocation = new Location("The Office Car Park", "After a considerable spell of driving, your journey reaches its conclusion as you pull into the office parking area. " +
                "The cold outside prompts a juxtaposition between your body's warmth and the cold windshield, drawing a foggy veil. " +
                "Armed with purposeful resolve, you exit your vehicle and stride toward the entrance to your office." +
                " As you walk beneath the office canopy, your attention is seized by the presence of a tall figure stationed outside the front door. " +
                "The ember of a cigarette casts a celestial illumination, revealing a pale visage, marked by dramatic signs of weariness. " +
                "Though resembling Jim, the security guard, there is an almost caricatured distortion within his features, rendering him a haunting parody of his usual self. " +
                "“A bit early for work, are you not? Come back in the morning, once you’ve had a good night’s rest,” Jim remarks with a chilly undertone.");
        DialogueOption thirdLocationOption1 = new DialogueOption(8L, "Think about it. Do you:", "A: Articulate your precise intentions to Jim; inform him that you wish to retrieve your mug and depart promptly." +
                " This matter need only involve the two of you.",thirdLocation, null );
        DialogueOption thirdLocationOption2 = new DialogueOption(9L, "Think about it. Do you:", "B: Falsely assert that two teenagers are vandalising the entrance to the car park." +
                " Whilst he investigates, you will sneak into the office, using your own key.",thirdLocation, null );
        DialogueOption thirdLocationOption3 = new DialogueOption(10L, "Think about it. Do you:", "C: Display the impressive expanse of your biceps, " +
                "remarking that you’d rather not harm an ‘old man’. That’ll scare him off.",thirdLocation, null );




    }
}


//    Location firstLocation = new Location("Kitchen", "A shabby kitchen");
//        locationRepository.save(firstLocation);
//        Player testPlayer = new Player("Yurtle");
//        playerRepository.save(testPlayer);
//        DialogueOption testDialogue = new DialogueOption( 2L, "Open your eyes", "You see nothing. The room is completely dark",  testLocation, null);
//        dialogueOptionRepository.save(testDialogue);
//        DialogueOption testDialogue2 = new DialogueOption(null, "Eat the sandwich", "You eat the sandwich", null, null);
//        dialogueOptionRepository.save(testDialogue2);
//        Item testItem = new Item("Mug", "Your mug, in all it's glory. It reads 'Allergic To Idiots'", testLocation, null);
//        itemRepository.save(testItem);
//
//        User testUser = new User("test@test.co", "testUser");
//        userRepository.save(testUser);
