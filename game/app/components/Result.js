"use client";
import React, { useEffect, useState } from 'react';

export default function Result({ selectedOption }) {
  const [responseText, setResponseText] = useState('');

  useEffect(() => {
    if (selectedOption) {
      setResponseText(selectedOption.responseText);
    }
  }, [selectedOption]);

  return (
    <div className="result">
      {responseText && <p>{responseText}</p>}
      <button> Continue </button>
    </div>
  );
}
