import logo from './logo.svg';
import './App.css';
import UserShow from './components/usershow/usershow';
import UserSearch from './components/usersearch/usersearch';
import EmployShow from './components/employshow/employshow';
import EmploySearch from './components/employsearch/employsearch';

function App() {
  return (
    <div>
      <UserShow /> <hr/>
      <UserSearch /> <hr/>
      <EmployShow /> <hr/>
      <EmploySearch />
    </div>
  );
}

export default App;
