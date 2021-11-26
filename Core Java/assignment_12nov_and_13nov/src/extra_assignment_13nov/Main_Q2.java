package extra_assignment_13nov;

import java.util.Scanner;

public class Main_Q2 {

	public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer();
		for(int i=0;i<args.length;i++)
		{
			sb.append(args[i]+" ");
		}
		String str=sb.toString();
		menu(str,args);
	}
static void menu(String str,String[] args)
{
	System.out.println("******** MENU ********");
	System.out.println("1)Accept the string from Command line and replace all spaces with user entered character."
			+ "\n2)Find duplicate word in the string."
			+ "\n3)Java Program to delete characters from string as per the input.");
	System.out.println("Enter your choice:");
	Scanner sc=new Scanner(System.in);
	int key=sc.nextInt();
	switch (key) {
	case 1:
		    removeSpace(str);
		    menu(str,args);
			break;
	case 2:
			duplicateWord(args);
			menu(str,args);
			break;
	case 3:
			deleteChar(str);
			menu(str,args);
			break;
	
	default:
		break;
	}
}
static void removeSpace(String str)
{
	System.out.println("Original String:"+str+"\n");
	System.out.println("Enter character to replace spaces:");
	Scanner sc=new Scanner(System.in);
	String rep=sc.next();
	char ch=rep.charAt(0);
	String nw=str.replace(' ',ch);
	System.out.println("After Replacing spaces with:"+ch+" String is: "+nw);
}
static void duplicateWord(String[] args)
{
	int count;
	 System.out.println("Duplicate words in a given string : ");   
	  for(int i = 0; i < args.length; i++) { 
          count = 1;  
          for(int j = i+1; j < args.length; j++) {  
           
        	  if(args[i].equals(args[j])) { 
                  count=count+1;  
                 args[j] = "0";  
              }  
          }  
        
	  if(count > 1 && args[i] != "0")  
         
		  System.out.println(args[i]); 
      }  
}
static void deleteChar(String str) {  
			System.out.println("Enter character to delete from String: ");
			Scanner sc=new Scanner(System.in);
			String del=sc.next();
			char ch=del.charAt(0);
			StringBuilder sbd=new StringBuilder(str);
			for(int i=0;i<sbd.length();i++)
			{
				if(ch==sbd.charAt(i))
				{
					sbd.deleteCharAt(i);
				}
			}
			System.out.println("Original String:"+str+"\n");
			System.out.println("After removing: "+ch+" String becomes: "+sbd);
			
}   
}
