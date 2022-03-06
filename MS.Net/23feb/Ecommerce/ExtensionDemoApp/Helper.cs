using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExtensionDemoApp
{
    //Rule for Extension method:
    // Helper class or utility class must be static
    // each extension method will always have first parameter defined using this keyword.
    // will always contain name of class which is to be extended

    public static class Helper
    {
        public static void Multiplication(this Calculator obj, int num1, int num2)
        {
            obj.Result = num1 * num2;
        }

        public static string CompanyTranslowerMethod(this string obj)
        {
            return "Welcome from Transflower";
        }
    }
}