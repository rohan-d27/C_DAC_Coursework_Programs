using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegatePractice
{
    class Controller
    {
        //Step 2: implement callback functions

        public void Get(string request, string response)
        {
            Console.WriteLine("fetch data from server......");
        }

        public void Post(string request, string response)
        {
            Console.WriteLine("Insert data to server......");
        }

        public void Put(string request, string response)
        {
            Console.WriteLine("Update data from server......");
        }

        public void Delete(string request, string response)
        {
            Console.WriteLine("Delete data from server......");
        }
    }
}
