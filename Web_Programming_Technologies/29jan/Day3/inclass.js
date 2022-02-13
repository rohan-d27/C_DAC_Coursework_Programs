/*
function Book(bname,bcost){
    this.bname=bname;
    this.bcost=bcost;
    this.showdetails=function(){
        console.log(`the name of book ${this.bname} and cost is ${this.bcost}`)
    }

}
Book.prototype.showBookCost=function()
{
    console.log(`this book Cost ${this.bcost}`)
}

Book('ABC',300)
new Book('ABC',300).showBookCost()

Below is tran
*/
class Book {
    constructor(bname, bcost) {
        this.bname = bname;
        this.bcost = bcost;
        this.showdetails = function () {
            console.log(`the name of book ${this.bname} and cost is ${this.bcost}`);
        };

    }
    showBookCost() {
        console.log(`this book Cost ${this.bcost}`);
    }
}
var b = new Book('learning javascript',234)
Book.prototype.dothis={}
console.log(typeof(b),typeof(Book.prototype))
console.log(Object.getOwnPropertyNames(b),Object.getOwnPropertyNames(Book.prototype))
b.showBookCost()
b.showdetails()