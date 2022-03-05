using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpFeatures
{
    class Product
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public int Quantity { get; set; }
        public double UnitPrice { get; set; }

        public override string ToString()
        {
            return "\nProduct Id: "+this.Id + "\nName: " + this.Name +"\nDescription: "+this.Description+this.Description+"\nQuantity: "+this.Quantity+"\nUnit Price: " + this.UnitPrice;
        }
    }
}
