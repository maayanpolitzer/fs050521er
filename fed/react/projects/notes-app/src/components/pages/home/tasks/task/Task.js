import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';

const Task = () => {

    const { id } = useParams();
    const [task, setTask] = useState(null);

    useEffect(() => {
        getTaskById();
    }, []);

    const getTaskById = async () => {
        const response = await axios.get(`/notes/${id}`);
        console.log(response);
        setTask(response.data);
    }

    return (
        <div>
            {task != null ? (
                <div>
                    <h1>{task.title}</h1>
                    <h2>{task.description}</h2>
                </div>
            ) : (
                <h1>Loading...</h1>
            )}
        </div>
    );
}

export default Task;