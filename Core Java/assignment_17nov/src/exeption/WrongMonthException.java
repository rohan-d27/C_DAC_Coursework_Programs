package exeption;
//checked exeption
public class WrongMonthException extends Exception{
	public WrongMonthException()
	{
		super("Please Enter Month between 1 to 12!!!");
	}
}
