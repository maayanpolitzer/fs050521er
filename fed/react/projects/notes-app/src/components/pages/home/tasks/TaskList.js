import axios from "axios";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

function TaskList() {

    const [tasks, setTasks] = useState([]);

    // this function will be called when the component is loaded. (only once!);
    // הפונקציה useEffect מקבילה לבנאי
    // the second parameter ([]), will tell react when to call this function again.
    // react hook
    useEffect(() => {
        getTasks();
    }, []);

    const getTasks = async () => {
        console.log("load the tasks");
        const response = await axios.get("/notes");
        setTasks(response.data);
    }


    /*
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
    */

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
        <div>
            <ul>
                {tasks.map((task) => {
                    return <li key={task.id}><Link to={`tasks/${task.id}`}>{task.title}</Link></li>
                })}
            </ul>
        </div>
    );
}

export default TaskList;