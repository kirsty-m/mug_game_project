"use client";
import React, { useState } from 'react';
import Result from './Result';

export default function OptionList({ games, onResultSelected }) {
  const [selectedOption, setSelectedOption] = useState(null);

  const handleOptionClick = (option) => {
    setSelectedOption(option);
    onResultSelected(option); 
  };

  if (games.length > 0 && games[0].location) {
    const location = games[0].location;

    const currentOptions = location.dialogueOptions.filter((dialogueOption) => {
      return !dialogueOption.previousId;
    });

    const OptionsElements = currentOptions.map((option, index) => (
      <li key={index}>
        <button onClick={() => handleOptionClick(option)}>
          {option.dialogue}
        </button>
      </li>
    ));

    return (
      <div className="options">
        <ul className='option'>{OptionsElements}</ul>
        <Result selectedOption={selectedOption} /> {/* Pass the selected option here */}
      </div>
    );
  }

  return <div>No games available.</div>;

}