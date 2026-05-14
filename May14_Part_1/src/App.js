import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import ColorTheme from './components/colortheme/colortheme';
import FontTheme from './components/fonttheme/fonttheme';
import RefEx1 from './components/refex1/refex1';
import RefEx2 from './components/refex2/refex2';
import MemoExample1 from './components/memoExample1/memoExample1';
import MemoExample2 from './components/memoExample2/memoExample2';
import MemoExample3 from './components/memoExample3/memoExample3';

function App() {
  return (
    <div className="App">
     <First /><br/>
     <Second /> <br/>
     <ColorTheme /> <br/>
     <FontTheme /> <br/>
     <RefEx1 /> <br/>
     <RefEx2 /> <br/>
     <MemoExample1 /> <br/>
     <MemoExample2 /> <br/>
     <MemoExample3 />
    </div>
  );
}

export default App;
