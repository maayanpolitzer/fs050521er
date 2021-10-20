import axios from "axios";

function TaskList() {

    /*
    const tasks = [{
        id: 1,
        title: "task 1 title",
        description: "task 1 desc"
    }, {
        id: 2,
        title: "task 2 title",
        description: "task 2 desc"
    }];
    */
    axios.get("/notes").then(response => {
        const tasks = response.data;
        let display = null;
        if (tasks.length == 0) {
            display = <h1>No tasks yet...</h1>
        } else {
            const list = tasks.map(task => <li>{task.title}</li>);
            console.log(list);
            display =
                <div>
                    <ul>
                        {list}
                    </ul>
                </div>
        }
    });

    /*
    let display = null;
    if (tasks.length == 0) {
        display = <h1>No tasks yet...</h1>
    } else {
        const list = tasks.map(task => <li>{task.title}</li>);
        console.log(list);
        display =
            <div>
                <ul>
                    {list}
                </ul>
            </div>
    }

*/

    return (
        <h1>hello</h1>
    );
}

export default TaskList;