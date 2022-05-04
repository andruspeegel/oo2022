import { useEffect, useState } from "react";

function MaintainQuestion() {
    const [questions, setQuestions] = useState([]);

    useEffect(()=>{fetch("http://localhost:8080/questions")
        .then(response => response.json())
        .then(body => setQuestions(body));
    },[]);
    
    function deleteQuestion(questionId) {
        fetch("http://localhost:8080/questions/" + questionId, {
            method: "DELETE",
        }).then(response => response.json())
        .then(body => setQuestions(body));
    }

    return(
        questions.map( element => 
            <div>
                <div>{element.question}</div>
                <div>{element.answer}</div>
                <div>{element.id}</div>
                <div>{element.answered}</div>
                <button onClick={() => deleteQuestion(element.id)}>X</button>
            </div> )
    )
}

export default MaintainQuestion;