using System;

namespace ConsoleApp1
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
        void IOrderDetails.ShowDetails()
        {
            Console.WriteLine("Order Details");
        }

        void ICustomerDetails.ShowDetails()
        {
            Console.WriteLine("Customer Details");
        }
    }
}