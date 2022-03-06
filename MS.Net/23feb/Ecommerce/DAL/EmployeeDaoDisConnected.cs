using System.Collections.Generic;
using BOL;
using System.Data;
using MySql.Data.MySqlClient;
using System.Configuration;

namespace DAL
{
    //DisConnected Data Access Mode
    public class EmployeeDaoDisConnected
    {
        public static string conString = ConfigurationManager.ConnectionStrings["netdb"].ConnectionString;

        public static List<Employee> GetAllEmployees()
        {
            List<Employee> employees = new List<Employee>();

            MySqlConnection con = new MySqlConnection(conString);
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM employees";
            try
            {
                MySqlDataAdapter da = new MySqlDataAdapter(cmd);
                DataSet ds = new DataSet();
                da.Fill(ds);  /// fill method internally takes care of openning connection fetching data
                              // and filling inside data set and then closing  opened connection
                DataTable dtEmployees = ds.Tables[0];
                DataTable dtTasks = ds.Tables[0];
                DataRowCollection rows = dtEmployees.Rows;
                foreach (DataRow row in rows)
                {
                    Employee emp = new Employee();
                    emp.Id = int.Parse(row["ID"].ToString());  //int.Parse, float.Parse, double.Parse
                    emp.Name = row["Name"].ToString();
                    emp.Designation = row["Designation"].ToString();
                    emp.Salary = double.Parse(row["Salary"].ToString());
                    employees.Add(emp);
                }
            }
            catch (MySqlException exp)
            {
                //Graceful termination of application
                string expMessage = exp.Message;
            }
            return employees;
        }

        public static Employee GetBy(int id)
        {
            Employee emp = null;
            MySqlConnection con = new MySqlConnection(conString);
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM employees WHERE ID=" + id;
            try
            {
                MySqlDataAdapter da = new MySqlDataAdapter(cmd);
                DataSet ds = new DataSet();
                da.Fill(ds);  /// fill method internally takes care of openning connection fetching data
                              // and filling inside data set and then closing  opened connection
                DataTable dtEmployees = ds.Tables[0];

                DataRowCollection rows = dtEmployees.Rows;
                DataRow row = rows[0];

                emp = new Employee();
                emp.Id = int.Parse(row["Id"].ToString());  //int.Parse, float.Parse, double.Parse
                emp.Name = row["Name"].ToString();
                emp.Designation = row["Designation"].ToString();
                emp.Salary = int.Parse(row["Salary"].ToString());
            }
            catch (MySqlException exp)
            {
                //Graceful termination of application
                string expMessage = exp.Message;
            }
            return emp;
        }

        public static bool Insert(Employee emp)
        {
            bool status = false;
            MySqlConnection con = new MySqlConnection(conString);
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM employees";
            try
            {
                MySqlDataAdapter da = new MySqlDataAdapter(cmd);
                MySqlCommandBuilder builder = new MySqlCommandBuilder(da);  //*****************************
                DataSet ds = new DataSet();
                da.Fill(ds);  /// fill method internally takes care of openning connection fetching data
                              // and filling inside data set and then closing  opened connection
                DataTable dtEmployees = ds.Tables[0];
                DataRow newRow = dtEmployees.NewRow();
                newRow["Id"] = emp.Id;
                newRow["Name"] = emp.Name;
                newRow["Designation"] = emp.Designation;
                newRow["Salary"] = emp.Salary;

                DataRowCollection rows = dtEmployees.Rows;
                rows.Add(newRow);
                da.Update(ds);  // update method will use Command Builder instance for creating Command object for new row
                status = true;
            }
            catch (MySqlException exp)
            {
                //Graceful termination of application
                string expMessage = exp.Message;
            }
            return status;


        }

        public static bool Delete(int id)
        {
            bool status = false;
            MySqlConnection con = new MySqlConnection(conString);
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM employees";
            try
            {
                MySqlDataAdapter da = new MySqlDataAdapter(cmd);
                MySqlCommandBuilder builder = new MySqlCommandBuilder(da);
                DataSet ds = new DataSet();
                da.Fill(ds);  /// fill method internally takes care of openning connection fetching data
                              // and filling inside data set and then closing  opened connection
                DataTable dtEmployees = ds.Tables[0];

                DataColumn[] columns = new DataColumn[1];
                columns[0] = dtEmployees.Columns["ID"];
                dtEmployees.PrimaryKey = columns;

                DataRowCollection rows = dtEmployees.Rows;
                DataRow foundRow = rows.Find(id);
                foundRow.Delete();
                //string Name = foundRow["Name"].ToString();

                //rows.Remove(foundRow);
                da.Update(ds);
            }
            catch (MySqlException exp)
            {
                //Graceful termination of application
                string expMessage = exp.Message;
            }

            return status;
        }

        public static bool Update(Employee emp)
        {
            bool status = false;
            MySqlConnection con = new MySqlConnection(conString);
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "SELECT * FROM employees";
            try
            {
                MySqlDataAdapter da = new MySqlDataAdapter(cmd);
                MySqlCommandBuilder builder = new MySqlCommandBuilder(da);
                DataSet ds = new DataSet();
                da.Fill(ds);  /// fill method internally takes care of openning connection fetching data
                              // and filling inside data set and then closing  opened connection
                DataTable dtEmployees = ds.Tables[0];

                DataColumn[] columns = new DataColumn[1];
                columns[0] = dtEmployees.Columns["Id"];
                dtEmployees.PrimaryKey = columns;

                DataRowCollection rows = dtEmployees.Rows;

                DataRow foundRow = rows.Find(emp.Id);

                foundRow["Name"] = emp.Name;
                foundRow["Salary"] = emp.Salary;
                foundRow["Designation"] = emp.Designation;
                da.Update(ds);
            }
            catch (MySqlException exp)
            {
                //Graceful termination of application
                string expMessage = exp.Message;
            }

            return status;
        }
    }
}