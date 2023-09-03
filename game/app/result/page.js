import React from 'react'
import Link from 'next/link'
import Result from '../components/Result'

export default function page() {
  return (
    <div className='result-view'>
      <Result className='result'/>
      
      <Link className='button' href='/play'>CONTINUE</Link>
    </div>
  )
}
