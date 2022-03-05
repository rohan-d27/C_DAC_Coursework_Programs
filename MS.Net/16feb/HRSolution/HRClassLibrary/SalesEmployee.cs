using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HRClassLibrary
{
    public sealed class SalesEmployee:Employee
    {
        public double Target { get; set; }
        public double Achievement { get; set; }

        public double Incentive { get; set; }

        public SalesEmployee(int empid, string fname, string lname, string email, string contactNo, string location, String dept, double basicSal,double dailyAllowance, double target, double achivement, double incentive) : base(empid, fname, lname, email, contactNo, location,dept,basicSal,dailyAllowance)
        {
            this.Target = target;
            this.Achievement = achivement;
            this.Incentive = incentive;
        }

        public override double ComputePay()
        {
            double salary = 0;
            if (Achievement > Target)
            {
                salary = Incentive + base.ComputePay();
            }
            else
            {
                salary = base.ComputePay();
            }
            return salary;
        }


        public override string ToString()
        {
            return ""+base.ToString() + "\nAchievement: " + this.Achievement;
        }
    }
}
