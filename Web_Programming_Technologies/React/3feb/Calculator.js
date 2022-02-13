import React from "react";
export default class Calculator extends React.Component {

    render() {
        const num1 = parseInt(this.props.num1);
        const num2 = parseInt(this.props.num2);
        const op = this.props.op;
        let result = 0;
        if (op === "+") {
            result = num1 + num2;
        }
        if (op === "-") {
            result = num1 - num2;
        }
        if (op === "/") {
            result = num1 / num2;
        }
        if (op === "*") {
            result = num1 * num2;
        }
        return <div><p>{num1} {op} {num2} = {result}</p></div>
    }


}