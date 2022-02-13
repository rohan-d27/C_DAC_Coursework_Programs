import React from "react";
function ExPr(props) {
  var s;
  if (props.flag) {
    s = "flag is true";
  } else {
    s = "flag is false";
  }
  return (
    <div>
      <p>{s}</p>
      <p>{props.num * props.num}</p>
      <p>{props.message}</p>
      <p>{props.info.cost}</p>
      <p>{(props.info2.name, props.info2.age, props.info2.marks)}</p>
      <p>{props.str1}</p>
    </div>
  );
}
export default ExPr;
