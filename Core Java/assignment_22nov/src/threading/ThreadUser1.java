package threading;

public class ThreadUser1 {
public static void main(String[] args) {
	Thread th1=new Thread1();
	th1.setName(" Thread1");
	
	Thread th2=new Thread2();
	th2.setName(" Thread2");
	
	th1.start();
	th2.start();

     }//end of main 
}// end of thread1


class  Thread1 extends Thread{
	@Override
	public void run()
	{
		try 
		{
		for(int i=1;i<=50;i++)
		{
			System.out.println("Number: "+ i+ " its Square: "+i*i+super.getName());
			
				sleep(2000);
		}
		}
		catch (InterruptedException e) {

            System.out.println(e);
			}
		}
	
}//end of thread1

class  Thread2 extends Thread{
	@Override
	public void run()
	{
		try {
	   int i,j,fact=1;  
	  for(j=1;j<=15;j++) {
	  for(i=1;i<=j;i++){    
	      fact=fact*i;    
	  } 
	  System.out.println("Factorial of "+j+" is: "+fact+super.getName()); 
	  System.out.println("Number: "+ j+ " its Square: "+j*j);
	  sleep(2000);
	  }
		}
		catch(InterruptedException e) {

            System.out.println(e);
			}
	  
	 } 
}//end of thread2