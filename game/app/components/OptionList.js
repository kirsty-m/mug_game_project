import React from 'react'
import Link from 'next/link'

const options = {
    a: "A. Put the kettle on?",
    b: "B. Go to sleep?",
    c: "C. Flop on the couch and watch tv?"
}

export default function OptionList() {

    const OptionList = ({options}) => {
        if(options.length === 0){
            return null
        }
    }
// const OptionsElements = options.map((option, index) => {
//     return (
//         <li key={index}>
//             {options}
//         </li>
//     )

      
    

  return (
    <div className='options'>
        <a href='/play/result'>{options.a}</a>
        <a href='/play/result'>{options.b}</a>
        <a href='/play/result'>{options.c}</a>
        
    </div>
    
  )
}