using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PartialClassEx
{
    partial class Customer
    {
        public int OrderId {get; set; }
        public string OrderDetails { get; set;}

        public Customer(int customerId, string customerName, int orderId, string orderDetails) : this(customerId, customerName)
        {
            Console.WriteLine("Constructor2 called");
            OrderId = orderId;
            OrderDetails = orderDetails; 
        }

        public override string ToString()
        {
            return "Customer Id: "+CustomerId+", Customer Name: "+CustomerName+", OrderId: "+OrderId+", OrderDetails: "+OrderDetails;
        }
    }
}
