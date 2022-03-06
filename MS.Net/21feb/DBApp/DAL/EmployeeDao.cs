using System;
using System.Collections.Generic;
using MySql.Data.MySqlClient;

namespace DBApp
{
    public class EmployeeDao
    {
        public static List<Employee> GetAll()
        {
            //GetEmployees code
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            List<Employee> allEmployees = new List<Employee>();
            try
            {
                con.Open();
                string query = "SELECT * from employees ";
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;

                MySqlDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    int id = int.Parse(reader["ID"].ToString());
                    string name = reader["Name"].ToString();
                    string salary = reader["Salary"].ToString();
                    string designation = reader["Designation"].ToString();
                    Employee emp = new Employee();
                    emp.Id = id;
                    emp.Name = name;
                    emp.Designation = designation;
                    emp.Salary = double.Parse(salary);
                    allEmployees.Add(emp);
                    // Console.WriteLine(name + " " + salary + " " + designation);
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

            return allEmployees;
        }

        public static Employee Get(int empId)
        {
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            Employee theEmp = null;
            try
            {
                con.Open();
                string query = "SELECT * from employees WHERE ID=" + empId;
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;

                MySqlDataReader reader = cmd.ExecuteReader();
                if (reader.Read())
                {
                    int id = int.Parse(reader["ID"].ToString());
                    string name = reader["Name"].ToString();
                    string salary = reader["Salary"].ToString();
                    string designation = reader["Designation"].ToString();
                    theEmp = new Employee();
                    theEmp.Id = id;
                    theEmp.Name = name;
                    theEmp.Designation = designation;
                    theEmp.Salary = double.Parse(salary);
                    // Console.WriteLine(name + " " + salary + " " + designation);
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
            return theEmp;
        }

        public static bool Delete(int empId)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();
                string query = "DELETE from employees WHERE ID=" + empId;
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

        public static bool Insert(Employee emp)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();
                string query =
                    "INSERT INTO employees (ID,Name, Designation, Salary) values("+ emp.Id+ ",'" + emp.Name + "','"+ emp.Designation + "'," + emp.Salary
                    + ")";
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

                string query =
                    "UPDATE employees SET name='" + name + "' where Id='" + id + "'";
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

        public static bool UpdateDesignation(int id, string des)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();

                string query =
                    "UPDATE employees SET Designation='"
                    + des
                    + "' where Id='"
                    + id
                    + "'";
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

        public static bool UpdateSalary(int id, double sal)
        {
            bool status = false;
            string conString = "server=localhost; user=root;database=netdb;password=Rohan@16161035";
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();

                string query =
                    "UPDATE employees SET Salary='" + sal + "' where Id='" + id + "'";
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
