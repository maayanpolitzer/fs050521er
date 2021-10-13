import logo from './logo.svg';
import './App.css';
import Welcome from './Welcome';

function App() {
  //return jsx statement:
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Welcome />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <div>
          <h1>Hi</h1>
          <h2>Welcome to my website</h2>
          <p>this is a react app</p>
        </div>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
