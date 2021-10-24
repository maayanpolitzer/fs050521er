import { useState } from 'react';
import Title from '../common/Title';

function Name() {

    const [counter, setCounter] = useState(0);

    const incrementCounter = () => {
        setCounter(counter + 1);
        //console.log("counter", counter);
    }

    const text = `you clicked on the button ${counter} ${counter == 1 ? "time" : "times"}`;

    return (
        <div>
            <Title content={text} />
            <button onClick={incrementCounter}>click me</button>
        </div>
    );
}



export default Name;