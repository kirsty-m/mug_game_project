"use client";
import { Auth } from './components/auth'
import Image from 'next/image';
import mug from './static/mug.svg'
import mugquest from './static/mugquest.svg'

export default function Home() {
  return (
    <div className='home-page'>
      <Auth/>
      <div className='hero'>
        <div className='mug-quest'>
        <Image
          src={mug}
          alt='ascii mug'
          width={500}
          height={300}
          priority lazy 
        />
        <Image
          src={mugquest}
          alt='ascii mug quest'
          width={500}
          height={200}
          priority lazy
        />
        </div>
      </div>
    </div>
  )
}
