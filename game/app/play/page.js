"use client";

import React, { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";
import Result from "../components/Result";

export default function Page() {
  const [games, setGames] = useState([]);
  const [location, setLocation] = useState({});
  const [showResult, setShowResult] = useState(false);
  const [selectedOption, setSelectedOption] = useState(null); // Define selectedOption here

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
    <div>
      <Narrative games={games} location={location} />
      {!showResult && (
        <OptionList games={games} onResultSelected={showResultAndHideOptions} />
      )}
      {showResult && <Result selectedOption={selectedOption} />}
    </div>
  );
}