package threading;

public class ConsumerThread implements Runnable {

	Buffer bff;
	
	public ConsumerThread(Buffer bff)
	{
		this.bff=bff;
	}
	
	@Override
	public void run() {
	int i=0;
		while(true)
		{
			bff.removeFromArray(i);
			System.out.println("consumer removes from array. so array becomes:"+bff);
			i++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}

}
