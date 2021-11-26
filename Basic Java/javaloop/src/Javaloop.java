import java.util.Scanner;

public class Javaloop {
	private static int n;

	public Javaloop() {
		
	}

     public Javaloop(int n) {
		
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void power()
     {
    	 Scanner cc=new Scanner(System.in);
 		
    	// System.out.println("\nEnter base:");
    	// int base=cc.nextInt();
    	 System.out.println("\nEnter power:");
    	 int power=cc.nextInt();
    	 int result =1;
    	 for(int i=1;i<=power;i++)
    	 {
    		 result=n*result;
    	 }
    	 System.out.println("\nResult:"+ result);
     }
     public void fibonacci()
     {
    	// System.out.println("\nEnter a number till you want to see Fibonacci numbers: ");
    		//Scanner sc=new Scanner(System.in);
    		//int count=sc.nextInt();
    		System.out.println("\nFibonacci numbers are: ");
    		int n1=0,n2=1,n3,i;    
    	    System.out.print(n1+" "+n2);   
    	    
    	     for(i=2;i<n;++i)
    	 {    
    	      n3=n1+n2;    
    	      System.out.print(" "+n3);    
    	      n1=n2;    
    	      n2=n3;    
    	 }    
     }
     public void prime()
     {
    	
    	 	//System.out.println("\nWhich number till you want Prime number:");
    	 	//Scanner uc=new Scanner(System.in);
    		//int u=uc.nextInt();
    	 	for(int i=1;i<n;i++)
    	 	{ int fact=0;
    	 	  
    	 	   for(int j=1;j<=n;j++)
    	 	   {
    	 	     if(i%j==0)
    	 		 {
    	 		  fact++;
    	 		  }
    	 	   }
    	 	   if(fact==2)
    	 		{	
    	 			System.out.printf("\n%d",i);
    	 		}
    	     }		
    	 }
     }

