const { response } = require("express")
var express = require("express")
var planetrouter = express.Router()


planetrouter.get("/earth",function(req,res){
           res.send("earth is the only planet with water")
})

planetrouter.get("/jupiter",function(req,res){
    res.send("jupiter is the largest planet ")
})

planetrouter.post("/data/:feature1/:feature2",(req,res)=>{
    let f1= req.params.feature1
    let f2 = req.params.feature2
    res.send(`u sent ${f1} and ${f2}`)

})


//using query params
planetrouter.put('/change',function(req,res){
    var weather = req.query.weather
    var temperature = req.query.temperature

    res.send(`your planet must have ${weather} weather and temperarture less than ${temperature}`)

});

//using json object
planetrouter.delete('/remove',function(req,res){
    console.log("delete",req.body)
    var badfeature = req.body.badfeature // for this to work add  app.use(express.json()); before the route handler
    res.send(`let us remove this ${badfeature} from our planet`)
  
  });



module.exports = planetrouter