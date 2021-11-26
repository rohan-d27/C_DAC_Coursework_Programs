package threading;

import java.util.Arrays;

public class Buffer {
	int [] numbers =  new int [10];
	private static final int MAX_LENGTH = 8;
	private static final int MIN_LENGTH = 2;
	
	public synchronized void addToArray(int num)
	{
		while(this.numbers.length> MAX_LENGTH)
		{
			try {
				System.out.println("Producer is waiting...");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("producer wait ended");
		}
		
		
	}//end of addToArray
	
	public synchronized void removeFromArray(int num)
	{
		while(this.numbers.length< MIN_LENGTH)
	{
		try {
			System.out.println("Consumer is waiting...");
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("consumer wait ended");
	}
	//this.numbers=this.numbers.	
		
	}//end of removeFromArray

	@Override
	public String toString() {
		return "Buffer numbers=" + Arrays.toString(numbers) + "";
	}
	
}//end of class buffer
