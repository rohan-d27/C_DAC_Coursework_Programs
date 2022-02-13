import React from "react"

function AddProduct(props) {
    let id = 0
    let name = ''
    let cost = 0
    let date = ''
    let description = ''

    return (<div>
        id : <input type="number" onBlur={(e) => { id = e.target.value }} ></input>
        <br></br>
        name : <input type="text" onBlur={(e) => { name = e.target.value }} ></input>
        <br></br>
        description : <input type="text" onBlur={(e) => { description = e.target.value }} ></input>
        <br></br>
        cost : <input type="number" onBlur={(e) => { cost = e.target.value }} ></input>
        <br></br>
        expirydate: <input type="date" onBlur={(e) => { date = e.target.value }} ></input>
        <br></br>

        <button onClick={() => props.add(id, name, cost, description, date)}>AddProduct</button>
    </div>)
}
    export default AddProduct;