import React from 'react'
import { Collapse, initTE } from "tw-elements";
initTE({ Collapse });

export default function Inventory() {


// const collapseElementList = [].slice.call(document.querySelectorAll('[data-te-collapse-item]'))
// const collapseList = collapseElementList.map((collapseEl) => {
//   return new te.Collapse(collapseEl, {
//     toggle: false,
//   });
// });

return (
    <>
        <details className="collapse bg-base-200">
            <summary className="collapse-title text-xl font-medium">Click to open/close</summary>
                <div className="collapse-content"> 
                    <p>content</p>
                </div>
        </details>
    </>

)
}
//     <>
//     <button className='button' type="button"
//   data-te-collapse-init
//   data-te-target="#collapseWidthExample"
//   data-te-ripple-init
//   data-te-ripple-color="light"
//   aria-expanded="false"
//   aria-controls="collapseWidthExample">INVENTORY</button>

// <div
//   class="!visible hidden rounded-lg shadow-lg"
//   data-te-collapse-item
//   data-te-collapse-horizontal
//   id="collapseWidthExample">
//   <div
//     class="inventory-list">
//             <ul>Item 1</ul>
//             <ul>Item 2</ul>
//             <ul>Item 3</ul>
//   </div>
// </div>

//     {/* <div className='inventory-box' 
//     id='inventory-box !visible hidden'
//     data-te-collapse-item >
//         <div className='inventory-list'>

//         </div>

//     </div> */}
//     </>
//   )
// 
