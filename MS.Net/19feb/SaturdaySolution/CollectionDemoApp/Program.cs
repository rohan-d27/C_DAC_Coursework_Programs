using System;
using System.Collections.Generic;

using System.Text;
using System.Threading.Tasks;

namespace CollectionDemoApp
{
    public class Person
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }

        public Person() { }

        public Person(string fname, string lname) { }

        public override string ToString()
        {
            return FirstName + " " + LastName;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            string[] names = { "Rajiv", "Ram", "Chetan" };
            object[] objects =
            {
                "Chetana",
                456,
                true,
                new Person { FirstName = "Manoj", LastName = "Shinde" }
            };

            foreach (Object obj in objects)
            {
                Console.WriteLine(obj);
            }

            // ArrayList people = new ArrayList();
            List<Person> people = new List<Person>();
            people.Add(new Person { FirstName = "Manoj", LastName = "Shinde" });
            people.Add(new Person { FirstName = "Sanjeev", LastName = "Sharma" });
            people.Add(new Person { FirstName = "Ranjana", LastName = "Valimbe" });

            foreach (Person p in people)
            {
                Console.WriteLine(p);
            }

            Stack<Person> stack = new Stack<Person>();
            stack.Push(new Person { FirstName = "Ranjana", LastName = "Valimbe" });
            stack.Push(new Person { FirstName = "Kimaya", LastName = "Nene" });

            Person thePerson = stack.Pop();
            Console.WriteLine(thePerson);

            Dictionary<string, Person> employees = new Dictionary<string, Person>();
            employees.Add("CEO", new Person { FirstName = "Mukesh", LastName = "Ambani" });
            employees.Add("CTO", new Person { FirstName = "Rishubh", LastName = "Kulkarni" });
            employees.Add(
                "Vice President",
                new Person { FirstName = "Neeta", LastName = "Ambani" }
            );
            employees.Add("Mentor", new Person { FirstName = "Sham", LastName = "Pande" });

            Person p4 = employees["Mentor"];
            Console.WriteLine(p4);

            employees["Mentor"] = new Person { FirstName = "Meenal", LastName = "Sharan" };

            Console.WriteLine(employees["Mentor"]);

            Console.ReadLine();
        }
    }
}
