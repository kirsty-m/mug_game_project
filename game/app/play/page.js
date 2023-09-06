"use client";
import React, { useEffect, useState } from "react";
import Narrative from "../components/Narrative";
import OptionList from "../components/OptionList";
import Inventory from "../components/Inventory";
import AsciiImage from "../components/AsciiImage";
import Result from "../components/Result";
import { Auth } from "../components/auth";
import { createUserWithEmailAndPassword,signInWithEmailAndPassword, signOut } from 'firebase/auth';
import { auth } from "configs/firebase";


export default function Page() {
  
  const [userEmail, setUserEmail] = useState("");
  const [user, setUser] = useState({})
  const [userx, setUserx] = useState({});
  const [games, setGames] = useState({});
  const [location, setLocation] = useState({});
  const [dialogueOptions, setDialogueOptions] = useState([])
  const [narrative, setNarrative] = useState("")
  const [showResult, setShowResult] = useState(false);
  const [selectedOption, setSelectedOption] = useState(null);

  useEffect(() => {
    getData();
  }, []);

  useEffect(() => {
    getUser();
  }, [userEmail])

  const refresh = auth.onAuthStateChanged(user => {
    setUser(user);
});

  const getUser = () => {
    fetch(`/api/users?email=${userEmail}`)
    .then((response) => {
      return response.json();
    })
    .then((data) => {
      console.log(data);
      setUserx(data);
    })
    .catch((error) => {
      console.error("Error fetching user", error);
    })
  }

  const getData = () => {
    fetch("/api/games")
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        setGames(data);
        setLocation(data[user.id]?.location || {});
      })
      .catch((error) => {
        console.error("Error fetching game data:", error);
      });
  };

  const showResultAndHideOptions = (option) => {
    setSelectedOption(option);
    setShowResult(true);
  };

  const logout = async () => {
    try {
        await signOut(auth)
        .then(window.location.reload())
        setUserEmail("");
    } catch (err) {
        console.error("Error logging out:", err.message);
    }
};

useEffect(() => {
  const refresh = auth.onAuthStateChanged(user => {
      setUser(user);
  });

  return () => {
      refresh();
  };
}, []);

useEffect(() => {
  if (user != undefined) {
    console.log(user.email)
  setUserEmail(user.email); }

}, [user])


const createUser = async () => {
  try {
      await createUserWithEmailAndPassword(auth, email, password);

      const response = await fetch('http://localhost:8080/api/users', {
          method: 'POST',
          headers: {
              'Content-Type': 'application/json',
          },
          body: JSON.stringify({ emailAddress: email }),
      }); 

      if (response.ok) {
          console.log('User created and saved in the database.');
      } else {
          console.error('Error saving user in the database.');
      }
  } catch (err) {
      console.error('Error creating user:', err.message);
  }
};


const login = async () => {
  try {
      await signInWithEmailAndPassword(auth, email, password);
  } catch (err) {
      console.error("Error logging in:", err.message);
  }
};

  
  if (!userx.id) {
    return <Auth setUserEmail={setUserEmail} logout={logout} createUser = {createUser} login={login} />
  }
    else {

  return (
    <div className="main-container">
      <div>
            <Auth setUserEmail={setUserEmail} logout={logout} createUser = {createUser} login={login} />
        </div>
        <div className="left-side-col">
          <div className="image">
            <AsciiImage className='ascii-image'/>
          </div>
        <div className="collapsable-list">
          <Inventory game = {games}/>
        </div>
        </div>

      <div className="game-area">
      <Narrative location={location} game = {games} />
      {!showResult && (
        <OptionList
          game={games}
          onResultSelected={showResultAndHideOptions}
          showResult={showResult}
        />
      )}
      {showResult && <Result selectedOption={selectedOption} />}
      </div>
    </div>


  
  ) }
};