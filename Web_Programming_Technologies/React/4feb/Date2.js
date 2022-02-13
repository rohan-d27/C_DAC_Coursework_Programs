import React from "react"
export default class Date2 extends React.Component {
    state = { inputDate: "", formatDate: "" };
    Date2 = () => {
        let d = new Date(this.state.inputDate);
        let fd = `${d.getDate()}-${d.toLocaleString('default', { month: 'long' })}-${d.getFullYear()}`
        this.setState({ formatDate: fd })
    }
    render() {
        return (<div>
            <p>Enter date</p> <input type="date" onChange={(e) => { this.setState({ inputDate: e.target.value }) }} value={this.state.inputDate}></input>
            <br></br>
            <button onClick={this.Date2}>Show date</button><br></br>
            <span>{this.state.formatDate}</span></div>)
    }
}
