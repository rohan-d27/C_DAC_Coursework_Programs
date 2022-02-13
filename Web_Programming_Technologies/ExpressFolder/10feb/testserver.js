var express = require('express');
var app = express();

app.use(express.json());
var planetrouter = require("./planetsrouter")
app.use("/planet",planetrouter)



app.get('/', (request, response) => {
    return response.send('OK');
  });
  
  app.get('/data', (request, response) => {
    return response.send({"name":"prachi","gender":"female"});
  });

  app.post('/postdata',(request, response) => {
    return response.send("the post request was accepted");
  })

  app.put('/putdata',(request, response) => {
    return response.send("the PUT request was accepted");
  })

  app.delete('/deletedata',(request, response) => {
    return response.send("the DELETE request was accepted");
  })
  

// start the server in the port 3000 !
app.listen(8000, function () {
    console.log('Example app listening on port 8000.');
});
