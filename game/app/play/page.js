"use client";

import { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";
import Inventory from "../components/Inventory";

export default function Page() {
  const [game, setGame] = useState({});

  useEffect(() => {
    getData();
  }, []);

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
    <>
    <div className="main-container">
        <div className="collapsable-list">
          <Inventory game={game}/>
        </div>
        <div className="game-area">
          <Narrative game={game} />
          <OptionList game={game} />
        </div>
    </div>
    
    </>
  );
}
