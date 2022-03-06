using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuiltInAnnotationsApp
{
    class Program
    {
        static void Main(string[] args)
        {

            Order theOrder = new Order();
            theOrder.Id = 5645;
            theOrder.OrderDate = new DateTime(2021, 2, 21);
            theOrder.Amount = 56000;
            theOrder.PlacedBy = new Customer();
            theOrder.PlacedBy.FirstName = "Rajan";
            theOrder.PlacedBy.LastName = "Rajan";
            theOrder.PlacedBy.Email = "Rajan";
            theOrder.PlacedBy.ContactNumber = "9881735801";

            Type t = theOrder.GetType();

            foreach (Attribute attr in t.GetCustomAttributes(true))
            {
                DeveloperAttribute devAttribute =(DeveloperAttribute) attr;
                Console.WriteLine(devAttribute.Name);
                Console.WriteLine(devAttribute.Level);
                Console.WriteLine(devAttribute.Reviewed);
                devAttribute.Reviewed = true;
            }


            Console.ReadLine();
        }
    }
}
