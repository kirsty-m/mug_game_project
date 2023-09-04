import React from 'react'

export default function Inventory() {
  return (
    <>
    <button className='button' type="button"
  data-te-collapse-init
  data-te-target="#collapseWidthExample"
  data-te-ripple-init
  data-te-ripple-color="light"
  aria-expanded="false"
  aria-controls="collapseWidthExample">INVENTORY</button>

<div
  class="!visible hidden rounded-lg shadow-lg"
  data-te-collapse-item
  data-te-collapse-horizontal
  id="collapseWidthExample">
  <div
    class="inventory-list">
            <ul>Item 1</ul>
            <ul>Item 2</ul>
            <ul>Item 3</ul>
  </div>
</div>

    {/* <div className='inventory-box' 
    id='inventory-box !visible hidden'
    data-te-collapse-item >
        <div className='inventory-list'>

        </div>

    </div> */}
    </>
  )
}
