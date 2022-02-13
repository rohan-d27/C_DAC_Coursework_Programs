import React from "react"
const DateQ = () => {
    let dateOne = "2022-02-04"
    var dateObject = new Date(dateOne)
    const month = dateObject.toLocaleString('default', { month: 'long' });

    return( <div>
        <p>{month}</p></div>)
}
export default DateQ