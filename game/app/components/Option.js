import React from 'react'

export default function Option() {

    // const Option = ({option}) => {
    //     if(!option){
    //         return null
    //     }
    
  return (
    <div>
        <ul>
            <Link className='gameOption'>A. Put the kettle on?</Link>
            <Link className='gameOption'>B. Go straight to bed?</Link>
            <Link className='gameOption'>C. Watch tv all night on the couch?</Link>
        </ul>
    </div>
  )
}

