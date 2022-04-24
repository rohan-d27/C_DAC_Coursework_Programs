import java.io.*;
import java.util.*;
 /*
You are given  pieces and a  board. The rows and columns are numbered from 1 to . 
 A cell on the intersection of the  row and  column is denoted as as .
The game's goal is to place  pieces numbered from  to  on the board.
The  piece lies on  while the following rule must be satisfied:
For all pairs of pieces  and ,. Here,  denotes the absolute value of .
Determine the smallest size of the board 
on which you can put  pieces according to the rules.
Output format
Print a single integer denoting the minimum value of  denoting the length of sides of the suitable board.
Sample Input
5 2
Sample Output
5*/
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        System.out.println("Enter two numbers separated by space");
        String[] str = br.readLine().split(" ");
         int n = Integer.parseInt(str[0]);// ex. n=5, n is number of cells
         int k = Integer.parseInt(str[1]);// ex. k=2, k is minimum distance between two cells
 
         int out_ = find(k, n);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static int find(int k, int n){
        double sqrtN = Math.sqrt(n);// 2.23
        int N = (int) Math.ceil(sqrtN);//N=3
        return (N + (N-1)*(k -1)); // 5 = minimum size of board
       
    
    }
}