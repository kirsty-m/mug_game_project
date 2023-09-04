import React from 'react';
import Link from 'next/link';

export default function OptionList({ games }) {
    console.log(games);


    if (games.length > 0 && games[0].location) {
        const location = games[0].location;


        const currentOptions = location.dialogueOptions.filter((dialogueOption) => {
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
    }


    return <div>No games available.</div>;
}
