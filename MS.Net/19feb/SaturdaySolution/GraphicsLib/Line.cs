using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GraphicsLib
{
    public class Line :Shape
    {
        public Point StartPoint;
        public Point EndPoint;

        public Line()
        {
            StartPoint = new Point();
            StartPoint.X = 0;
            StartPoint.Y = 0;

            EndPoint = new Point();
            EndPoint.X = 0;
            EndPoint.Y = 0;
            Color = "Red";
            Width = 1;

        }

        public Line(Point pt1, Point pt2, int w, string color)
        {
            StartPoint = pt1;
            EndPoint = pt2;
            Color = color;
            Width = w;

        }
        public override string Draw()
        {
           return  this.StartPoint + " " + this.EndPoint+ " "+ this.Color + " " + this.Width;
        }
    }
}
