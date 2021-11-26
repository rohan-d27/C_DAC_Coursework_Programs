package inheritance.users;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

import inheritance.Date;
import inheritance.Patient;

public class User3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Patients:");
		int n=sc.nextInt();
		Patient[] prr=new Patient[n];
		populate_patient(prr);
		display(prr);
		lessthan(prr);	
		
	}
 static void populate_patient(Patient[]  prr)
 {
	
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<prr.length;i++)
	 {
		prr[i]=new Patient();
		System.out.println("Enter Name:");
		String name=sc.next();
		prr[i].setName(name);
		System.out.println("Enter Dob:");
		System.out.println("Enter Date:");
		int dd=sc.nextInt();
		System.out.println("Enter Month:");
		int dm=sc.nextInt();
		System.out.println("Enter Year:");
		int dy=sc.nextInt();
		prr[i].setDob(new Date(dd,dm,dy));
		System.out.println("Enter Diseas Description:");
		String des=sc.next();
		prr[i].setDiseaseDescription(des);
		
	 }
}
 static void display(Patient[]  prr)
 {
	 GregorianCalendar obj = new GregorianCalendar();
	 int todaysYear = obj.get(Calendar.YEAR);
	
	 for(int i=0;i<prr.length;i++)
	 {   int age= todaysYear-prr[i].getDob().getYear();
		 System.out.println("Name: "+prr[i].getName()+"\nDOB:"+prr[i].getDob()+"\nAge:"+age+"\nDiseas Description:"+prr[i].getDiseaseDescription()+" \n");
	 }
 }
 
 static void lessthan(Patient[]  prr)
 {
	 System.out.println("**************************************************"); 
	 System.out.println("Patients with  age less than 18:");
	 GregorianCalendar obj = new GregorianCalendar();
	 int todaysYear = obj.get(Calendar.YEAR);
	
	 for(int i=0;i<prr.length;i++)
	 {
		 int age= todaysYear-prr[i].getDob().getYear();
		 if(age<18)
		 {
			 System.out.println("Name: "+prr[i].getName()+"\nDOB:"+prr[i].getDob()+"\nAge:"+age+"\nDiseas Description:"+prr[i].getDiseaseDescription()+" \n");
	 }
	 }
 }
}
