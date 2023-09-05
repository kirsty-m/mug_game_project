"use client";

import { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";

export default function Page() {
  const [games, setGames] = useState([]);
  const [location, setLocation] = useState({});

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

  return (
    <div>
      <Narrative games={games} location={location} />
      <OptionList games={games} />
    </div>
  );
}
