"use client";
import React, { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";

import Inventory from "../components/Inventory";
import AsciiImage from "../components/AsciiImage";
import Result from "../components/Result";


export default function Page() {
  const [games, setGames] = useState([]);
  const [location, setLocation] = useState({});
  const [showResult, setShowResult] = useState(false);
  const [selectedOption, setSelectedOption] = useState(null);

  useEffect(() => {
    getData();
  }, []);

  const getData = () => {
    fetch("/api/games")
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        setGames(data);
        setLocation(data[0]?.location || {});
      })
      .catch((error) => {
        console.error("Error fetching game data:", error);
      });
  };

  const showResultAndHideOptions = (option) => {
    setSelectedOption(option);
    setShowResult(true);
  };

  return (
    <div className="main-container">
        <div className="left-side-col">
          <div className="image">
            <AsciiImage className='ascii-image'/>
          </div>
        <div className="collapsable-list">
          <Inventory games={games}/>
        </div>
        </div>

      <div className="game-area">
      {/* <Narrative games={games} location={location} /> */}
      {!showResult && (
        <OptionList
          games={games}
          onResultSelected={showResultAndHideOptions}
          showResult={showResult}
        />
      )}
      {showResult && <Result selectedOption={selectedOption} />}
      </div>
    </div>


  
  )
};