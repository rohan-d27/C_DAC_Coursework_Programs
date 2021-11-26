package exeption;

public class MyDate {
   private int date;
   private int month;
   private int year;

   public MyDate() {
	
}

public MyDate(int date, int month, int year) throws WrongMonthException {
	if(date>0 && date <32)
	{
		this.date = date;
	}
	else
	{
		throw new WrongDayException();
	}
	if(month>0 && month<13)
	{
		this.month = month;
	}
	else 
	{
		throw new WrongMonthException();
	}
	this.year = year;
}

public int getDate() {
	return date;
}

public void setDate(int date) {
	if(date>0 && date <32)
	{
		this.date = date;
	}
	else
	{
		throw new WrongDayException();
	}
}

public int getMonth() {
	return month;
}

public void setMonth(int month)throws WrongMonthException {
	if(month>0 && month<13)
	{
		this.month = month;
	}
	else 
	{
		throw new WrongMonthException();
	}
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

@Override
public String toString() {
	return "" + date + "/" + month + "/" + year;
} 
@Override
public boolean equals(Object obj)
{
	MyDate temp=(MyDate)obj;
	if(this.getDate()==temp.getDate()&&this.getMonth()==temp.getMonth()&&this.getYear()==temp.getYear())
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
