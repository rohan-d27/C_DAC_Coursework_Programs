using System;
using System.Reflection;
namespace ReflectionDemoApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Assembly asm = Assembly.GetExecutingAssembly();
            Console.WriteLine(asm.FullName);
            Console.WriteLine(asm.Location);

            string path = @"C:\Users\Dharurkar\Desktop\MS_Dot_Net\19feb\SaturdaySolution\GraphicsLib\obj\Debug\GraphicsLib.dll";

            Assembly asmLib = Assembly.LoadFile(path);

            Type[] allTypes = asmLib.GetTypes();

            foreach( Type t in allTypes)
            {
                Console.WriteLine(t.FullName);
                MethodInfo[] methods = t.GetMethods();
                Console.WriteLine(" Method of  class : " + t.FullName);
                foreach(MethodInfo mi in methods)
                {
                    Console.WriteLine(mi.Name);
                }
            }

            Console.WriteLine("Showing reflection data about person instance");

            Person thePerson = new Person { FirstName = "Sachin", LastName = "Sharma" };

            Type instanceType=thePerson.GetType();
            Console.WriteLine(instanceType);
            PropertyInfo [] propertiesInfo= instanceType.GetProperties();
            foreach( PropertyInfo pi in propertiesInfo)
            {
                Console.WriteLine(pi.Name);
            }
            Console.ReadLine();
        }
    }
}
