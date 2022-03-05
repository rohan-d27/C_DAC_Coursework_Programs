using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestConsoleApp
{
    class CollectionTest
    {
        static void Main(string[] args)
        {
            //2d array /Rectangular array
            int[,] arr = new int[2, 3] { { 00, 01, 02 }, { 10, 11, 12 } };
            int n1 = arr[1, 1];
            Console.WriteLine("arr[1, 1] = " + n1);

            //Jagged array
            int[][] arr2 = new int[2][];
            arr2[0] = new int[] { 00, 01, 02, 03 };
            arr2[1] = new int[] { 10, 11, 12, 13, 14, 15 };

            int n = arr2[1][2];

            int c1 = arr2[0].Length;
            int c2 = arr2[1].Length;

            Console.WriteLine("arr2[1][2] =" + n);
            Console.WriteLine("arr2[0] length =" + c1);
            Console.WriteLine("arr2[1] length =" + c2);

            int[] arr3 = { 70, 50, 40, 60, 90, 80 };
            Console.Write("\nUnSorted Array: ");
            foreach (int mark in arr3)
            {
                Console.Write(mark + "\t");
            }

            Array.Sort(arr3);
            Console.Write("\nSorted Array:   ");
            foreach (int mark in arr3)
            {
                Console.Write(mark + "\t");
            }
            Array.Reverse(arr3);
            Console.Write("\nReverse Array:  ");
            foreach (int mark in arr3)
            {
                Console.Write(mark + "\t");
            }
            Console.ReadLine();

        }
    }
}
