import React from "react";
class TableJ extends React.Component {
  render() {
    let arrOftr = [];
    let n = this.props.nm;
    for (let i = 1; i <= n; i++) {
      var line = `${n}*${i}=${n * i}`;
      var trline = (
        <tr>
          {" "}
          <td> {line}</td>
        </tr>
      );
      arrOftr.push(trline);
    }
    return (
      <table border="1">
        <tbody>{arrOftr}</tbody>
      </table>
    );
  }
}
export default TableJ;
