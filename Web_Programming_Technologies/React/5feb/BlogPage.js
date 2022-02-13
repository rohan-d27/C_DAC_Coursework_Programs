import React from "react"
//import "./parent.css"
import "./App4.css";
import AddComment from "./AddComment"
export default class BlogPage extends React.Component {
    state = { comments: [] }

    componentDidMount = () => {
        var comments = [{ comment: 'Hi', by: 'rohan' },
        { comment: 'Hello', by: 'ram' },
        { comment: 'How are you?', by: 'sham' },
        { comment: 'Good Morning!', by: 'prakash' }
        ]
        this.setState({ comments: comments })
    }


    deleteAll = () => {

        this.setState({ comments: [] })


    }
    addComment = (newCommentObject) => {
        //console.log("Your object has come", newCommentObject);
        var temp = this.state.comments
        temp.push(newCommentObject);
        this.setState({ comments: temp })
    }


    deletecomment = (i) => {
        var temp = this.state.comments
        temp.splice(i, 1)
        this.setState({ comments: temp })
    }


    updatecomment = (i, newcomment) => {
        var temp = this.state.comments
        temp[i].comment = newcomment
        this.setState({ comments: temp })
        this.state.comments.forEach((e) => { console.log(e.comment, e.by) })
    }


    render() {
        return (<div>
            <AddComment add={this.addComment} ></AddComment>
            <button onClick={this.deleteAll}> Delete All</button>
            <br></br>
            <p>This is the BLOG on REACT usage with lifecycle methods</p>
            {
                this.state.comments.map(
                    (element, index) => {
                        return (
                            <div key={'d' + index}>
                                <Comment key={index} index={index}
                                    comment={element.comment}
                                    by={element.by}
                                    delete={this.deletecomment}
                                    update={this.updatecomment}
                                >
                                </Comment>
                                {/*     <button key={'b'+index} onClick={()=>{this.deletecomment(index)}}>delete</button> */}
                            </div>
                        )
                    }
                )
            }
        </div>)
    }
}

class Comment extends React.Component {
    commentvalue = ''
    state = { readonlyflag: true }
    render() {
        return (
            <div className="child">
                <input type="text" readOnly={this.state.readonlyflag} defaultValue={this.props.comment} onChange={(e) => { this.commentvalue = e.target.value }} onBlur={() => { this.props.update(this.props.index, this.commentvalue) }} ></input>
                <p>{this.props.by}</p>
                <button onClick={() => { this.props.delete(this.props.index) }}>delete</button>
                <button onClick={() => { this.setState({ readonlyflag: false }) }}>Edit</button>
            </div>
        )

    }

}



