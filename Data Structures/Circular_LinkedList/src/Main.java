import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CircularLL l1=new CircularLL();
		menu(l1);
		
	}
	public static void menu(CircularLL l1)
	{
		System.out.println("Enter choice from below:"
				+ "\n1.Insert"
				+ "\n2.Append"
				+ "\n3.Insert by Position"
				+ "\n4.DeletFirst"
				+ "\n5.Deletelast"
				+ "\n6.Delete by Postion"
				+ "\n7.Reverse CLL"
				+ "\n8.Display"
				+ "\n");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		while(c!=0)
		{
			switch (c) {
			case 1:
					{
						System.out.println("Enter integer data to insert:\n");
						int n=sc.nextInt();
						l1.insert(n);
						System.out.println(l1);
						menu(l1);
						break;
					}
				
			case 2:
					{
						System.out.println("Enter integer data to append:\n");
						int a=sc.nextInt();
						l1.append(a);
						System.out.println(l1);
						menu(l1);
						break;
					}
						
				
			case 3:
					{	
						System.out.println("Enter integer data:\n");
						int v=sc.nextInt();
						System.out.println("Enter postion");
						int p=sc.nextInt();
						l1.insertbypos(v,p);
						System.out.println(l1);
						menu(l1);
						break;
					}
				
				
			case 4:
					{
						l1.deletefirst();
						System.out.println(l1);
						menu(l1);
						break;
					}
				
				
			case 5:
					{
						l1.deletelast();
						System.out.println(l1);
						menu(l1);
						break;
					}
						
				
			case 6:
					{
						System.out.println("Enter position to delete data:\n");
						int m=sc.nextInt();
						l1.deletebypos(m);
						System.out.println(l1);
						menu(l1);
						break;
					}
				
				
			case 7:
					{
						l1.reverse();
						System.out.println("Reversed LinkedList:"+l1);
						menu(l1);
						break;
					}
				
				
			case 8:
					{
						System.out.println(l1);
						menu(l1);
						break;
					}
						
				


			default:
				break;
			}
		}
	}
}
