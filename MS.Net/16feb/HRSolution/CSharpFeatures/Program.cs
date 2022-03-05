using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpFeatures
{
    class Program
    {
        static void Main(string[] args)
        {
            Product p1 = new Product { Id = 1, Name = "Laptop", Description = "Windows OS", UnitPrice= 50000, Quantity = 10};
            Product p2 = new Product{Id = 2,Name = "Smartphone", Description = "Android",UnitPrice = 20000, Quantity = 20};
           
            Console.WriteLine("Before Swapping:");
            Console.WriteLine("\nProduct1: "+p1);
            Console.WriteLine("\nProduct2: " + p2);
            
            Swap(ref p1, ref p2);
            
            Console.WriteLine("\nAfter Swapping:");
            Console.WriteLine("\nProduct1: " + p1);
            Console.WriteLine("\nProduct2: " + p2);
           
            int radius= 5;
            double area,circumference;
            Calculate(radius, out area, out circumference);
            Console.WriteLine("\nArea: "+area+"\nCircumference: " + circumference);
            

            Console.ReadLine();
        }

        public static void Swap(ref Product p1, ref Product p2)
        {
            Product temp = p1;
            p1 = p2;
            p2 = temp;
        }

        public static void Calculate(int radius, out double area, out double circumference)
        {
            area = radius * radius * (3.14);
            circumference = 2 * radius * (3.14);
        }
    }
}
