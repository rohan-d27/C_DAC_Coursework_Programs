using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PartialClassEx
{
    public  partial class Customer
    {

        public int CustomerId { get; set; }
        public string CustomerName { get; set; }

        public Customer(int customerId, string customerName)
        {
            Console.WriteLine("Constructor1 called");
            CustomerId = customerId;
            CustomerName = customerName;
        }
    }
}
