import React, { useState, useEffect } from 'react';
import { auth } from "configs/firebase";
import { createUserWithEmailAndPassword,signInWithEmailAndPassword, signOut } from 'firebase/auth';


export const Auth = () => {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [user, setUser] = useState(auth.currentUser);

    useEffect(() => {
        const refresh = auth.onAuthStateChanged(user => {
            setUser(user);
        });

        return () => {
            refresh();
        };
    }, []);

    if (auth.currentUser != undefined) {
    console.log(auth.currentUser.email);}

    const createUser = async () => {
        try {
            await createUserWithEmailAndPassword(auth, email, password);
    
            const response = await fetch('http://localhost:8080/api/users', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ emailAddress: email, username: 'User Name' }),
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

    const logout = async () => {
        try {
            await signOut(auth);
        } catch (err) {
            console.error("Error logging out:", err.message);
        }
    };
    if (!user) {
    return (
        <div className='sign-in'>
            <p>Email:</p>
            <input onChange={(e) => setEmail(e.target.value)} />
            <p>Password:</p>
            <input type="password" onChange={(e) => setPassword(e.target.value)} />
            <div className='sign-in-buttons'>
            <button className='button'onClick={createUser}>Sign Up</button>
            <button className='button'onClick ={login}> Log In</button>
            </div>
            
        </div>
    );
    }
    else{
        return(
        <div>
            <button onClick={logout}>Log Out</button>
        </div>
        )
    }
};
