import React from 'react'

export default function Inventory() {
  return (
    <>
    <details className='inventory'>
        <summary className='button'>INVENTORY</summary>
        <div className="inventory-list"> 
            <ul>Item 1</ul>
            <ul>Item 2</ul>
            <ul>Item 3</ul>
        </div>
    </details>

    </>
  )
}
