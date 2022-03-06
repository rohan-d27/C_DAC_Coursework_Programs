using MySqlConnector;
using ProductDBApp.Entity;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProductDBApp.DAO
{
    class ProductDAO
    {
        public static List<Product> GetAll()
        {
            //GetProducts code
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            List<Product> allProducts = new List<Product>();
            try
            {
                con.Open();
                string query = "SELECT * from product ";
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;

                MySqlDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    int id = int.Parse(reader["ID"].ToString());
                    string name = reader["Name"].ToString();
                    int cost = int.Parse(reader["Cost"].ToString());

                    Product pro = new Product();
                    pro.Id = id;
                    pro.Name = name;
                    pro.Cost = cost;
                    allProducts.Add(pro);
                }
                reader.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            finally
            {
                if (con.State == System.Data.ConnectionState.Open)
                {
                    con.Close();
                }
            }

            return allProducts;
        }

        public static Product Get(int proId)
        {
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            Product thepro = null;
            try
            {
                con.Open();
                string query = "SELECT * from Product WHERE ID=" + proId;
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;

                MySqlDataReader reader = cmd.ExecuteReader();
                if (reader.Read())
                {
                    int id = int.Parse(reader["ID"].ToString());
                    string name = reader["Name"].ToString();
                    int cost = int.Parse(reader["Cost"].ToString());
                    thepro = new Product();
                    thepro.Id = id;
                    thepro.Name = name;
                    thepro.Cost = cost;

                    reader.Close();
                }
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            finally
            {
                if (con.State == System.Data.ConnectionState.Open)
                {
                    con.Close();
                }
            }
            return thepro;
        }

        public static bool Delete(int proId)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();
                string query = "DELETE from Product WHERE ID=" + proId;
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;
                cmd.ExecuteNonQuery();
                status = true;
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            finally
            {
                if (con.State == System.Data.ConnectionState.Open)
                {
                    con.Close();
                }
            }

            return status;
        }

        public static bool Insert(Product pro)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();
                /*string query =
                     "INSERT INTO Product (ID,Name,Cost) values("
                     + pro.Id
                     + ",'"
                     + pro.Name
                     + "',"
                     + pro.Cost
                     + ")";*/
                // string queryFormat = "Insert into Product ID= {0},Name= {1},Cost= {2}";
                
                // string queryFormat = "Insert into Product(ID,Name,Cost) values({0},'{1}',{2})";
               
                string queryFormat = "Insert into Product values({0},'{1}',{2})";
                string query=string.Format(queryFormat,pro.Id,pro.Name,pro.Cost);
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;
                cmd.ExecuteNonQuery();
                status = true;
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            finally
            {
                if (con.State == System.Data.ConnectionState.Open)
                {
                    con.Close();
                }
            }
            return status;
        }

        public static bool UpdateName(int id, string name)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();

                string query = "UPDATE Product SET name='" + name + "' where Id='" + id + "'";
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;
                cmd.ExecuteNonQuery();
                status = true;
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return status;
        }

        public static bool UpdateCost(int id, int cs)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();

                string query = "UPDATE Product SET cost=" + cs + " where Id='" + id + "'";
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;
                cmd.ExecuteNonQuery();
                status = true;
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return status;
        }
    }
}
