import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import AppRoute from "./Approute2";

const routs = (
   < BrowserRouter >
      <div>
         <AppRoute></AppRoute>
         <Routes>
            <Route path="/product/showall" element={<Product></Product>} />
         </Routes>
      </div>
   </ BrowserRouter >
);
ReactDOM.render(routs, document.getElementById('root'))