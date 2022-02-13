import React from "react";
import JSXDemo from "./JSXDemo";
import TableC from "./TableC";
import TableF from "./TableF";
import TableJ from "./TableJ";
import ExPr from "./ExPr";
import Calculator from "./Calculator";
import MessageRepeater from "../MessageRepeater";

class App1 extends React.Component {
  render() {
    //let x=10
    //var obj = { cost: 100 };
    //var obj2 = { name: "ram", age: 20, marks: 50 };
    //var str = JSON.stringify(obj2);
    return (
      <div>
       {/* <div>Hi from App1</div>*/}
        {/* <ExPr flag={false} num="7" message="Good Afternoon" info={obj} info2={obj2}> str1={str}</ExPr>*/}
        <Calculator num1="20" num2="10" op="+"></Calculator>
        <Calculator num1="20" num2="10" op="-"></Calculator>
        <Calculator num1="20" num2="10" op="*"></Calculator>
        <Calculator num1="20" num2="10" op="/"></Calculator> 
        <MessageRepeater message="Hello" num="5"></MessageRepeater>
        {/* <JSXDemo></JSXDemo>
        <TableC></TableC>
        <TableF num={x} range="5"></TableF>
        <TableF num="4" range="5"></TableF>
        <TableF num="5" range="5"></TableF>
        <TableJ nm="8"></TableJ> */}
      </div>
    );
  }
}
export default App1;
