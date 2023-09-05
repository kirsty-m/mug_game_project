import Link from "next/link"


export default function NavBar() {
  return (
    <nav>
        <Link className='button' href='/'>HOME</Link>
        <Link className='button' href='/newgame'>NEW GAME</Link>
    </nav>
  )
}
