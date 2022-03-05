using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpFeatures
{
    class Program3
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Program 3");
            ShowNames("Ram", "Sham", "Prakash", "Mohit", "Hardik");
            Console.ReadLine();
        }

        public static void ShowNames(params string[] names)
        {
            foreach (string name in names)
            {
                Console.WriteLine(name);
            }
        }
    }
}
