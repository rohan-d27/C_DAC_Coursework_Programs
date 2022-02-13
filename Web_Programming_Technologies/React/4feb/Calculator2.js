import React from "react";
import Calculator from "../3feb/Calculator";

export default class Calculator2 extends React.Component {
    state = { num1: {}, num2: {}, op: "" };

    render() {
        return (<div>
            <p>Number 1</p><input type="number" onChange={(e) => { this.setState({ num1: e.target.value }) }} />
            <br></br>
            <p>Number 2</p><input type="number" onChange={(e) => { this.setState({ num2: e.target.value }) }} />
            <br></br><p>Operation</p>
            <select onChange={(e) => { this.setState({ op: e.target.value }) }} >
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>


            <Calculator num1={this.state.num1} num2={this.state.num2} op={this.state.op} />
        </div>
        )
    }
}