using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HRClassLibrary
{
    public class Person
    {
        public String FirstName { get; set; }
        public String LastName { get; set; }
        public String Email { get; set; }
        public String ContactNumber { get; set; }

        public Person(String fname, String lname, String email, String contactNo)
        {
            this.FirstName = fname;
            this.LastName = lname;
            this.Email = email;
            this.ContactNumber = contactNo;
        }

        public override String ToString()
        {
            return "\nFirstname: "+FirstName + "\nLastname: " + LastName + "\nEmail: " + Email + "\nContactNo.: " + ContactNumber;
        }
    }
}
