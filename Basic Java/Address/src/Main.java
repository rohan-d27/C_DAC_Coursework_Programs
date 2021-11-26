import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Address ad=new Address();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Flat no.:");
		String fn=sc.next();
		ad.setFlatno(fn);
		System.out.println("Enter Building name:");
		String bn=sc.next();
		ad.setBuildname(bn);
		System.out.println("Enter Area name:");
		String ar=sc.next();
		ad.setArea(ar);
		System.out.println("Enter City name:");
		String cna=sc.next();
		ad.setCity(cna);
		System.out.println("Enter State name:");
		String sn=sc.next();
		ad.setState(sn);
		System.out.println("Enter Country name:");
		String cn=sc.next();
		ad.setCountry(cn);
		System.out.println("Enter Pincode:");
		int pn=sc.nextInt();
		ad.setPincode(pn);
		
		System.out.println(ad);
	}

	
}
