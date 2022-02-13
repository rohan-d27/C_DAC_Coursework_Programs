// var arr=[10,11,4,5,7,3,9,15]

// arr.sort((n1,n2)=>{
//     if(n1>n2) return 1;
//     if(n1<n2) return -1;
//     else return0
// })


// console.log(arr)

var arr = [{name:'Ram',age:23, city:'Pune'},{name:'Sham',age:29,city:'Mumbai'},{name:'Gita',age:15,city:'Bangalore'}]
// console.log('before sort' ,arr)

// arr.sort((s1,s2)=>{
// if(s1.name>s2.name) return 1;
// if(s1.name<s2.name) return -1;
// else return 0;

// }) 

// console.log('after sort' ,arr)

var names=arr.map((element)=>{return element.name})
var ages=arr.map((element)=>{return element.age})
var cities=arr.map((element)=>{return element.city})
console.log(names)
console.log(ages)
console.log(cities)