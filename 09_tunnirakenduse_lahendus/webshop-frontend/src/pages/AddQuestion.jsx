import { useRef } from "react";


function AddQuestion() {
    const questionRef = useRef();
    const answerRef = useRef();
    function addQuestion() {
        fetch("http://localhost:8080/questions", {
            method: "POST",
            body: JSON.stringify({
                question: questionRef.current.value, 
                answer: answerRef.current.value
            }),
            headers: {
                "Content-type": "application/json"
            }
        });
    }

    return(<div>
        <label htmlFor="">KÜSIMUS</label>
        <input ref={questionRef} type="text" />
        <label htmlFor="">VASTUS</label>
        <input ref={answerRef} type="text" />
        <button onClick={() => addQuestion()}>Add</button>
    </div>)
}

export default AddQuestion;