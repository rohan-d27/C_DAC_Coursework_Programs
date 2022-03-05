using System;

namespace GCDemoApp
{
    public class Person:IDisposable
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }

        public Person() {

            FirstName = "ABC";
            LastName = "XYZ";
            Console.WriteLine(" Initializing instance and acquiring resource needed for execution of an instance during life time");
        }
        public Person(string fname, string lname) {
            FirstName = fname;
            LastName = lname;
            Console.WriteLine(" Initializing instance and acquiring resource needed for execution of an instance during life time");
        }

        public override string ToString()
        {
            return FirstName + " " + LastName;
        }

        //Deterministic Finalization
        public void Dispose()
        {
            Console.WriteLine(" DeInitialzing resources");
            GC.SuppressFinalize(this);

        }

        //InDeterministic Finalization

        ~Person()
        {
            Console.WriteLine(" DeInitialzing resources if they have acquired  during life time of an instance.");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {

            using (Person prn2 = new Person("Ganesh", "Shinde"))
            {
                //System.Threading.Thread.Sleep(2000);
                Console.WriteLine(prn2);
            }
          
      

            Console.WriteLine(" Main function is about to exit");
            Console.ReadLine();
        }
    }
}
