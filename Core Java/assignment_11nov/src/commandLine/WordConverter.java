package commandLine;

public class WordConverter {
	int num;
	
	
	public WordConverter(int num) {
		this.num = num;
	}
	

	public String getnumInWord()
	{
		int unitPlace=num%10;
		System.out.println("\nunitPlace: "+unitPlace);
		int tensPlace=(num%100)/10;
		System.out.println("tensPlace: "+tensPlace);
		int hundredPlace=(num%1000)/100;
		System.out.println("hundredPlace: "+hundredPlace);
		int thousandPlace=(num%10000)/1000;
		System.out.println("thousandPlace: "+thousandPlace);
		System.out.println();
		 
		 String str="";
		 str+= getWord(thousandPlace)+" Thousand" +" ";
		  str+= getWord(hundredPlace)+" Hundred"+ " ";
		  int  y=0, i = 0;
		  String z = "";
		  while(i < 2)
	        {
	            y = num % 10;
	            z = y + "" +z;
	            num = num / 10;
	            i++;
	        }
		  int k=Integer.parseInt(z);
		if(tensPlace==1)
		{
			str+=getWord3(k);
		}
		else
		  {
			str+= getWord2(tensPlace)+ " ";
		  str+= getWord(unitPlace)+ " ";
		  }
		  
		return str;
	}
	private String getWord(int n)
	{
		switch (n) {
		case 1:
			String s="One";
			//System.out.println("One");
			return s ;
			
	case 2:
		String s1="Two";
		//System.out.println("Two");
		return s1 ;
				
	case 3:
		String s2="Three";
		//System.out.println("Three");
		return s2 ;
		
	case 4:
		String s3="Four";
		//System.out.println("Four");
		return s3 ;
		
	case 5:
		String s4="Five";
		//System.out.println("Five");
		return s4 ;
		
	case 6:
		String s5="Six";
		//System.out.println("Six");
		return s5 ;
		
	case 7:
		String s6="Seven";
		//System.out.println("Seven");
		return s6 ;
		
	case 8:
		String s7="Eight";
		//System.out.println("Eight");
		return s7 ;
		
	case 9:
		String s8="Nine";
		//System.out.println("Nine");
		return s8 ;
		
	case 0:String s9="Zero";
	//System.out.println("Zero");
	return s9 ;
		
		default:
			break;
		}
		return null;
		
	}
	private String getWord2(int n)
	{
		switch (n) {
		
			
	case 2:
		String s1="Twenty";
		
		return s1 ;
				
	case 3:
		String s2="Thirty";
	
		return s2 ;
		
	case 4:
		String s3="Fourty";
		
		return s3 ;
		
	case 5:
		String s4="Fifty";
		
		return s4 ;
		
	case 6:
		String s5="Sixty";
		
		return s5 ;
		
	case 7:
		String s6="Seventy";
	
		return s6 ;
		
	case 8:
		String s7="Eighty";
		
		return s7 ;
		
	case 9:
		String s8="Ninety";
	
		return s8 ;
		
}
		return null;
}
	private String getWord3(int n)
	{
		switch (n) {
		case 11:
			   
			
			String s="Eleven";
			return s ;
			
	case 12:
		String s1="Twenty";
		
		return s1 ;
				
	case 13:
		String s2="Thirty";
	
		return s2 ;
		
	case 14:
		String s3="Fourty";
		
		return s3 ;
		
	case 15:
		String s4="Fifty";
		
		return s4 ;
		
	case 16:
		String s5="Sixty";
		
		return s5 ;
		
	case 17:
		String s6="Seventy";
	
		return s6 ;
		
	case 18:
		String s7="Eighteen";
		
		return s7 ;
		
	case 19:
		String s8="Nineteen";
	
		return s8 ;
		
}
		return null;
}
}