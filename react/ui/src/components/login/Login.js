import { useState } from "react";
import axios from "axios";

const Login = () => {
  const [user, setUser] = useState({
    email: "",
    password: "",
  });

  const onInputChange = (event) => {
    setUser({ ...user, [event.target.name]: event.target.value });
  };

  const login = (event) => {
    // http POST request with user data.
    event.preventDefault();
    axios
      .post("/auth", user)
      .then((response) => {
        if (response.data) {
          console.log("login success");
          console.log(response.data);
          setUser({
            email: "",
            password: "",
          });
        } else {
          console.log("login failed");
        }
      })
      .catch((error) => {
        console.log("error");
        console.log(error);
      });
  };

  return (
    <div>
      <form onSubmit={login}>
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
        <input type="submit" value="Login" />
      </form>
    </div>
  );
};

export default Login;
