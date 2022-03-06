using System;
using System.Reflection;
 

namespace BuiltInAnnotationsApp
{
    //Writing Custom Annotation in C#
    // Step 1: Derive DeveloperAttribute class from Attribute 
    // step 2: Provid Attribute Target.
    // Step 3: Declare memebers for DeveloperAttribute.
    // Step 4: Define parameterized constructor for DeveloperAttribute.


    [AttributeUsage(AttributeTargets.All)]
    public class DeveloperAttribute : Attribute
    {
        private string name;
        private string level;
        private bool reviewed;
        public DeveloperAttribute()
        {
            this.name = "Rishabh Pant";
            this.level = "BugFixing";
            reviewed = false;
        }
        public DeveloperAttribute(string name, string level)
        {
            this.name = name;
            this.level = level;
            reviewed = false;
        }
        public string Name { get { return name; } }
        public string Level { get { return level; } }
        public bool Reviewed
        {
            get { return reviewed; }
            set { reviewed = value; }
        }
    }


    [Developer]
    public class Order
    {
        public int Id { get; set; }
        public DateTime OrderDate { get; set; }
        public double Amount { get; set; }
        public Customer PlacedBy { get; set; }
    }



    [Developer("Ram Kumar", "Inprogress")]
    public class Payment
    {
        public int Id { get; set; }
        public DateTime PaymentDate { get; set; }

        [Developer("Sham Sundar", "Inprogress")]
        public double Amount { get; set; }
        public Order PaymentOrder { get; set; }

        [Developer("Raj Kapoor", "Inprogress")]
        public void ProcessPayment()
        {

        }


    }


    [Developer("Swami  Vivek", "BugFixing")]
    public class Delivery
    {
        public int Id { get; set; }
        public DateTime DeliveryDate { get; set; }
        public string DeliveryAddress { get; set; }
    }
}
