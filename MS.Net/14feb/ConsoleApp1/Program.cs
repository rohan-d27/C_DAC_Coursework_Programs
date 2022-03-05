using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using HR;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" Hello World!");
            Person p1 = new Person("a", "b", "ab@gmail.com", 1234343);
            Console.WriteLine(" First Name: " + p1.FirstName + ", " + "Last sName: " + p1.LastName + ", " + "Email: " + p1.Email + ", " + "Contact Number: " + p1.ContactNumber);
            Console.WriteLine("\n From To String Method: " + p1);
            Person p2 = new Person();
            Person p3 = new Person();
            Console.WriteLine("\n Count: " + Person._count);
            Console.ReadLine();
        }
    }
}
