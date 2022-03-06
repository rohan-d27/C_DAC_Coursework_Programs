using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel;
 

namespace BuiltInAnnotationsApp
{

    //POCO class
    [Serializable]
   public  class Customer
    {
        [Required]
        public int Id { get; set; }
        [StringLength(maximumLength:10)]
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Email { get; set; }
        public string ContactNumber { get; set; }
    }
}
