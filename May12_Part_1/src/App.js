import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import Third from './components/third/third';
import Four from './components/four/four';
import Five from './components/five/five';
import Six from './components/six/six';
import Seven from './components/seven/seven';
import Eight from './components/eight/eight';

function App() {
  return (
    <div className="App">
      <First /> 
      <Second />
      <Third firstName="Deva" lastName="Darshan" company="Infinite" />
      <Four />
      <Five />
      <Six />
      <Seven />
      <Eight />
    </div>
  );
}

export default App;
