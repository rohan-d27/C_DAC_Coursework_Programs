using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IndexerClassLibrary1
{
    public class Student
    {
       
        
        public int RollNo { get; set; } 
        public string Name { get; set; }
        
        private int[] Marks = new int[5];

        public Student(int rollNo, string name, int[] marks)
        {
            RollNo = rollNo;
            Name = name;
            Marks = marks;
        }
        public Student(int rollNo, string name)
        {
            RollNo = rollNo;
            Name = name;
        }
        public int this[int index]
        {
            get { return Marks[index]; }
            set {Marks[index] = value; }
        }
    public override string  ToString()
        {
            return "Roll No: " + RollNo +", Student Name: "+Name;
        }
    }
}
