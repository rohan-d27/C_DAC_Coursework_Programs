import fetch from 'fetch';
console.log("Start");

async function f1() {
    console.log("inside function f1");
    const response = await fetch('http://dummy.restapiexample.com/api/v1/employees');
    console.log("before response");
    const employees=await response.json();
    console.log("employees resolved");
    return employees;
    //return f1
}

console.log("Before calling f1");
let pro =f1();
console.log("After calling f1");
console.log(pro);
pro.then(data =>(console.log(data)))
console.log("End")