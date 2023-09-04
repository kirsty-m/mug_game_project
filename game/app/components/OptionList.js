
import React from 'react';
import Link from 'next/link';



export default function OptionList({ game }) {

    

    const currentOptions = game.location.dialogueOptions.filter((dialogueOption) => {
        return !dialogueOption.previousId;
    });


    const OptionsElements = currentOptions.map((option, index) => (
        <li key={index}>
            <Link href="/play">{option.dialogue}</Link>
        </li>
    ));

    return (
        <div className="options">
            <ul>{OptionsElements}</ul>
        </div>
    );

  };





  // const OptionsElements = options.map((option, index) => {
  //     return (
  //         <li key={index}>
  //             {options}
  //         </li>
  //     )

  return (
    <div className="options">
      <a href="/result">{options.a}</a>
      <a href="/result">{options.b}</a>
      <a href="/result">{options.c}</a>
    </div>
  );
}
