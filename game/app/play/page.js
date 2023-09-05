"use client";

import { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";
import Inventory from "../components/Inventory";
import AsciiImage from "../components/AsciiImage";

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
        <div className="left-side-col">
        <div className="image">
          <AsciiImage className='ascii-image'/>
        </div>
        <div className="collapsable-list">
          <Inventory game={game}/>
        </div>
        </div>
        <div className="game-area">
          <Narrative game={game} />
          <OptionList game={game} />
        </div>
    </div>
    
    </>
  );
}
