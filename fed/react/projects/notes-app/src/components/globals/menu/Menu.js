import logoImage from './logo.png';
import './Menu.css';

function Menu() {

    return (
        <header>
            <img id="logo" src={logoImage} alt="website logo" />
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">Settings</a></li>
                <li><a href="#">Logout</a></li>
            </ul>
        </header>
    );
}

export default Menu;