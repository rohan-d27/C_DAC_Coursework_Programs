package study.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DeamonThread {

	public static void main(String[] args) throws InterruptedException {
		Thread	th=new Thread(new DatenTime());
		th.setDaemon(true);
		th.start();
		int i=0;
		while(i<5)
		{
			System.out.println("Main is working");
			Thread.sleep(5000);
			i++;
		}

		System.out.println("Main ends");
	}

}
class DatenTime implements Runnable {
	public void run() {
		while(true)
		{  try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			System.out.println(dtf.format(now)); 
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		}

	}
}
