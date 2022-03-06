using System.Collections.Generic;
using BOL;
using DAL;

namespace BLL
{
    public class EmployeeManager
    {
        public List<Employee> GetAll()
        {
            List<Employee> employees = EmployeeDaoDisConnected.GetAllEmployees();
            return employees;
        }

        public Employee GetById(int id)
        {
            // Employee emp = EmployeeDao.GetBy(id);
            Employee emp = EmployeeDaoDisConnected.GetBy(id);
            return emp;
        }

        public bool Insert(Employee emp)
        {
            //verification
            //Preprocessing logic before inserting data to backend
            // return EmployeeDao.InsertWithParameters(emp);
            return EmployeeDaoDisConnected.Insert(emp);
        }

        public bool Delete(int id)
        {
            bool approval = true;  // invoke other // check the role of caller person
            if (approval)
            {
                return EmployeeDao.Delete(id);
            }
            else
            {
                return EmployeeDaoDisConnected.Delete(id);
            }
        }

        public bool Update(Employee emp)
        {
            return EmployeeDaoDisConnected.Update(emp);
        }
    }
}