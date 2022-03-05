using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HRClassLibrary
{
    public class Employee:Person
    {
        public int EmpId { get; set; }
        public String Location { get; set; }
        public String Department { get; set; }
        public double BasicSalary { get; set; }
        public double DailyAllowance { get; set; }
       
       

        public Employee(int empid, String fname, String lname, String email, String contactNo, String location,String dept,double basicSal, double dailyAllowance) : base(fname, lname, email, contactNo)
        {
            this.EmpId = empid;
            this.Location = location;
            this.Department = dept;
            this.BasicSalary = basicSal;
            this.DailyAllowance = dailyAllowance;
        }

        public override String ToString()
        {
            return "\nEmpID: "+EmpId + "" +base.ToString()+"\nLocation: " + Location + "\nDepartment: " +Department+"\nBasicSal: "+BasicSalary+"\nDaily Allowance: "+DailyAllowance ;
        }

        public virtual double ComputePay()
        {
            double totalSalary = DailyAllowance* 30 + BasicSalary;
            return totalSalary;
        }

    }
}
