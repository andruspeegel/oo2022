import { useEffect, useState, useRef } from "react";


function AnswerQuestion() {
    const [questions, setQuestions] = useState([]);
    const answerRef = useRef();

    useEffect(()=>{fetch("http://localhost:8080/questions")
    .then(response => response.json())
    .then(body => setQuestions(body));},[]);
    
    return(
        questions.map( element => 
            <div>
                <div>{element.question}</div>
                <label htmlFor="">VASTUS:</label>
                <input ref={answerRef} type="text" />
                <button>Vasta</button>
            </div> )
    )
    
}

export default AnswerQuestion;