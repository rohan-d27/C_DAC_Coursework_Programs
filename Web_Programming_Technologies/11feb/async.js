import { readFile } from 'fs';

function mycallback(data)
{
  console.log("the data is here "+ data)
}

var filedata =''
var da = readFile("./hello.js", function(err, data) {
    if (err) {
      console.log("error here",err.message)
      return
    } 
    filedata = data.toString()
    console.log("readFile called");
    //console.log("data :"+data);
    mycallback(data.toString())
  });

  console.log("filedata "+filedata)
  
