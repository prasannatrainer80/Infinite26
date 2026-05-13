import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Menu from './components/menu/menu';
import EmployShow from './components/employshow/employshow';
import EmploySearch from './components/employsearch/employsearch';
import EmployAdd from './components/employadd/employadd';
import EmployUpdate from './components/employupdate/employupdate';
import EmployDelete from './components/employdelete/employdelete';
import Login from './components/login/login';

function App() {
  return (
    <div className="App">
     <BrowserRouter>
      <Routes>
          <Route path='/' element={<Login />} />
          <Route path="/menu" element={<Menu />} />
          <Route path="/employshow" element={<EmployShow />} />
          <Route path="/employsearch" element={<EmploySearch />} />
          <Route path="/employadd" element={<EmployAdd />} />
          <Route path="/employupdate" element={<EmployUpdate />} />
          <Route path="/employdelete" element={<EmployDelete />} />
          
      </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;
