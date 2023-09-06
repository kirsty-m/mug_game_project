"use client";
import React, { useEffect, useState } from 'react';
import OptionList from './OptionList';

export default function Result({ selectedOption, games, showResultAndHideOptions, showResult }) {
  const [responseText, setResponseText] = useState('');
  const [showOptionsList, setShowOptionsList] = useState(false);

  useEffect(() => {
    if (selectedOption) {
      setResponseText(selectedOption.responseText);
    }
  }, [selectedOption]);

  const handleContinueClick = () => {
    setShowOptionsList(true);
  };

  return (
    <div>
      {!showOptionsList && responseText && <p>{responseText}</p>}
      {showOptionsList && <OptionList games={games}
          onResultSelected={showResultAndHideOptions}
          showResult={showResult} selectedOption={selectedOption} />}
      <button onClick={handleContinueClick}>Continue</button>
    </div>
  );
}
