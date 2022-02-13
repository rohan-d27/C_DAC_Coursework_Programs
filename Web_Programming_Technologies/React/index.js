import React from "react";
import ReactDOM from "react-dom";
import App from "./App";
import {Provider} from 'react-redux'
import store from './8feb/store2'

/* import Navbar from "./7feb/Refer/Navbar"
import { BrowserRouter,Routes,Route} from "react-router-dom" 
import Poet from "./7feb/Poet"
import Product from "./7feb/Product_copy"
import AddProduct from "./7feb/AddProduct" */
/* const route=(<BrowserRouter>
<Navbar></Navbar>
<Routes>
  <Route path="/poet" element={<Poet> </Poet>}></Route> 
  <Route path="/product" element={<Product> </Product>}></Route> 
  <Route path="/addproduct" element={<AddProduct> </AddProduct>}></Route> 
</Routes>
</BrowserRouter>) */

ReactDOM.render(
   <React.StrictMode>
    {/*<Provider store={store}> 
     <App />
    </Provider>*/}
     <App />
    
   
  </React.StrictMode>, 
  //route,
  document.getElementById("root")
);
