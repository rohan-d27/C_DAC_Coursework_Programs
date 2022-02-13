import { useDispatch, useSelector } from "react-redux"
import { useState } from "react"


const ReduxComponentEx1 = () => {
    const dispatch = useDispatch();
    const [enteredName, setEnteredName] = useState();
    const [enteredNumber, setEnteredNumber] = useState();
    const counter = useSelector(state => state.counter)
    const userName = useSelector(state => state.userName)

    const setEnteredNameFunction = (event) => {
        setEnteredName(event.target.value);

    }
    const setEnteredNameAction = () => {

        dispatch({ type: 'setUserName', value: enteredName })

    }
    const setEnteredNumberFunction = (event) => {
        setEnteredNumber(event.target.value)
    }

    const setEnteredNumberAction = () => {
        dispatch({ type: 'setEnteredNumber', value: enteredNumber })
    }
    const increaseCounterAction = () => {

        dispatch({ type: 'increase' })
    }
    const decreaseCounterAction = () => {

        dispatch({ type: 'decrease' })
    }


    return <div>
        <p>User name: {userName}</p>
       <p> Counter: {counter}</p>
        <div> <input type="text" onChange={setEnteredNameFunction}></input><br></br>
            <button type="button" onClick={setEnteredNameAction}>Set New Name</button><br></br><br></br>
            <input type="number" onChange={setEnteredNumberFunction}></input><br></br>
            <button type="button" onClick={setEnteredNumberAction}>Set Number</button>
        </div>
        <br></br>
        <button onClick={increaseCounterAction}>Increase by 2</button>
        <button onClick={decreaseCounterAction}>Decrease by 2</button>
    </div>
}
export default ReduxComponentEx1;
