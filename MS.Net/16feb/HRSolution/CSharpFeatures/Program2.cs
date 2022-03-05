using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpFeatures
{
    class Program2
    {
        public const int bookCount = 10;
        public readonly int numberOfLine;
        public String author;


        public Program2()
        {
            numberOfLine = 100000;
        }
        public Program2(String author)
        {
            
            this.author = author;
        }
        static void Main(String[] args)
        {
            const double PI = 3.14;
            Program2 p2 = new Program2("john Smith");
            //   p2.author = "John Smith";
          //  Console.WriteLine(bookCount,p2.author );
            Console.WriteLine("\nPI Value is {0}", PI);
            Console.ReadLine();

        }
    }
}
