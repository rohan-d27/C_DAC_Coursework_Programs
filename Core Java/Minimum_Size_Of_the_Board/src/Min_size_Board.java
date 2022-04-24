import java.util.Scanner;

public class Min_size_Board {

	public static void main(String[] args) {
		
		int n, k, count = 1, dimension = 1;
		System.out.println("Enter two numbers separated by space");
		Scanner sc=new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        n=Integer.parseInt(str[0]);
        k=Integer.parseInt(str[1]);
		for (int i = 1; count < n; i ++) {
			dimension = dimension + k;
		
			count = count + (1 + i * 2);
			
		}
		System.out.println(dimension);
		
	}

}
