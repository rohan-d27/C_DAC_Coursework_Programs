
//require express and create an express
var express = require("express");
const planetsrouter = require("./planetsrouter");
var app = express();
app.use(express.json());//for request body method
app.use("/planet", planetsrouter)

app.get('/', (request, response) => {
    return response.send('Ok');
});
app.get('/getdata', (request, response) => {
    return response.send({ "name": "ram" });
});
app.post('/postdata', (request, response) => {
    return response.send('the post request is successful');
});
app.put('/putdata', (request, response) => {
    return response.send('put request is successful');
});
app.delete('/deletedata', (request, response) => {
    return response.send('delete request is successful');
})
//start the server in  port 8000
app.listen(8000, function () {
    console.log("Example app is listening on port 8000")
})