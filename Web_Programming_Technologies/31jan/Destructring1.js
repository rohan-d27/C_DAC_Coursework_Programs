var arr = [10, 20, 30, 40, 50, 60 ];


var [a,, b,,c,d] = arr;
console.log(a,b,c,d)

var obj = {
  fname: "Rohan",
  marks: 40,
  city: "pune",
  setName: function (n) {
    console.log(n);
  },
};


var { fname: nm, setName: set } = obj;
console.log(nm);
set("Mumbai");