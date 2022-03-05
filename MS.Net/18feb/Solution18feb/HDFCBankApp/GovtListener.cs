using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Govt
{
    public delegate void TaxOperation();

    public class GovtListener
    {
        public static  void PayIncomeTax() {
            Console.WriteLine("20%  Income tax is deducted from your account");
        }

        public static void PayServiceTax()
        {
            Console.WriteLine("10%  Service tax is deducted from your account");
        }
    }
}
