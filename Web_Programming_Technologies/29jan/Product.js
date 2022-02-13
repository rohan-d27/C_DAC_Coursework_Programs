class Product {
  constructor(productName, cost, expiryDate) {
    this.productName = productName;
    this.cost = cost;
    this.expiryDate = expiryDate;
  }
  
  get productName() {
    return this._productName;
  }

  set productName(value) {
    if (value.length > 30) {
      console.log("!!!!Name is too long!!!!");
      return;
    }
    this._productName = value;
  }
  get cost() {
    return this._cost;
  }

  set cost(value1) {
    if (value1 < 0) {
      console.log("!!!cost can not be less than zero!!!");
      return;
    }
    this._cost = value1;
  }
  get expiryDate() {
    return this._expiryDate.get;
  }

  set expiryDate(value2) {
    if (value2.getFullYear() < 2000) {
      console.log("!!!!!Year should be greater than 2000!!!!");
      return;
    }
    this._expiryDate = value2;
  }
  
}
Product.prototype.showDetails= function(){
  return this.productName + " " + this.cost + " " + this.expiryDate
}
var o = new Product("laptop", 50000, new Date("10-12-2021"));
console.log(o);
