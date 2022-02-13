import React from "react";
function MessageRepeater(props) {
    let arr = [];
    for (let i = 0; i < props.num; i++) {
        var ll = `${props.message}`;
        var line = <li>{ll}</li>;
        arr.push(line)
    };
    return <div><ol>{arr}</ol></div>;
}
export default MessageRepeater;
