let pattern1=/bad/
let pattern2=/bad$/
let pattern3=/^bad/

/*
var arr= ['ahmedabad','delhi','khultabad','badlapur','badni','aurangabad']
arr.filter((element)=>{
    return element.match(pattern3)
}).forEach((element) => {
    console.log(element)
});

let pattern4=/[A-Z _ a-z ]+[0-9]{3}$/
var arr= ['___231','hellow123','1234567','678','re5tr34','rto09','row333','111rrrr444']
arr.filter((e)=>{
    return e.match(pattern4)
}).forEach(element => {
    console.log(element)
});
*/
let emailpattern=/[ A-Z a-z  -_ ]+\@[a-z A-Z]+\.[a-z A-Z]{3}$/
var arr= ['---@aaa.com','pra@gmail.org','pra_g@hotmail.com','pra@hotmail','pra__gre@ggg.vvv',"test@gov.in"]

arr.filter((element)=>{
    return element.match(emailpattern)
}).forEach((element)=>{console.log(element)})