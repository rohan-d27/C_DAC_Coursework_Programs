using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExtensionDemoApp
{
    public sealed class Calculator
    {
        public int Result { get; set; }

        public void Addition(int num1, int num2)
        {
            Result = num1 + num2;
        }

        public void Subtraction(int num1, int num2)
        {
            Result = num1 - num2;
        }
    }
}