package study.practice;

public class NotCurrentMonthException extends RuntimeException {
	
	
	public NotCurrentMonthException() {
		super("Expese should be of current month and year!!!");
	}
	
	
	
}
