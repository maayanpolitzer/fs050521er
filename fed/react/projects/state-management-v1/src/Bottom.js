import { useState, forwardRef, useImperativeHandle } from 'react';


const Bottom = forwardRef((ref) => {

    const [counter, setCounter] = useState(0);

    useImperativeHandle(ref, () => ({
        y() {
            incrementCounter();
        }
    }));

    const incrementCounter = () => {
        setCounter(counter + 1);
    }

    return (
        <h1>{counter}</h1>
    );
})

export default Bottom;