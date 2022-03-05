using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GraphicsLib
{
    public interface IOrderDetails
    {
        void ShowDetails();
    }
    public interface ICustomerDetails
    {
        void ShowDetails();
    }

    //Explicit Interface Inheritance
    public class Transaction : IOrderDetails, ICustomerDetails
    {
        void IOrderDetails.ShowDetails() { Console.WriteLine("Order Details"); }
        void ICustomerDetails.ShowDetails() { Console.WriteLine("Customer Details"); }

    }
}
