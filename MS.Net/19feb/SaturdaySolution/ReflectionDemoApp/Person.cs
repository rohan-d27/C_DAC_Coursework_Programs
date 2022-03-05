using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReflectionDemoApp
{
    public class Person
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }

        public Person() { }
        public Person(string fname, string lname) { }

        public override string ToString()
        {
            return base.ToString();
        }
    }
}
