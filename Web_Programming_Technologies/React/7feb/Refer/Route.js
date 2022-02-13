import React from "react";
import ReactDOM from "react-dom";
import "./index.css";

import App from "./App"; //impoted from app .js
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from "./CrudF/Navbar";
import Showdata from "./CrudF/ShowData";
import Setdata from "./CrudF/SetData";
import ShowLink from "./CrudF/ShowLink";

const routes = (
    <BrowserRouter>
        <div>
            <Navbar> </Navbar>{" "}
            <Routes>
                <Route path="/showdata" element={<Showdata> </Showdata>}></Route>
                <Route path="/setdata" element={<Setdata> </Setdata>}></Route>
                <Route path="/showlink" element={<ShowLink> </ShowLink>}></Route>
            </Routes>{" "}
        </div>{" "}
    </BrowserRouter>
);

ReactDOM.render(
    // <React.StrictMode>
    //    <App />        {/*  custom tag  */}

    // </React.StrictMode>,
    routes,
    document.getElementById("root")
);
