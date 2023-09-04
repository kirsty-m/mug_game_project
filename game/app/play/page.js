"use client";

import { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";

export default function Page() {
  const [games, setGames] = useState([]);
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
        setGames(data);
      })
      .catch((error) => {
        console.error("Error fetching game data:", error);
      });
  };



  return (
    <div>
        <Narrative games = {games}/>
        <OptionList games ={games}/>
    </div>
  );
}
