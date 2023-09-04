"use client";

import { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";

export default function Page() {
  const [game, setGame] = useState({});
  // const [location, setLocation] = useState[{}];
  // const [dialogueOptions, setDialogueOptions] = useState[{}];
  // const [player, setPlayer] = useState[{}];
  // const [selectedDialogueOptions, setSelectedDialogueOptions] = useState[{}];

  useEffect(() => {
    getData();
  }, []);

  // useEffect(() => {
  //   setLocation(game.location);
  //   setDialogueOptions(game.dialogueOptions);
  //   setPlayer(game.player);
  //   setSelectedDialogueOptions(game.player.selectedDialogueOptions);
  // }, [game])

  const getData = () => {
    fetch("/api/games")
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        setGame(data);
      })
      .catch((error) => {
        console.error("Error fetching game data:", error);
      });
  };



  return (
    <div>
      <Narrative game={game} />
      <OptionList game={game} />
    </div>
  );
}
