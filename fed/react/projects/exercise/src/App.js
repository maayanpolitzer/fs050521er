import { useState } from 'react';
import './App.css';

import Item from './components/Item';

const App = () => {

  const [listItems, setListItems] = useState(["1", "2", "3"]);  // react hook.

  const [inputValue, setInputValue] = useState("");

  const onInputChanged = e => {
    setInputValue(e.target.value);
  }

  const onButtonClicked = e => {
    /*
    const temp = listItems.map(item => {return item});
    temp.push(inputValue);
    setListItems(temp);
    */
    setListItems([...listItems, inputValue]);
    setInputValue("");
  }

  /*
  let items = [];
  for (let i = 0; i < listItems.length; i++) {
    items.push(<li>{listItems[i]}</li>);
  }
  */

  const onDeleteButtonClicked = index => {
    const temp = [...listItems];
    temp.splice(index, 1);
    /*
     const temp = listItems.filter(function (item, i) {
       return i != index;
     });
     */
    setListItems(temp);
    //setListItems([]);
  }

  const dor = () => {
    console.log("working from maldives!!")
  }

  const arr = [dor];

  return (
    // <div className={inputValue.trim().length % 2 == 0 ? "app" : "app2"}>
    <div className="app">
      <div className="left child">
        <input value={inputValue} type="text" onChange={onInputChanged} id="myInput" />
        <button onClick={onButtonClicked} disabled={inputValue.trim().length === 0}>Add to list</button>
      </div>
      <div className="right child">
        <ul>
          {/* {items} */}
          {
            listItems.map((item, index) => {
              //return <li key={index}>{item}<button onClick={() => { onDeleteButtonClicked(index) }}>delete</button></li>;
              return <Item awny={arr} rotem={onDeleteButtonClicked} index={index} text={item} key={index} />
            })
          }
        </ul>
      </div>
    </div>
  );
}

export default App;