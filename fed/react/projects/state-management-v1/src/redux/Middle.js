import { useDispatch } from 'react-redux';
import { clearName } from './nameReducer';

const Middle = () => {

    const dispach = useDispatch();

    return (
        <button onClick={() => { dispach(clearName()) }}>clear</button>
    );
}

export default Middle;