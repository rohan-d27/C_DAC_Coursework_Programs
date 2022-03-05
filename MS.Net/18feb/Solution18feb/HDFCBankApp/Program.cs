using System;
using Banking;

namespace HDFCBankApp
{
    class Program
    {
        static void Main(string[] args)
        {
            //Instace Creation
            Account acct123 = new Account(2000);

            //Event Configuration
            //Add Hook to your account instance
            //Attach event handlers to event of an instace Account

            acct123.underBalance += new BankOperation(BankListener.BlockAccount);
            acct123.underBalance += new BankOperation(BankListener.SendEmail);
            acct123.underBalance += new BankOperation(BankListener.SendSMS);

            acct123.overBalance += new Govt.TaxOperation(Govt.GovtListener.PayIncomeTax);
            acct123.overBalance += new Govt.TaxOperation(Govt.GovtListener.PayServiceTax);

            //KISS
            //Keep it Simple and Stupid


            //Transation Management
            Console.WriteLine("Please enter amount to deposit");
            double amount = double.Parse(Console.ReadLine());
            acct123.Widthdraw(amount);
           // acct123.Deposit(amount);
            //Report Output
            Console.WriteLine("Remaining Balance= " + acct123.Balance);
            Console.ReadLine();

        }
    }
}
