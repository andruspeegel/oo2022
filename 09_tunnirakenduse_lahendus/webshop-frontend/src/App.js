import { Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './components/Navbar';
import Add from './pages/Add';
import Cart from './pages/Cart';
import Home from './pages/Home';
import Maintain from './pages/Maintain';
import AddQuestion from './pages/AddQuestion';
import MaintainQuestion from './pages/MaintainQuestion';
import AnswerQuestion from './pages/AnswerQuestion';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Routes>
          <Route path="" element={ <Home />} />
          <Route path="lisa" element={ <Add />} />
          <Route path="halda" element={ <Maintain />} />
          <Route path="ostukorv" element={ <Cart />} />
          <Route path="lisa_kysimus" element={ <AddQuestion />} />
          <Route path="halda_kysimusi" element={ <MaintainQuestion />} />
          <Route path="vasta_kysimustele" element={ <AnswerQuestion />} />
      </Routes>
    </div>
  );
}

export default App;
