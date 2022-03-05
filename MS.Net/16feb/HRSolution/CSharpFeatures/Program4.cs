using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpFeatures
{
    class Program4
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Program 2");
            int[] marks = { 45, 65, 66, 35, 65 };
            string[] names = { "Ram", "Sham", "Raju", "Sanju" };
            Product[] prodArr =
            {
                new Product
                {
                    Id = 1,
                    Name = "Laptop",
                    Description = "Windows",
                    UnitPrice = 50000,
                    Quantity = 1
                },
                new Product
                {
                    Id = 2,
                    Name = "Smartphone",
                    Description = "Android",
                    UnitPrice = 15000,
                    Quantity = 2
                },
                new Product
                {
                    Id = 3,
                    Name = "Speaker",
                    Description = "15W ",
                    UnitPrice = 2000,
                    Quantity = 3
                },
                new Product
                {
                    Id = 4,
                    Name = "Headphone",
                    Description = "Bluetooth",
                    UnitPrice = 1000,
                    Quantity = 4
                },
                new Product
                {
                    Id = 5,
                    Name = "Charger",
                    Description = "Wireless ",
                    UnitPrice = 500,
                    Quantity = 5
                },
                new Product
                {
                    Id = 6,
                    Name = "Monitor",
                    Description = "FullHD ",
                    UnitPrice = 10000,
                    Quantity = 6
                },
            };

            Console.WriteLine("marks:"+marks[2]);
            Console.WriteLine("names: "+names[3]);

            foreach (Product p in prodArr)
            {
                Console.WriteLine(p);
            }

            Console.ReadLine();
        }
    }
}
