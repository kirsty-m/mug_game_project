package com.muggame.mug.repositories;

import com.muggame.mug.models.DialogueOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DialogueOptionRepository extends JpaRepository<DialogueOption, Long> {

//    List<DialogueOption> findDialogueOptionsByLocation(Long location_id);



}
