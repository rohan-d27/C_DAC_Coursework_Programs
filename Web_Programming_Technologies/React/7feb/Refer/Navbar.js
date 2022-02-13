import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import './Navbar.css'

export default class Navbar extends Component {
    render() {
        return <div>
            <div className="navbar">
                
                <div className="menu">
                    <span className="menuetitle">Menu</span>
                    <div className="menuitem">
                        <Link to="/poet">Poet</Link>
                        <Link to="/product">ShowProduct</Link>
                        <Link to="/addproduct">AddProduct</Link>
                    </div>
                </div>
            </div>
        </div>;
    }
}