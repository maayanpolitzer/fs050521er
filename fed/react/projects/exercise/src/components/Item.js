const Item = (props) => {
    //const {text, index} = props;

    const deleteChild = e => {
        //props.rotem(props.index);
        props.awny[0]();
    }

    return (
        <li>
            <a onClick={deleteChild}>X</a>{props.text} - {props.index}
        </li>
    );
}

export default Item;