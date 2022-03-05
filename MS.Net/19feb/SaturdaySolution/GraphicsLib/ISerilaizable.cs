using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GraphicsLib
{
    //Defining contract

   public  interface ISerilaizable
    {
        bool Serialize();
        string DeSerialize(); 
    }
}
