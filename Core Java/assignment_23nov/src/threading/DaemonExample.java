package threading;

public class DaemonExample {

	public static void main(String[] args) {
		
		new Thread(new CompanyThread()).start();
		Thread chai = new Thread(new ChaiServiceThread());
		chai.setDaemon(true);
		chai.start();
		System.out.println("main ends");
	}
}


class CompanyThread implements Runnable
{
	@Override
	public void run() {
	   for(int i=0;i<10;i++) {
		   System.out.println("say company works");
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	}

}//end of class


class ChaiServiceThread implements Runnable
{
	@Override
	public void run() {
	  while(true) {
		   System.out.println("chai service ....chai chai");
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	}
}