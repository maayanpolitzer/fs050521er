import { useState } from "react";

const Left = (props) => {

    const [inputValue, setInputValue] = useState("initial value");

    const onButtonClickHandler = () => {
        props.x(inputValue);
    }

    const onTextChanged = e => {
        setInputValue(e.target.value);
        props.x(e.target.value);
    }

    return (
        <div>
            <h1 style={{ "color": props.color }}>Left</h1>
            <button onClick={onButtonClickHandler}>Click me to change the text</button>
            <input value={inputValue} onChange={onTextChanged} />
        </div>
    );

}

export default Left;