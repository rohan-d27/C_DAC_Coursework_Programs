using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static DelegatePractice.Dispatchers;

namespace DelegatePractice
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            //Callback function
            //Handlers
            //Action methods
            // REST API

            //Monitor();  //static linking   , early binding, compile time linking
            //the function is resolved at compile time
            Controller theController = new Controller();

            //step 3: Create delegate object and register address of method to be invoked

            Operation api = new Operation(theController.Get);
            // late binding, dynamic binding
            //registering the function with object
            //it is an instance but act like function pointer
            string req = "";
            string res = "";
            //step 4: invoke delegate

            api(req, res);
            //Object is behaving like a function

            MathController mathController = new MathController();
            ArithmaticOperation arithOp = new ArithmaticOperation(mathController.Subtract);

            int result = arithOp(67, 45);

            Console.WriteLine("Arithmetic result=" + result);

            Console.ReadLine();

        }
    }
}