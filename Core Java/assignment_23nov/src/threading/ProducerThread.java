package threading;

import java.util.Random;

public class ProducerThread implements Runnable {

	Buffer bff;
	public ProducerThread (Buffer bff) {
		this.bff=bff;
	}
	
	
	@Override
	public void run() {
		
		Random abc=new Random();
		while(true)
		{	
			int num=abc.nextInt(100);
		     bff.addToArray(num);
		     System.out.println("producer produces number");
		     try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	   }
	}

}
