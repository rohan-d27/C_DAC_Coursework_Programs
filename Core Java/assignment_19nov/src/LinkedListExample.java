

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer>list=new LinkedList<Integer>();
		menu(list);
	}

	public static void menu(List<Integer> list)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***** MENU *****\n1)Populate list \n2)Showlist \n3)Sum \n4)remove element");
		System.out.println("Enter your choice:");
		int key=sc.nextInt();

		switch (key) {
		case 1:
			populateList(list);
			menu(list);
			break;
		case 2:
			showList(list);
			menu(list);
			break;
		case 3:
			sumAll(list);
			menu(list);
			break;	
		case 4:
			removeElement(list);
			menu(list);
			break;	
		default:
			break;
		}

	}

	public static void populateList(List<Integer> list)
	{

		Scanner sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("Do you want insert or append? ( Enter no to exit loop )");
			String  key=sc.next();

			if(key.equalsIgnoreCase("insert"))
			{

				if(list.size()==0)
				{
					System.out.println("Enter number to insert:");
					int x=sc.nextInt();
					list.add(x);
				}
				else
				{
					System.out.println("Enter index at  which you want to insert");

					int id=sc.nextInt();
					if(id>=0&&id<=list.size())
					{
						System.out.println("Enter number to insert:");
						int x=sc.nextInt();
						list.add(id,x);
					}
					else
					{
						System.out.println("Enter valid number!!!");
					}
				}
			}

			if(key.equalsIgnoreCase("append"))
			{
				System.out.println("Enter number to append:");
				int y=sc.nextInt();
				list.add(list.size(),y);
			}

			if(key.equalsIgnoreCase("no"))
			{
				break;
			}
		}
	}
	public static void showList(List<Integer> list)
	{
		System.out.println(list);
	}

	public static void sumAll(List<Integer> list)
	{
		int sum=0;

		for(int i=0;i<list.size();i++)
		{
			sum+=list.get(i);
		}
		System.out.println("Sum: "+sum);
	}

	public static void removeElement(List<Integer> list)
	{ 
		Scanner sc=new Scanner(System.in);

		System.out.println("you want to delete by index or value");
		String  key=sc.next();

		if(key.equalsIgnoreCase("index"))
		{
			System.out.println("Enter index to remove");
			int i=sc.nextInt();
			list.remove(i);
			System.out.println("list:"+list);
		}

		if(key.equalsIgnoreCase("value"))
		{
			System.out.println("Enter value to remove");
			Integer v=sc.nextInt();
			list.remove(v);
			System.out.println("list:"+list);
		}

	}
}
