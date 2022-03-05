using System;

namespace ClonningApp
{
    class Stack : ICloneable
    {
        int size; int[] sArr;
        public Stack(int s)
        {
            size = s;
            sArr = new int[size];
        }
        public object Clone()
        {
            //deep copy
            Stack s = new Stack(this.size);
            this.sArr.CopyTo(s.sArr, 0);
            return s;
        }
        public int this[int index]
        {
            get { return this.sArr[index]; }
            set { this.sArr[index] = value; }
        }
    }



    class Program
    {
        static void Main(string[] args)
        {
            Stack stack1 = new Stack(4);
            stack1[0] = 89;
            stack1[1] = 67;
            stack1[2] = 45;
            stack1[3] = 25;

            //Stack stack2 = stack1;   // it is just copy of reference
            Stack stack3 = (Stack)stack1.Clone();

            stack3[3] = 99;


        }
    }
}
