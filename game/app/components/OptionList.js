import React, { useState } from 'react';
import Link from 'next/link';

export default function OptionList({ games }) {
    const [selectedOption, selectOption] = useState(null);

    const handleOptionClick = (option) => {
        selectOption(option);
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
                <ul>{OptionsElements}</ul>
                {selectedOption && (
                    <div className="selected-option">
                        <p>{selectedOption.responseText}</p>
                    </div>
                )}
            </div>
        );
    }

    return <div>No games available.</div>;
}
