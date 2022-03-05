using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegatePractice
{
    class Dispatchers
    {
        //refernce type
        //Step 1: Declare
        internal delegate void Operation(string request, string response);

        internal delegate int ArithmaticOperation(int op1, int op2);
    }
}
