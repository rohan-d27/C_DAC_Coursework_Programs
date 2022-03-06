using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExternalDemo2
{
    static class ExtensionClass
    {
        public static void Cube(this Square obj,int num)
        {
            obj.Result = num * num * num;
        }
    }
}
