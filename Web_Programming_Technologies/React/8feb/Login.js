import { useState } from "react"
import { useDispatch } from "react-redux"

export default function Login() {
    let [user, setUser] = useState('')
    let [pwd, setPwd] = useState('')
    let dispatch = useDispatch()

    let verify = () => {
        if (user === 'rohan' && pwd === 'rohan123') {
            dispatch({ type: 'change', payload: user })
            console.log('login successfully')
        }
        else {
            console.log('incorrect login')
        }
    }

    return (
        <div>
            
            Enter Login name : <input type="text" onBlur={(e) => { setUser(e.target.value) }} />
            <br></br>
            Enter Password  : <input type="text" onBlur={(e) => { setPwd(e.target.value) }} />
            <br></br>
            <button onClick={verify}>login</button>

           
        </div>
    )
}