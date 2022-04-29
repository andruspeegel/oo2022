import { useEffect, useState } from "react";

function Maintain() {
    const [products, setProducts] = useState([]);

    useEffect(()=>{fetch("http://localhost:8080/products")
        .then(response => response.json())
        .then(body => setProducts(body));
    },[]);
    
    function deleteProduct(productId) {
        fetch("http://localhost:8080/products/" + productId, {
            method: "DELETE",
        }).then(response => response.json())
        .then(body => setProducts(body));
    }

    return(
        products.map( element => 
            <div>
                <img src={element.imgSrc} alt="" />
                <div>{element.name}</div>
                <div>{element.price}</div>
                <div>{element.id}</div>
                <div>{element.active}</div>
                <div>{element.description}</div>
                <button onClick={() => deleteProduct(element.id)}>X</button>
            </div> )
    )
}

export default Maintain;