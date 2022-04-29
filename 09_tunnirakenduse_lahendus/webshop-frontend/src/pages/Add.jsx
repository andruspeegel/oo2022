import { useRef } from "react";


function Add() {
    const nameRef = useRef();
    const priceRef = useRef();
    function addProduct() {
        fetch("http://localhost:8080/products", {
            method: "POST",
            body: JSON.stringify({
                name: nameRef.current.value, 
                price: priceRef.current.value
            }),
            headers: {
                "Content-type": "application/json"
            }
        });
    }

    return(<div>
        <label htmlFor="">NIMI</label>
        <input ref={nameRef} type="text" />
        <label htmlFor="">HIND</label>
        <input ref={priceRef} type="price" />
        <button onClick={() => addProduct()}>Add</button>
    </div>)
}

export default Add;