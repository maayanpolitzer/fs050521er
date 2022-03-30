import { useState } from "react";
import axios from "axios";

import "./Form.css";

const Form = () => {
  const [user, setUser] = useState({
    email: "",
    password: "",
    firstName: "",
    lastName: "",
  });

  const onInputChange = (event) => {
    setUser({ ...user, [event.target.name]: event.target.value });
  };

  const createNewUser = (event) => {
    // http POST request with user data.
    event.preventDefault();
    axios
      .post("/users2", user)
      .then((response) => {
        console.log("success");
        console.log(response.data);
        setUser({
          email: "",
          password: "",
          firstName: "",
          lastName: ""
        })
      })
      .catch((error) => {
        console.log("error");
        console.log(error);
      });
  };

  return (
    <div style={{ width: "400px" }}>
      <form id="form" onSubmit={createNewUser}>
        <input
          name="email"
          type="email"
          onChange={onInputChange}
          value={user.email}
          placeholder="Email"
        />
        <input
          name="password"
          type="password"
          onChange={onInputChange}
          value={user.password}
          placeholder="Password"
        />
        <input
          name="firstName"
          type="firstName"
          onChange={onInputChange}
          value={user.firstName}
          placeholder="First Name"
        />
        <input
          name="lastName"
          type="lastName"
          onChange={onInputChange}
          value={user.lastName}
          placeholder="Last Name"
        />
        <input type="submit" value="Create new user" />
      </form>
    </div>
  );
};

export default Form;
