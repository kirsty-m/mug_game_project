"use client";
import { useEffect, useState } from "react";
import Narrative from "../components/gameplay/Narrative";
import OptionList from "../components/gameplay/OptionList";

export default function page() {

  const [game, setGame] = useState("")

  useEffect(() => {
    const request = new Request();
    const gamePromise = request.get('/api/games')

    Promise.all([gamePromise])
    .then((data) => {
      setGame(data[0])
    })
  }, [])



  return (
    <div>
        <Narrative/>
        <OptionList/>
    </div>
  )
}
