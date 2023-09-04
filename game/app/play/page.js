
"use client";

import { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";


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
        <Narrative game = {game}/>
        <OptionList game={game}/>
    </div>
  )
}
