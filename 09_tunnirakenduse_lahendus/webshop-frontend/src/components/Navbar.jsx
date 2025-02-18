import { Link } from "react-router-dom";

function Navbar(){
    return(<div><nav className="navbar navbar-expand-lg navbar-light bg-light">
    <div className="container-fluid">
      <Link to="/">
     <div className="navbar-brand">Veebipood</div>
     </Link>
      <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span className="navbar-toggler-icon"></span>
      </button>
<div className="collapse navbar-collapse" id="navbarNavAltMarkup">
  <div className="navbar-nav">
    <Link to="lisa">
    <div className="nav-link">Lisa toode</div>
    </Link>
    <Link to="halda">
    <div className="nav-link">Halda tooteid</div>
    </Link>
    <Link to="ostukorv">
    <div className="nav-link">Ostukorv</div>
    </Link>
    <Link to="lisa_kysimus">
    <div className="nav-link">Küsimuste lisamine</div>
    </Link>
    <Link to="halda_kysimusi">
    <div className="nav-link">Halda küsimusi</div>
    </Link>
    <Link to="vasta_kysimustele">
    <div className="nav-link">Vasta küsimustele</div>
    </Link>
  </div>
</div>
</div>
</nav></div>);
}

export default Navbar;