using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DBApp
{
    //POCO class for mapping field of Employees table 
   public  class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Designation { get; set; }
        public double Salary { get; set; }

        public Employee(int id, string name, string designation, double salary)
        {
            Id = id;
            Name = name;
            Designation = designation;
            Salary = salary;
        }
        public Employee()
        {
        }
    }

}
