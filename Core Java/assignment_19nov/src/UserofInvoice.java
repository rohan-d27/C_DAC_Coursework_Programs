import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserofInvoice {

	public static void main(String[] args) {
		List<Invoice> list=new ArrayList<Invoice>();
		Invoice i1=new Invoice(new MyDate(19,11,2021),15900,"Z","F");
		Invoice i2=new Invoice(new MyDate(11,1,2016),4550,"Y","E");
		Invoice i3=new Invoice(new MyDate(4,7,2019),9000,"X","D");
		Invoice i4=new Invoice(new MyDate(9,5,2021),7500,"V","C");
		Invoice i5=new Invoice(new MyDate(1,2,2020),100,"W","B");
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		System.out.println("Original List:");
		Iterator<Invoice> iterator = list.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());				
		}
		menu(list);
	}

	public static void menu(List<Invoice> list)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("********************* MENU ****************************"
				+ "\n1)Show invoice sorted by dateOfInvoice  "
				+ "\n2)Show sorted by amount in  descending order  "
				+ "\n3)Sorted on invoiceGivenBy "
				+ "\n4)Sorted on invoiceGivenTo "
				+ "\n5)Show the Invoice details of invoice with max amount "
				+ "\n6)Show the Invoice details of invoice with latest date "
				+ "\n7)Quit");
		System.out.println("Enter your choice:");
		int key=sc.nextInt();
		while(true)
		{
			if(key==1)
			{
				Collections.sort(list);
				Iterator<Invoice> iterator = list.iterator();

				while(iterator.hasNext())
				{
					System.out.println(iterator.next());		
				}
				menu(list);
			}
			if(key==2)
			{
				Collections.sort(list, new SortOnAmountBasis()); 

				for(int i=list.size()-1;i>=0;i--)
				{
					System.out.println(list.get(i));	
				}
				menu(list);
			}
			if(key==3)
			{
				Collections.sort(list, new SortOnInvoiceGivenByBasis()); 
				for(Invoice v : list )
				{
					System.out.println(v);
				}
				menu(list);
			}
			if(key==4)
			{
				Collections.sort(list, new SortOnInvoicegivenToBasis());
				Enumeration<Invoice> enumeration = Collections.enumeration(list);
				while(enumeration.hasMoreElements())
				{
					System.out.println(enumeration.nextElement());
				}
				menu(list);
			}
			if(key==5)
			{
				System.out.println("\nMaximum Amount Invoice="+Collections.max(list, new SortOnAmountBasis()));

				menu(list);
			}
			if(key==6)
			{
				System.out.println("\nlatest Date Invoice="+Collections.max(list));

				menu(list);
			}
			if(key==7)
			{
				break;
			}
		}
	}

}
class SortOnAmountBasis implements Comparator<Invoice>
{
	@Override
	public int compare(Invoice o1, Invoice o2) {

		if(o1.getAmount()>(o2.getAmount()))
		{
			return 1;
		}
		if(o1.getAmount()<(o2.getAmount()))
		{
			return -1;
		}
		else
			return 0;

	}	

}
class SortOnInvoicegivenToBasis implements Comparator<Invoice>
{
	@Override
	public int compare(Invoice o1, Invoice o2) {

		return o1.getInvoiceGivenTo().compareTo(o2.getInvoiceGivenTo());
	}	
}
class SortOnInvoiceGivenByBasis implements Comparator<Invoice>
{
	@Override
	public int compare(Invoice o1, Invoice o2) {

		return o1.getInvoiceGivenBy().compareTo(o2.getInvoiceGivenBy());
	}	
}
