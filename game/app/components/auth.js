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
        } catch (err) {
            console.error("Error creating user:", err.message);
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
        <div>
            <input placeholder="email" onChange={(e) => setEmail(e.target.value)} />
            <input placeholder="password" type="password" onChange={(e) => setPassword(e.target.value)} />
            <button onClick={createUser}>Sign Up</button>
            <button onClick ={login}> Log In</button>

            
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
