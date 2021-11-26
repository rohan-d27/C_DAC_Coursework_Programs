package upcasting_dopwncasting;

public class TestUpcastingDowncasting {

	public static void main(String[] args) {
			
		     //A obj
		    showOutput1(new B());//RUN TIME data type is B
			showOutput1(new D());//RUN TIME data type is D
			showOutput1(new C()); //RUN TIME data type is C
			showOutput1(new E());//RUN TIME data type is E
			showOutput1(new F());//RUN TIME data type is F
			showOutput1(new A());//RUN TIME data type is A
			
			
			//B obj
			showOutput2(new B());//RUN TIME data type is B
			showOutput2(new C()); //RUN TIME data type is C
			showOutput2(new E());//RUN TIME data type is E
			showOutput2(new F());//RUN TIME data type is F
			
			//C obj
			showOutput3(new C()); //RUN TIME data type is C
			showOutput3(new F());//RUN TIME data type is F
			
			
			//D obj
			showOutput4(new D());//RUN TIME data type is D
			
			//E obj
			showOutput5(new E());//RUN TIME data type is E
			
			//F obj
			showOutput6(new F());//RUN TIME data type is F
			
			
			
	}	
		
		//compile time data type = A 
public static void showOutput1(A obj)
		{
	System.out.println("\nShowoutput1 :A obj");
			 obj.fa();
			 if ( obj instanceof B)
			 { 
				 ((B)obj).fb();	 //DOWNCASTING
			 }
			 if ( obj instanceof C)
			 { 
				 ((C)obj).fc(); //DOWNCASTING
				 
			 }
			 if(obj instanceof E)
			 {
			     ((E)obj).fe(); //DOWNCASTING
			 }
			 
			 if ( obj instanceof F)
			 {
			  F temp =(F)obj; //DOWNCASTING
			  temp.ff();
			 }
			 
			 if( obj instanceof D )
				 {
				    ((D)obj).fd(); //DOWNCASTING
				 }
		}

//compile time data type = B
public static void showOutput2(B obj)
{
	System.out.println("\nShowoutput2: B obj");
	 obj.fa();
	 obj.fb();
	if ( obj instanceof C)
	 {
	  C temp =(C)obj;
	  temp.fc();
	 }
	 if(obj instanceof E)
	 {
	     ((E)obj).fe(); //DOWNCASTING
	 }
	 
	 if ( obj instanceof F)
	 {
	  F temp =(F)obj; //DOWNCASTING
	  temp.ff();
	 }
	 
}

//compile time data type = C
public static void showOutput3(C obj)
{
	System.out.println("\nShowoutput3: C obj");
	 obj.fa();
	 obj.fb();
	 obj.fc();
	 if ( obj instanceof F)
	 {
	  F temp =(F)obj; //DOWNCASTING
	  temp.ff();
	 }
}

//compile time data type = D
public static void showOutput4(D obj)
{
	System.out.println("\nShowoutput4: D obj");
	 obj.fa();
	 obj.fd();	 	
}

//compile time data type = E
public static void showOutput5(E obj)
{
	System.out.println("\nShowoutput5: E obj");
	 obj.fa();
	 obj.fb();
	 obj.fe();  
}

//compile time data type = F
public static void showOutput6(F obj)
{
	System.out.println("\nShowoutput6: F obj");
	 obj.fa();
	 obj.fb();
	 obj.fc();
	 obj.ff(); 
}
}
	class A
	{
		void fa()
		{
			System.out.println("in fa");
		}
	}

	class B extends A
	{
		void fb()
		{
			System.out.println("in fb");
		}
		
	}

	class C  extends B
	{
		void fc()
		{
			System.out.println("in fc");
		}
	}

	class D  extends A
	{
		void fd()
		{
			System.out.println("in fd");
		}
	}

	class E   extends B
	{
		void fe()
		{
			System.out.println("in fe");
		}
	}

	class F  extends C
	{
		void ff()
		{
			System.out.println("in ff");
		}
	
	}