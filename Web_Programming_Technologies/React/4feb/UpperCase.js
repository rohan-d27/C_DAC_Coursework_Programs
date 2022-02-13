
import React from "react"
import { useState } from "react";
const UpperCase = () => {
    const [enterdInput, setEnterdInput] = useState('');
    const setEnterdInputFunction = (event) => {
        console.log(event.target.value);
        setEnterdInput(event.target.value.toString().toUpperCase());
    }
    //var isEntering = true;
    return (<div>
        <input type="text" onChange={setEnterdInputFunction} ></input>
        <br></br>
        <button type="button" onClick={setEnterdInputFunction}>Upper Case</button><br></br>
        <span>{enterdInput}</span>

    </div>)
}

export default UpperCase