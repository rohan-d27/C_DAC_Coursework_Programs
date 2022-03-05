using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Govt;
namespace Banking
{
   public  class Account
    {
        public event BankOperation underBalance;
        public event TaxOperation overBalance;

        public double Balance { get; set; }
        public Account(double amount)
        {
            this.Balance = amount;
        }
        public void Deposit(double amount) {

            this.Balance = this.Balance + amount;

            if(Balance > 250000)
            {
                //Raise an event
                overBalance();
            }

        }
        public void Widthdraw(double amount)
        {
            this.Balance = this.Balance - amount;
            if(Balance <= 1000)
            {   // raise an event
                underBalance();
            }
        }
    }
}
