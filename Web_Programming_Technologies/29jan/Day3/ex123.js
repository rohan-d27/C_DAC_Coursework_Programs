
class Person
{
    constructor(a,b,c)
    {
        this.fname = a
        this.lname=b
        this.pno = c
    }
}


function showData(flag , obj)
{
    if(flag==true)
    {
        console.log(JSON.stringify(obj)  ,
        JSON.stringify(45),
        JSON.stringify(true).toUpperCase(),
        JSON.stringify({a:1, b:undefined, c:null}), /* true.toUpperCase() */ )
                var str1 = '{"data":10}'
        var str2 = '{"fname":"prachi","lname":"godbole","pno":12345}'
        var a='{"fname":"rohan","lname":"babar","pno":1223}'
        console.log("Namem",JSON.parse(a))

        var obj2 = {fname:'alpha', lname:'beta',pno:123}

        var obj = JSON.parse(str2)
        console.log(obj,obj.fname , str2.fname) 
      var obj2 = {fname:'alpha', lname:'beta',pno:123}
      console.log("ididi",JSON.stringify(obj2))
        var st4 ='{"fname":"alpha","lname":"beta","pno":123}'
        //JSON parse method will not parse if the object format is not strictly as above
       console.log(JSON.parse(str2))
 

     }
    else
    {
        console.log("I am offline")
    }
}




showData(true, new Person('prachi','godbole',12345))




