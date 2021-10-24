import { useState } from "react";
import Title from './common/Title';

var lodash = require('lodash');

function LoginForm() {

    let formTitle = "Login Form";
    // variable that was created using useState() will be saved even after re-render.
    // if it was created "regular way" it will be restarted.
    const [name, setName] = useState(""); // setName() will force react to re-render.
    //const [email, setEmail] = useState("");
    //const [password, setPassword] = useState("");
    const [user, setUser] = useState({
        email: "",
        password: "",
        address: {
            city: ""
        },
        name: {
            firstName: {
                firstChar: ""
            }
        }
    });
    /*
    const displayNameButtonClick = e => {
        // not the react way...
        const nameValue = document.getElementById("nameInput").value;
        setName(nameValue);
    }
    */

    const performLogin = e => {
        console.log("Login button clicked!");
        console.log(user);
    }

    /*
    const changeNameValue = e => {
        // The react way.
        setName(e.target.value);
    }
    */


    /*
    const changeEmailValue = e => {
        //setEmail(e.target.value);
        setUser({
            email: e.target.value,
            password: user.password
        });
    }

    const changePasswordValue = e => {
        //setPassword(e.target.value);
        setUser({
            email: user.email,
            password: e.target.value
        });
    }
    */

    const updateUser = e => {
        /*
        const tempUser = {
            email: user.email,
            password: user.password
        };
        tempUser[e.target.name] = e.target.value
        */
        // learning spread operator:
        //const tempUser = { ...user, [e.target.name]: e.target.value };
        // trying with Lodash dependency. (library)
        const tempUser = lodash.set(user, e.target.name, e.target.value);
        setUser(tempUser);
    }



    return (    // jsx
        <div>
            <Title content={formTitle} lev="false" />
            <input type="email" name="email" onChange={updateUser} placeholder="Email" />
            <br />
            <input type="password" name="password" onChange={updateUser} placeholder="Password" />
            <br />
            <input type="text" name="address.city" onChange={updateUser} placeholder="city" />
            <br />
            <input type="text" name="name.firstName.firstChar" onChange={updateUser} placeholder="first character in first name" />
            <br />
            <button onClick={performLogin}>Login</button>
            <br />
            {name}
        </div>
    );
}

export default LoginForm;