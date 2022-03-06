using System.Collections.Generic;
using BOL;
using DAL;

namespace BLL //Business Logic Layer
{
    public class EmployeeManager
    {
        public List<Employee> GetAll()
        {
            List<Employee> employees = EmployeeDao.GetAllEmployees();

            return employees;
        }

        public Employee GetById(int id)
        {
            Employee emp = EmployeeDao.GetBy(id);
            return emp;
        }

        public bool Insert(Employee emp)
        {
            return EmployeeDao.InsertWithParameters(emp);
        }
    }
}
