using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Banking
{
   
   //Refernce Types
   public delegate void BankOperation();
   public  class BankListener
    {
        public static void SendEmail()
        {
            Console.WriteLine("The message is sent to your registered email address.");
        }
        public static void SendSMS()
        {
            Console.WriteLine("The message is sent to your registered mobile number.");
        }
        public static void BlockAccount() {
            Console.WriteLine("Account has been blocked Temp. , contact relationship manager....");
        }
    }
}
