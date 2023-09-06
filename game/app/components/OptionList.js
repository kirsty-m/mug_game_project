"use client";
import React, { useState } from 'react';
import Result from './Result';

import Narrative from './Narrative';


export default function OptionList({ game, onResultSelected, setShowDescription, showResult }) {
    const [selectedOption, setSelectedOption] = useState(null);



    const handleOptionClick = (option) => {
        setSelectedOption(option);
        onResultSelected(option);
    };


    if (games.location) {
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
            <div>
                <Narrative
                    game={game}
                    location={location}
                />
                {!showResult && (
                    <ul>{OptionsElements}</ul>
                )}
                {showResult && <Result games={games} selectedOption={selectedOption}/>}
            </div>
        );
    }

    return <div>No game available.</div>;
}