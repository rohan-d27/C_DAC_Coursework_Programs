package exeption;
//unchecked exeption
public class WrongDayException extends RuntimeException {

	public WrongDayException()
	{
		super("Please Enter day between 1 to 31!!!");
	}
}
