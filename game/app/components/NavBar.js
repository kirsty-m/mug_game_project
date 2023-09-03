import Link from "next/link"


export default function NavBar() {
  return (
    <nav>
        <h1>MUG QUEST</h1>
        <Link className='button' href='/'>HOME</Link>
        <Link className='button' href='/newgame'>NEW GAME</Link>
    </nav>
  )
}
