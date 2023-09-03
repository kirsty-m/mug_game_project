import React, { useState } from 'react';

export default function CreatePlayer() {
  const [playerName, setPlayerName] = useState('');

  const handlePlayerNameChange = (e) => {
    setPlayerName(e.target.value);
  };

  const createPlayer = async () => {
    try {
      const response = await fetch('http://localhost:8080/api/players', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ name: playerName }),
      });
  
      if (response.ok) {
        console.log('Player created successfully.');
      } else {
        const errorData = await response.json(); 
        console.error('Error creating player:', errorData);
      }
    } catch (err) {
      console.error('Error creating player:', err);
    }
  };
  

  return (
    <div className='characterQuestions'>
      <h4>Enter Player Name:</h4>
      <input
        type="text"
        value={playerName}
        onChange={handlePlayerNameChange}
      />
      <button className='button'onClick={createPlayer}>Create Player</button>
    </div>
  );
}
