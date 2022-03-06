using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel;
namespace BuiltInAnnotationsApp
{
   [Serializable]
   public class Product
    {
        [Required]
        public int ID { get; set; }

       [Required]
       [StringLength(maximumLength:15, MinimumLength =5)]
        public string Title { get; set; }

        public string Description { get; set; }

        [Range(minimum:5, maximum:45)]
        [DisplayName("Price")]
        [RegularExpression(@"^\$?\d+(\.(\d{2}))?$")]
        public double UnitPrice { get; set; }

       
        public int Quantity { get; set; }


    }
}
