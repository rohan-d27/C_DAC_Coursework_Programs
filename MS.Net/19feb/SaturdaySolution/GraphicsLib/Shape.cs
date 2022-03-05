using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GraphicsLib
{
    public  abstract class Shape
    {
        protected string Color { get; set; }
        protected int Width { get; set; }

        // you may or may not override method in child class
        public virtual string Show()
        {
           return "Showing shape details.....";
        }

        //You have to enforce overriding metho in child class
        public abstract string Draw();
    }
}
