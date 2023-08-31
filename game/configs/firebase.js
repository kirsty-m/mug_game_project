

import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";

const firebaseConfig = {
    apiKey: "AIzaSyAEtUONjFaldylc8U90JjfeOT4i8qb4Vj4",
    authDomain: "fir-learning-87c57.firebaseapp.com",
    projectId: "fir-learning-87c57",
    storageBucket: "fir-learning-87c57.appspot.com",
    messagingSenderId: "857431457347",
    appId: "1:857431457347:web:d9ba46914da1e597901ef6",
    measurementId: "G-LVZ7P0P2FB"
};

const app = initializeApp(firebaseConfig);
const auth = getAuth();

export { auth };
