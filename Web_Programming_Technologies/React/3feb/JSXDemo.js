import React from "react";
class JSXDemo extends React.Component {
  name = "Rohan";
  render() {
    let lastname = "Dharurkar";
    let nm = (
      <div>
        <h1>
          Welcome {this.name} {lastname}
        </h1>
        <h1> How are you? </h1>
      </div>
    );
    let n2 = (
      <p>
        {2 * 8} {lastname.toUpperCase}
      </p>
    );

    return n2;
  }
}
export default JSXDemo;
