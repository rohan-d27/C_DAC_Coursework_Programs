class MyDate
{    constructor(d,m,y)
    {
        //we can add check here
        this.day = d;
        this.month = m;
        this.year =y;
    }
    get day()
    {
        console.log("get day called")
        return this._day
    }
    set day(value)
    {
        console.log("set day called")
        if(value>=1 && value<=31)
        this._day=value
        else
         console.log("day cannot be set")
    }

    showDate()
    {
        //getters will be called automatically
        console.log(`${this.day}-${this.month}-${this.year}`)
    }
}//end of the class

var d = new MyDate(12,12,2022)
d.showDate()
//the setter will be automatically called
d.day=76  //direct access always possible , so no will use setter
d.showDate()
console.log(Object.getOwnPropertyNames(d),Object.getOwnPropertyNames(MyDate.prototype))