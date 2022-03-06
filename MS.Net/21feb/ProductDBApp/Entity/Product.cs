using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProductDBApp.Entity
{
    class Product
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public int Cost { get; set; }

        public Product(int id, string name, int cost)
        {
            Id = id;
            Name = name;
            Cost = cost;
        }

        public Product()
        {
          
        }
    }
}
