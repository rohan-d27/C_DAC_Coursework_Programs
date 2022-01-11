package study.example;

import study.RedSticker;


public class MyUtilityClass {

	
	private int num;
	
	@RedSticker
	public void t1()
	{
		System.out.println("t1  called");
	}

	
	public void t2()
	{
		System.out.println("t2  called");
	}
}
