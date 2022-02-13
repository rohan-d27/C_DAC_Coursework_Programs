import React from "react";
function TableF(props) {
  let arrOftr = [];
  for (let i = 1; i <= props.range; i++) {
    var line = `${props.num}*${i}=${props.num * i}`;
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

export default TableF;
