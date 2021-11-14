import { useDispatch } from 'react-redux';
import { changeName } from './nameReducer';

const LeftRedux = () => {

    const dispach = useDispatch();

    const buttonClicked = () => {
        //name = "Moshe";
        // to change the name from redux store:
        dispach(changeName("Moshe"));
    }

    return (
        <button onClick={buttonClicked}>click me</button>
    );
}

export default LeftRedux;