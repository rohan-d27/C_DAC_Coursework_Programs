var express = require('express');
var planetsrouter = express.Router();
//http://localhost:8000/planet/earth
planetsrouter.get('/earth', function (req, res) {
    res.send("earth is only planet with life")
})
//http://localhost:8000/planet/mars
planetsrouter.get('/mars', function (req, res) {
    res.send("mars is red")
})

//using query parameters to
//http://localhost:8000/planet/change?weather=hot&temperature=50
planetsrouter.put('/change', function (req, res) {
    var weather = req.query.weather;
    var temperature = req.query.temperature;
    res.send(`your planet must have ${weather} weather and temperature should be ${temperature}`)

})

//http://localhost:8000/planet/data/blue/red
planetsrouter.post("/data/:feature1/:feature2", function (req, res) {
    let f1 = req.params.feature1
    let f2 = req.params.feature2
    res.send(`you sent ${f1} and ${f2}`)
})

//using json object
//in body json
/*{
    "featureRemove":"badWeather"    
}*/
//http://localhost:8000/planet/delete
planetsrouter.delete('/delete', function (req, res) {
    console.log("delete", req.body)
    var featureRemove = req.body.featureRemove// for this to work add  app.use(express.json()); before the route handler
    res.send(`let us remove ${featureRemove} this feature`)
})




module.exports = planetsrouter