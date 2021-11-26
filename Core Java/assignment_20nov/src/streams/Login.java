package streams;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> log = new HashMap<>();
		log.put("AA", "1111");
		log.put("BB", "2222");
		log.put("CC", "3333");
		log.put("DD", "4444");
		log.put("EE", "5555");
		log.put("FF", "6666");
		log.put("GG", "7777");
		log.put("HHH", "8888");
		login(log);
	}
	private static void login(HashMap<String, String> log) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter login ID and Password :");
		String uname = sc.next();
		String pass = sc.next();
		if (log.get(uname) != null) 
		{
			if (pass.equals(log.get(uname))) 
			{
				System.out.println("Welcome " + uname+ "!");
				while (true) 
				{
					System.out.println("******** MENU ********** ");
					System.out.println("1.Show Login Password "
							+ "\n2.Reset Password "
							+ "\n3.Logout");
					System.out.println("Enter your choice");
					int key= sc.nextInt();

					if (key == 3) {
						break;
					}
					switch (key) {

					case 1: {
						System.out.println("User Name : " + uname + " Password : " + log.get(uname));
						break;
					}

					case 2: {
						System.out.println("To reset password ");
						System.out.println("Reconfirm old password ");
						String oldValue = sc.next();
						System.out.println("Enter the new Password ");
						String newValue = sc.next();
						if (log.replace(uname, oldValue, newValue)) 
						{
							System.out.println("Password set successfull");
						} else 
						{
							System.out.println("Error password not set try again !!!");
						}
						break;
					}
				}
			  }
			} 
			else 
			{
				System.out.println("Wrong Password!!! Try again!!");
				login(log);
			}
		} 
		else 
		{

			System.out.println("Wrong Username !!!! Try again!!");
			login(log);
		}
	}
}
