
import React from "react"
export default class UpperCase2 extends React.Component {
    state = { inputtext: "" };
    UpperCase2 = () => {
        this.setState({ inputtext: this.state.inputtext.toUpperCase() })
    }
    render() {
        return (
            <div>
                Enter text:<input type="text" onChange={(e) => { this.setState({ inputtext: e.target.value }) }} value={this.state.inputtext}></input>
                <br></br>
                <button onClick={this.UpperCase2}>UpperCase</button><br></br>
                <span>{this.state.inputtext}</span>
            </div>
        )
    }
}



