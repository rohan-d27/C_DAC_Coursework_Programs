package threading;

public class User {

	public static void main(String[] args) {
		Buffer shared = new Buffer();
		Thread producerThread = new Thread(new ProducerThread(shared));
		Thread consumerThread = new Thread(new ConsumerThread(shared));
		
		producerThread.start();
		consumerThread .start();
		
		System.out.println("main ends");

	}

}
