import React from 'react'
import Image from 'next/image'
import yourhouse from '../static/yourhouse.svg'


export default function AsciiImage() {
  return (
    <>
    <div className='ascii-image-container'>
      <Image
      src={yourhouse}
      alt='ascii house'
      width={500}
      height={300}
      priority lazy 
      />
      <div>
        <p className='label'>HOUSE</p>
      </div>
    </div>
    </>
  )
}
