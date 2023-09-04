import React from 'react'

export default function Inventory() {
  return (
    <>
    <details className='inventory'>
        <summary className='button'>INVENTORY</summary>
        <div className="inventory-list"> 
            <ul className='inventory-item'>Item 1</ul>
            <ul className='inventory-item'>Item 2</ul>
            <ul className='inventory-item'>Item 3</ul>
        </div>
    </details>

    </>
  )
}
