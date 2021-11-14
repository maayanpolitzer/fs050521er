import Left from './Left';
import Right from './Right';
import './App.css';
import { useState, useRef } from 'react';

import Top from './Top';
import Bottom from './Bottom';

import LeftRedux from './redux/LeftRedux';
import RightRedux from './redux/RightRedux';
import Middle from './redux/Middle';

const App = () => {
  return (
    <div>
      <LeftRedux />
      <Middle />
      <RightRedux />
    </div>
  )
}
/*
const App = () => {

  const bottomReference = useRef(null);

  const x = () => {
    console.log("x() called!");
    // call a function on Bottom current component. NOT by re-render the screen.
    bottomReference.current.y();
  }

  return (
    <div>
      <Top x={x} />
      <Bottom ref={bottomReference} />
    </div>
  );
}
*/

/*
function App() {

  const [text, setText] = useState("default value");
  const arr = [
    { name: "Blue", value: "rgb(0,0,255)" },
    { name: "Green", value: "rgb(0,255,0)" },
    { name: "No color" },
    { name: "Red", value: "rgb(255,0,0)" }
  ];

  const [index, setIndex] = useState(0);

  const onChangeTextRequest = newValue => {
    //setText(newValue);
    if (index < arr.length - 1) {
      setIndex(index + 1);
    } else {
      setIndex(0);
    }

  }

  return (
    <div className="App">
      <Left x={onChangeTextRequest} color={arr[index].value || "black"} />
      <Right content={text} />
    </div>
  );
}
*/
export default App;
