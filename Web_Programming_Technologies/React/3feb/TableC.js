import React from "react";
class TableC extends React.Component {
  render() {
    let arrOftr = [];
    for (let i = 1; i <= 5; i++) {
      var line = `2*${i}=${2 * i}`;
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
export default TableC;
