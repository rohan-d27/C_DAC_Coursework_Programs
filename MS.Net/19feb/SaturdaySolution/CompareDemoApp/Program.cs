using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CompareDemoApp
{

    public class FootballPlayer : IComparable
    {
        public string Name { get; set; }
        public int Goals { get; set; }
        public int Age { get; set; }
        int IComparable.CompareTo(object obj)
        {
            FootballPlayer temp = (FootballPlayer)obj;
            if (this.Age > temp.Age)
                return 1;
            if (this.Age < temp.Age)
                return -1;
            else
                return 0;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            FootballPlayer[] players = {
                                        new FootballPlayer{ Name="Manoj", Goals =45, Age=23},
                                        new FootballPlayer{ Name="Sham",Goals=56, Age=35},
                                        new FootballPlayer{ Name="Rajiv",Goals=78, Age=28},
                                        new FootballPlayer{ Name="Manish",Goals=15, Age=18},
                                        new FootballPlayer {Name="Rakesh", Goals=90, Age=23},
                                        new FootballPlayer{ Name="Sameer",Goals=45, Age=46}

            };
            foreach (FootballPlayer player in players)
            {
                Console.WriteLine("Name: " + player.Name + ", Goals: " + player.Goals + " ,Age: " + player.Age);

            }
            Console.WriteLine("\n\nAfter sorting");
            Array.Sort(players);
            foreach (FootballPlayer player in players)
            {
                Console.WriteLine("Name: " + player.Name + " ,Goals: " + player.Goals + " ,Age:" + player.Age);

            }

            Console.ReadKey();
        }
    }
}
