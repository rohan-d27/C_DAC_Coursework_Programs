using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExternalDemo2
{
    class Program
    {
        static void Main(string[] args)
        {
            Square s = new Square();
            s.SqaureNum(10);
            Console.WriteLine(s.Result);
            s.Cube(10);
            Console.WriteLine(s.Result);
            Console.ReadLine();
        }
    }
}
