using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HR
{
    class Person
    {
        private String _firstName, _lastName, _email;
        private int _contactNumber;
        public static int _count;
        public Person()//parameterless constructor
        {
            _count++;
        }

        public Person(string _firstName, string _lastName, string _email, int _contactNumber)//parameterized constructor
        {
            this._firstName = _firstName;
            this._lastName = _lastName;
            this._email = _email;
            this._contactNumber = _contactNumber;
            _count++;
        }
        public String FirstName //getter setter for first name
        {
            get
            {
                return _firstName;
            }
            set
            {
                _firstName = value;
            }
        }
        public String LastName
        {
            get
            {
                return _lastName;
            }
            set
            {
                _lastName = value;
            }
        }
        public String Email
        {
            get
            {
                return _email;
            }
            set
            {
                _email = value;
            }
        }
        public int ContactNumber
        {
            get
            {
                return _contactNumber;
            }
            set
            {
                _contactNumber = value;
            }
        }

        public override string ToString()//ToString Method
        {
            return "First Name: " + this.FirstName + ", " + "Last sName: " + this.LastName + ", " + "Email: " + this.Email + ", " + "Contact Number: " + this.ContactNumber;
        }

    }
}
