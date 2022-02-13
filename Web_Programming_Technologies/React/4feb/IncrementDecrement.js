import { useState } from "react";

export default function IncDec()
{
    const [num,setNum]=useState(0)
    
    return (<div>
        <br></br>
        <button onClick={()=>setNum(num+1)}>Increment</button>
        <br></br>
        <button  onClick={()=>setNum(num-1)}>Decrement</button>
        <br></br>
        <span>{num}</span>
    </div>)
}