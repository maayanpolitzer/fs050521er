import { useSelector } from 'react-redux';
import { nameData } from './nameReducer';

const RightRedux = () => {

    const name = useSelector(nameData);

    return (
        <h1>{name}</h1>
    );
}

export default RightRedux;