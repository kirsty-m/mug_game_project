import Link from "next/link"


export default function NavBar() {
  return (
    <nav>
        <Link className='nav-button' href='/'>HOME</Link>
        <Link className='nav-button' href='/newgame'>NEW GAME</Link>
        <button className="nav-button">LOAD GAME</button>
        <button className="nav-button">SAVE</button>
    </nav>
  )
}
