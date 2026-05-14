import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './components/home/home';
import CustomerLogin from './components/customerlogin/customerlogin';
import CustomerMenu from './components/customermenu/customermenu';
import CustomerOrders from './components/customerorders/customerorders';
import CustomerInfo from './components/customerinfo/customerinfo';
import CustomerPendingOrders from './components/customerpendingorders/customerpendingorders';
import CustomerWallet from './components/customerwallet/customerwallet';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/customerlogin" element={<CustomerLogin />} />
          <Route path="/customermenu" element={<CustomerMenu />} />
          <Route path="/customerorders" element={<CustomerOrders />} />
          <Route path="/customerinfo" element={<CustomerInfo />} />
          <Route path="/customerwallet" element={<CustomerWallet />} />
          <Route path="/customerpendingorders" element={<CustomerPendingOrders />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
