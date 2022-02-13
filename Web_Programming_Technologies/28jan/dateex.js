 /*var d = new Date()
console.log('day=',d.getDay(),'date=',d.getDate(),'month=',d.getMonth(),'year=',d.getFullYear())
 
 var d1 = new Date();
d1.setDate(27);
d1.setMonth(0);
d1.setFullYear(2022);
console.log(d1)
 
*/
var d3  = new Date("2020-12-31");
console.log(d3.getMonth())



/*
//https://livecodestream.dev/post/date-manipulation-in-javascript-a-complete-guide/
//https://devdocs.io/javascript-date/


const date = new Date();
const [month, day, year]       =   [date.getMonth(), date.getDate(), date.getFullYear()];
const [hour, minutes, seconds] = [date.getHours(), date.getMinutes(), date.getSeconds()];
console.log(month,day,year)

*/

/*
const independence = new Date(1947,7,15)
const republic  = new Date(1950,0,26)

const today = new Date()
const tomorrow = new Date(2023,0,26)
tomorrow.setHours(today.getHours())
let diff = tomorrow - today
console.log(Math.round((((diff/1000)/60)/60)/24 ))


if(republic >independence)
    console.log("r after i")
else
console.log("r before i")

const gg = new Date(1947,7,15)
if (republic.valueOf() != independence.valueOf())
    console.log("different")
    else
    console.log("same")
 */