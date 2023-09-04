
"use client";
import Inventory from "../components/Inventory";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";


export default function page() {
  return (
    <>
    <div>
        <Narrative/>
        <OptionList/>
    </div>
    <div>
      <Inventory/>
    </div>
    </>
  )
}
