package interfaces;




public interface Working {
	
	//abstract methods
	public void work();
	
	default public void takeoff()
	{
		System.out.println("default takeoff of working");
	}
}


interface Playing
{
	//abstract method
	public void play();
	default public void takeoff(int x, Date d)
	{
		//this.play();
		System.out.println("default takeoff of playing");
	}
}


class I implements Working , Playing
{

	@Override
	public void work() {
		System.out.println("Working override");
		
	}

	@Override
	public void takeoff() { //needed to override because of ambiguity
	
		System.out.println("takeoff override");
	}

	@Override
	public void play() {
	
		System.out.println("play override");
		
	}
	
}

