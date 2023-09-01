import Link from "next/link"


export default function NavBar() {
  return (
    <nav>
        <h1>MUG QUEST</h1>
        <Link href='/'>HOME</Link>
        <Link href='/newgame'>NEW GAME</Link>
    </nav>
  )
}
