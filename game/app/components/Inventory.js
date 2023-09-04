import React from 'react'

export default function Inventory() {
  return (
    <>
    <button className='button' type='button'
    data-te-collapse-init
    data-te-target="#inventory-box"
    aria-expanded="false"
    aria-controls="inventory-box">INVENTORY</button>

    <div className='inventory-box' 
    id='inventory-box !visible hidden'
    data-te-collapse-item >
        <div className='inventory-list'>
            <ul>Item 1</ul>
            <ul>Item 2</ul>
            <ul>Item 3</ul>
        </div>

    </div>
    </>
  )
}
