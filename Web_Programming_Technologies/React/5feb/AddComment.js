import React from "react";
import { useState } from "react";

const AddComment = (props) => {
    const [newComment, setNewComment] = useState();
    const [newName, setNewName] = useState();

    const setNewNameFunction = (event) => {
        setNewName(event.target.value)
    }

    let setNewCommentFunction = (event) => {
        //console.log(event.target.value);
        setNewComment(event.target.value);
    }

    const addCommentFunction = () => {
        //  console.log(newComment);
        //  console.log(newName);
        //  console.log(props);
        var newCommentObject = {
            comment: newComment,
            by: newName
        }
        // console.log(newCommentObject);
        props.add(newCommentObject);

    }


    return (<div>
        <p>Enter Comment:<input type="text" onChange={setNewCommentFunction} /></p>
        <p>Enter Name:<input type="text" onChange={setNewNameFunction} />
        </p>
        <p><button onClick={addCommentFunction}>Add Comment</button></p>
    </div>)
}
export default AddComment