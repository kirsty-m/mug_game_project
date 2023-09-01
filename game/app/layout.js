import './globals.css'
import { Roboto_Mono } from 'next/font/google'
import NavBar from './components/NavBar'

const robotoMono = Roboto_Mono({ subsets: ['latin'] })


export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <body className={robotoMono.className}>
        <NavBar className='nav'/>
        {children}
      </body>
    </html>
  )
}
