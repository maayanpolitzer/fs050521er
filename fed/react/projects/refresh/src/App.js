import LoginForm from './components/LoginForm';
import Title from './components/common/Title';
import Name from './components/test/Name';


function App() {
  // component function must return something...
  // it can be null,
  // it can be JSX expression.
  // because it's not HTML :
  // class => className.
  // label: for => htmlFor.
  return (
    <div className="App">
      {/* <h1>This is App component</h1> */}
      <Title content="Website title" lev="true" />
      <hr/>
      <Name/>
      <hr/>
      <LoginForm />
    </div>
  );
}

/*
const App = () => {
  return (
    <div className="App">
      <h1>This is App component</h1>
      <LoginForm />
    </div>
  );
}
*/

export default App;
