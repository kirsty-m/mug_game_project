import React from 'react'
import Link from 'next/link'

export default function OptionList() {

    const OptionList = ({options}) => {
        if(options.length === 0){
            return null
        }

    const optionElements = options.map((option, index) => {
        return(
            <li key={index} className='individualOption'>
                <div>
                    <Option option={option}/>
                </div>
            </li>
        )
    })
      
    }

  return (
    <div className='choices'>
        <ul>
            <a href='/play' className='gameOption'>A. Put the kettle on?</a>
            <a href='/play' className='gameOption'>B. Go straight to bed?</a>
            <a href='/play' className='gameOption'>C. Watch tv all night on the couch?</a>
        </ul>
    </div>
  )
}
