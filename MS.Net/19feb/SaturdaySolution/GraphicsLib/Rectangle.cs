using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GraphicsLib
{

    //Block inheritance to next level using sealed
    //Mulitple Interface Inheritance
    // you can mulitple role to your concrete class
    public sealed class  Rectangle : Shape,IPrintable, ISerilaizable
    {
        public Point StartPoint;
        public Point EndPoint;

        public Rectangle()
        {
            StartPoint = new Point();
            StartPoint.X = 0;
            StartPoint.Y = 0;

            EndPoint = new Point();
            EndPoint.X = 0;
            EndPoint.Y = 0;
            Color = "green";
            Width = 2;

        }

        public Rectangle(Point pt1, Point pt2, int w, string color)
        {
            StartPoint = pt1;
            EndPoint = pt2;
            Color = color;
            Width = w;

        }

       

        public override string Draw()
        {
            int length = EndPoint.X - this.StartPoint.X;
            int width= EndPoint.Y - this.StartPoint.Y;
            int area = length * width;
            return  area+ " " + this.Color + " " + this.Width;
        }
        public string printToHoloGraphicDevice()
        {
            return "Printing to Holographic Deive like Hololense";
        }
        public string printToPaper()
        {
            return "Printing to  A4 Paper";
        }
        public string printToScreen()
        {
            return "Printing to  Flat screen";
        }

        public bool Serialize()
        {
            bool status = false;
            //Logic for storing the state of object into file
            return status;
        }
        public string DeSerialize()
        {
            return "retrived the state of object from file";
        }
    }
}
