class Shape
{
    constructor(shname)
    {
        this.shname = shname
        this.getName=function()
        {
            console.log(this.shname)
        }
    }

     static shappy()
    {
        console.log("shappy")
    }
    
    get shname() {
        console.log("get called")
        return this._shname;
      }
    
    set shname(value) {
          console.log("set called")
        if (value.length < 4) {
          alert("Name is too short.");
          return;
        }
        this._shname = value;
      }
    
    sayHi()
    {
        console.log("hi")
    }
    
}


/* var s = new Shape('circle')

s.shcolor = "blue"
Shape.prototype.sharea=45
console.log(Object.getOwnPropertyNames(s),Object.getOwnPropertyNames(Shape.prototype))
 *//* 
//Override = modifying the implementation 
Shape.prototype.sayHi=()=>{console.log("dosomething else")}
Shape.prototype.sayHi=(name)=>{console.log("hello",name)}
console.log(Object.getOwnPropertyNames(s),Object.getOwnPropertyNames(Shape.prototype))

s.sayHi() */

/* s.shname='pppppp'
var s = s.shname
*/
//Shape.shappy()
//s.shappy()  //NOT OK

class Circle extends Shape
{
    constructor(nm,rad)
    {
        super(nm)
        this.radius =rad

        this.getName=function()
        {
            console.log(super.shname,this.radius)
        }
    }
}

var c = new Circle('test',4)
c.getName()
c.sayHi() 
console.log(Object.getOwnPropertyNames(c),Object.getOwnPropertyNames(Circle.prototype))



