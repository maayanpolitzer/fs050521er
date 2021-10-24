const Title = (props) => {

    const title = props.content;
    const inputTitle = props.lev;

    return (
        <div>
            <h1>{title}</h1>
            <input type={inputTitle == "true" ? "text" : "checkbox"} />
        </div>
    );
}

// props: this is the way to insert data to a component.

export default Title;