using System;
using System.Collections;
namespace EnumerationDemoApp
{
    public class Player
    {
        public string Name { get; set; }
        public int Score { get; set; }
    }

    public class Team:IEnumerable
    {
        private Player[] players;
        public Team()
        {
            players = new Player[3];
            players[0] = new Player { Name = "Sachin", Score = 40000 };
            players[1] = new Player { Name = "Rajiv", Score = 78000 };
            players[2] = new Player { Name = "Sameer", Score = 23000 };
        }

        public IEnumerator GetEnumerator()
        {
           return  players.GetEnumerator();
           
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Team india = new Team();
            foreach( Player c in india)
            {
                Console.WriteLine(c.Name + " " + c.Score);
            }
            Console.ReadLine();
        }
    }
}
