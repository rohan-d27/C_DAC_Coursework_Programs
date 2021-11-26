package has_a_relation;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main_product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GregorianCalendar obj=new GregorianCalendar();
		int td=obj.get(Calendar.DATE);
		int tm=obj.get(Calendar.MONTH)+1;
		int ty=obj.get(Calendar.YEAR);
		System.out.println("Enter number of products:");
		int x=sc.nextInt();
		Product[] arr=new Product[x];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Product();
			arr[i].populate_product();	
		}

		System.out.println("Enter product name you want to buy:");
		String n=sc.next();
		System.out.println("Enter Quantity");
		int m=sc.nextInt();
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getProductname().equals(n))
			{
				if(arr[i].getExpdate().getYear()>ty)
				{
					System.out.println("******* Bill *******");
					System.out.println(arr[i]);
					total=arr[i].getPrice()*m;
					System.out.println("Total cost:"+ total);
				}
				else if(arr[i].getExpdate().getYear()==ty)
				
				{
					if(arr[i].getExpdate().getMonth()>tm)
					{
						System.out.println("******* Bill *******");
						System.out.println(arr[i]);
						total=arr[i].getPrice()*m;
						System.out.println("Total cost:"+ total);
					}
						else if(arr[i].getExpdate().getMonth()==tm)
						{
						
							if(arr[i].getExpdate().getDate()>td)
						{
								System.out.println("******* Bill *******");
							System.out.println(arr[i]);
							total=arr[i].getPrice()*m;
							System.out.println("Total cost:"+ total);
						}
							else if(arr[i].getExpdate().getDate()==td)
							{
								System.out.println("******* Bill *******");
								System.out.println(arr[i]);
								total=arr[i].getPrice()*m;
								System.out.println("Total cost:"+ total);
							}
						else
						{
							System.out.println("Product is expired. Sorry for inconvenience !!!");
						}
						
						
					}
					else
					{
						System.out.println("Product is expired. Sorry for inconvenience !!!");
					}
					
				}
				
				else
				{
					System.out.println("Product is expired. Sorry for inconvenience !!!");
				}
			}
			else
			{
				System.out.println("Enter valid product name!!");
			}
			}
	}

}
