package threading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ThreadUser2 {

	public static void main(String[] args) {
		Thread th3 = new Thread(new Thread3());
		th3.setName(" Thread3");
		Thread th4 = new Thread(new Thread4());
		th4.setName(" Thread4");
		
		th3.start();
		th4.start();

	}//end of main

}//end of threaduser2


class  Thread3 implements Runnable{
	@Override
	public void run()
	{
		try
		{

       	 OutputStream fo = new FileOutputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\table.txt",true);
   		 PrintWriter pw  = new PrintWriter(fo);
   		
        for(int j=1;j<=50;j++)
        {
        	
        	for(int i = 1; i <= 10; i++)
        {
        		
        		pw.println(j+"*"+i+"="+j*i);
        		
        }
        	
        	pw.println(" ");
        	pw.flush();
        	
        	Thread.sleep(2000);
        }
        pw.close();
        }
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	}
}//end of class thread3

class  Thread4 implements Runnable{
	@Override
	public void run()
	{
		
		try {
			Scanner sc=new Scanner(System.in);
			int k=1;
			
			while(k<=5)
			{  System.out.println("How many rows you want in this pattern?"); 
		      int rows = sc.nextInt();
		      for (int i = 1; i <= rows; i++) 
		      {
		        for (int j = 1; j <= i; j++)
		          {
		                System.out.print(j+" ");
		          }
		             
		            System.out.println();
		        }
			k++;
			}
			//System.out.println(Thread.currentThread().getName());
			 Thread.sleep(2000);   
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
	}
}//end of class thread4