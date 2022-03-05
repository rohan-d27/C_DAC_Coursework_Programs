using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public class Program
    {
        public static void SaveData(string path, Customer cust)
        {
            FileStream fi = new FileStream(path, FileMode.OpenOrCreate);
            BinaryFormatter b = new BinaryFormatter();
            b.Serialize(fi, cust);
            fi.Close();
        }

        public static Customer LoadData(string path)
        {
            BinaryFormatter b = new BinaryFormatter();
            FileStream fo = new FileStream(path, FileMode.Open);
            Customer co = b.Deserialize(fo) as Customer;


            return co;
        }

        private static void Main(string[] args)
        {
            Customer c = new Customer
            {
                FirstName = "Sham",
                LastName = "Singh",
                Email = "sham.singh@gmail.com",
                ContactNumber = "9988776655"
            };

            //give pathname+filename
            string path = @"C:\Users\Dharurkar\Desktop\MS_Dot_Net\test";

            SaveData(path, c);

            Console.WriteLine("Serialization is successfully performed...");

            Customer theCustomer = LoadData(path);

            Console.WriteLine("\n"+theCustomer.FirstName + " " + theCustomer.LastName + " " + theCustomer.Email + " " + theCustomer.ContactNumber);

            Console.ReadLine();
        }
    }
}
