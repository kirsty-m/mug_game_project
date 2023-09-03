"use client";
import CreatePlayer from "../components/CreatePlayer";

export default function newgame() {
  return (
    <main>
      <div className="create-player">
        <h2>This is where a new game starts!</h2>
        <CreatePlayer/>
        <form action='/play'>
          <input className='button' type='submit' value='START'/>
        </form>
      </div>
    </main>
  )
}
