class Book {
    constructor(bname, bcost) {
        //ALL this is object's own properties 
        this.bname = bname
        this.cost = bcost

        this.showDetails = function () {
            console.log(`the name of book is ${this.bname} and cost is ${this.cost}`)
        }
    }//end of constructor
    /* constructor()
    {

    } */
    //this method is added to the prototype of the class
    showBookCost() {
        console.log(`this book costs ${this.cost}`)
    }
}




//var x = Book('ppp',34)   //undefined return value as the function doesnt return anything
var b = new Book('learning javascript',234)
console.log(typeof(b),typeof(Book.prototype))
console.log(Object.getOwnPropertyNames(b), Object.getOwnPropertyNames(Book.prototype))
Book.prototype.dothis=function(){}
Book.prototype.dothat=function(){}
console.log(Object.getOwnPropertyNames(b), Object.getOwnPropertyNames(Book.prototype))

b.showDetails()
b.showBookCost()
