using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Test
    {
        private static void Main(string[] args)
        {
            Transaction txn = new Transaction();
            //ICustomerDetails iCustDetail = txn;
            //iCustDetail.ShowDetails();

            IOrderDetails iOrderDetails = txn;
            iOrderDetails.ShowDetails();

            //nullable type

            bool? status = null;
            status = false;

            int? count = null;
            count = 50;
            Nullable<float> myValue = null;

            Console.WriteLine(status);
            Console.WriteLine(count);
            Console.ReadLine();
        }
    }
}