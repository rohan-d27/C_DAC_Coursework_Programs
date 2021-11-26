package testWrapperClass;

public class TestWrapperClass3 {

	public static void main(String[] args) {
		//BOXING
				Integer i1 = new Integer(23); //deprecated - not used in modern times or old method
				Double d2 = new Double(23.45);
				
				int x = i1.intValue();  //UNBOXING 
				int square =  x*x;
				System.out.println(square);
				double d1 = d2.doubleValue();  //UNBOXING
				System.out.println(d1);
				
				//AUTOBOXING  AUTOUNBOXING 
				Integer i2 = 23; //AUTOBOXING - internally new Integer(23)
				
				square = i2 * i2; //AUTOUNBOXING - internally i2.intValue() 
				
				
				 Long l = 15000L; //this is an object
				 

				/*
				 * if(i1==i2) System.out.println("same address"); else
				 * System.out.println("differet objects");
				 */
	}

}
