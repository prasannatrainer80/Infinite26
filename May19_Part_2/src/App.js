import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import Third from './components/third/third';
import Four from './components/four/four';
import Five from './components/five/five';
import Six from './components/six/six';
import Seven from './components/seven/seven';

function App() {
  return (
     <div className="App">
      <First /> 
      <Second />
      <Third firstName="Naveen" lastName="Nehru" company="Infinite" />
      <Four />
      <Five />
      <Six />
      <Seven />
    </div>
    
  );
}

export default App;
