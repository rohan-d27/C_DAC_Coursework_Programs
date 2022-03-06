using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExternalDemo2
{
    sealed class Square
    {
        public int Result { get; set; }

        public void SqaureNum(int num)
        {
            this.Result = num * num;
        }
    }
}
