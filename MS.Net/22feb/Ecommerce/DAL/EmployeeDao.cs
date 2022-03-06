using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using MySql.Data.MySqlClient;
using BOL;
namespace DAL //Data Access Layer
{
    public static class EmployeeDao
    {
        public static List<Employee> GetAllEmployees()
        {
            List<Employee> employees = new List<Employee>();

            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;

            MySqlConnection con = new MySqlConnection(conString);
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = "SELECT * from employees";
                // cmd.CommandType = CommandType.StoredProcedure;
                con.Open();
                MySqlDataReader resultSet = cmd.ExecuteReader(); 
                                                                 
                while (resultSet.Read())
                {
                    Employee emp = new Employee();
                    emp.Id = int.Parse(resultSet["ID"].ToString());  
                    emp.Name = resultSet["Name"].ToString();
                    emp.Designation = resultSet["Designation"].ToString();
                    emp.Salary = int.Parse(resultSet["Salary"].ToString());
                    employees.Add(emp);
                }
                resultSet.Close();
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return employees;
        }
        public static Employee GetBy(int id)
        {
            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;
            MySqlConnection con = new MySqlConnection(conString);
            Employee emp = null;
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = "SELECT * from employees WHERE ID=" + id;
                con.Open();
                MySqlDataReader resultSet = cmd.ExecuteReader();
                if (resultSet.Read())
                {
                    emp = new Employee();
                    emp.Id = int.Parse(resultSet["ID"].ToString());
                    emp.Name = resultSet["Name"].ToString();
                    emp.Designation = resultSet["Designation"].ToString();
                    emp.Salary = int.Parse(resultSet["Salary"].ToString());
                }
                resultSet.Close();
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return emp;
        }
        public static bool Delete(int id)
        {
            bool status = false;
            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;
            MySqlConnection con = new MySqlConnection(conString);
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = "DELETE from employees WHERE ID=" + id;
                con.Open();
                int rowsAffected = cmd.ExecuteNonQuery();
                status = true;
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return status;
        }
        public static bool Update(Employee emp)
        {
            bool status = false;
            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;
            MySqlConnection con = new MySqlConnection(conString);
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = "UPDATE employees  SET Name='" + emp.Name + "',Designation='" + emp.Designation +
                                   "', Salary=" + emp.Salary + " WHERE ID=" + emp.Id;
                con.Open();
                int rowsAffected = cmd.ExecuteNonQuery();
                status = true;
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return status;
        }
        public static bool Insert(Employee emp)
        {
            bool status = false;
            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;
            MySqlConnection con = new MySqlConnection(conString);
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = "INSERT INTO employees (Id,Name, Designation, Salary) values(" + emp.Id + ",'" + emp.Name + "'," + emp.Designation + "," + emp.Salary + ")";
                con.Open();
                int rowsAffected = cmd.ExecuteNonQuery();
                status = true;
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return status;

        }
        public static bool InsertWithParameters(Employee emp)
        {
            bool status = false;
            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;
            MySqlConnection con = new MySqlConnection(conString);
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;              
                con.Open();            
                cmd.CommandText = "INSERT INTO employees (Id,Name, Designation, Salary) values(@id, @empName, @empDesignation,@empSalary)";
                cmd.Parameters.AddWithValue("@id", emp.Id);
                cmd.Parameters.AddWithValue("@empName", emp.Name);
                cmd.Parameters.AddWithValue("@empDesignation", emp.Designation);
                cmd.Parameters.AddWithValue("@empSalary", emp.Salary);

                int rowsAffected = cmd.ExecuteNonQuery();
                status = true;
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp.Message);
            }
            return status;

        }
        public static bool CreateStoredProcedure() {
            bool status = false;
            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;
            MySqlConnection con = new MySqlConnection(conString);
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                con.Open();
               
                cmd.CommandText = "DROP  PROCEDURE IF EXISTS add_people";
                cmd.ExecuteNonQuery();
                cmd.CommandText = "DROP  TABLE  IF  EXISTS people";
                cmd.ExecuteNonQuery();
                cmd.CommandText= "CREATE TABLE people ( " +
                                  "id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, first_name VARCHAR(20)," +
                                  "last_name VARCHAR(20), birthdate DATE)";
                cmd.ExecuteNonQuery();

                cmd.CommandText= "CREATE PROCEDURE add_people(" +
                                  "IN fname VARCHAR(20), IN lname VARCHAR(20), IN bday DATETIME, OUT id INT)" +
                                  "BEGIN INSERT INTO people(first_name, last_name, birthdate) " +
                                  "VALUES(fname, lname, DATE(bday)); SET id = LAST_INSERT_ID(); END";

                cmd.ExecuteNonQuery();
                status = true;
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp);
            }
            finally {
            }

            return status;
        }
        public static bool InvokeStoredProcedure() {
            bool status = false;
            
            string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;
            MySqlConnection con = new MySqlConnection(conString);
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = "add_people";
                cmd.CommandType = CommandType.StoredProcedure;

                cmd.Parameters.AddWithValue("@lname", "Smith");
                cmd.Parameters["@lname"].Direction = ParameterDirection.Input;

                cmd.Parameters.AddWithValue("@fname", "Tony");
                cmd.Parameters["@fname"].Direction = ParameterDirection.Input;

                cmd.Parameters.AddWithValue("@bday", "1990-01-01");
                cmd.Parameters["@bday"].Direction = ParameterDirection.Input;

                cmd.Parameters.Add("@id", MySqlDbType.Int32);
                cmd.Parameters["@id"].Direction = ParameterDirection.Output;

                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
            }
            catch (MySqlException exp)
            {
                Console.WriteLine(exp);
            }

            finally { 
            }

            return status;
        }

    }
}
