class Product {
  constructor(pname, productCost, expiryDate) {
    this.productName = pname;
    this.productCost = productCost;
    this.expiryDate = expiryDate;
  }
  get productName() {
    return this._productName;
  }
  set productName(p) {
    if (p?.length <= 30) this._productName = p;
    else console.log("Size of name less than 30");
  }
  get productCost() {
    return this._productCost;
  }
  set productCost(pc) {
    if (pc > 0) this._productCost = pc;
    else {
      console.log("Negative Not allowed");
    }
  }
  set expiryDate(d) {
    var ck = new Date("2000-01-01");
    if (ck < d) this._expiryDate = d;
    else console.log("checked date");
  }
  get expiryDate() {
    return this._expiryDate;
  }

  showDetails() {
    console.log(
      `Prod Name : ${this.productName} , Prod Cost : ${
        this.productCost
      },Product exp:  ${this.expiryDate.getDate()} / ${
        this.expiryDate.getMonth() + 1
      } / ${this.expiryDate.getFullYear()}`
    );
  }
}

var p1 = new Product("apple", 300, new Date("2000-1-2"));
//p1.showDetails()
var p2 = new Product("mango", 133, new Date("2000-1-12"));
var p3 = new Product("banana", 123, new Date("2000-1-12"));
var prd = [p1, p2, p3];
prd.forEach((element) => {
  element.showDetails();
});
