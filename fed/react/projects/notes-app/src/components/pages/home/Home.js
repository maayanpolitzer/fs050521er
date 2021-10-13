import Menu from '../../globals/menu/Menu';
import TaskList from './tasks/TaskList';
import Calendar from './calendar/Calendar';
import './Home.css';

function Home() {
    // jsx => variable with type 'custom HTML' / react creates VIRTUAL DOM
    return (
        <div className="home">
            <div id="menu">
                <Menu />
            </div>
            <div className="main">
                <div id="taskList">
                    <TaskList />
                </div>
                <div id="calendar">
                    <Calendar />
                </div>
            </div>
        </div>
    );
}

export default Home;