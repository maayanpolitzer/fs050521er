import Home from './components/pages/home/Home';
import './App.css';
import { Route, Switch, BrowserRouter } from 'react-router-dom';
import Register from './components/pages/register/Register';
import LoginPage from './components/pages/login/LoginPage';
import ForgotPassword from './components/pages/forgot-password/ForgotPassword';
import Task from './components/pages/home/tasks/task/Task';
import TaskList from './components/pages/home/tasks/TaskList';
/*
function App() {
    return (
        <div className="home">
            <Home />
        </div>
    );
}
*/

const App = () => {
    return (
        <div>
            <BrowserRouter>
                <Switch>
                    <Route exact path="/">
                        <Home />
                    </Route>
                    <Route exact path="/tasks">
                        <TaskList />
                    </Route>
                    <Route path="/tasks/:id">
                        <Task />
                    </Route>
                    <Route path="/login">
                        <LoginPage />
                    </Route>
                    <Route path="/register">
                        <Register />
                    </Route>
                    <Route path="/forgot">
                        <ForgotPassword />
                    </Route>
                </Switch>
            </BrowserRouter>
        </div>

        // <div className="home">
        //     <Home/>
        // </div>
    );
}

export default App;