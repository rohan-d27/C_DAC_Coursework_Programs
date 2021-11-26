package polymorphism;

public class Date {
   private int date;
   private int month;
   private int year;

   public Date() {
	
}

public Date(int date, int month, int year) {
	super();
	this.date = date;
	this.month = month;
	this.year = year;
}

public int getDate() {
	return date;
}

public void setDate(int date) {
	this.date = date;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
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
	Date temp=(Date)obj;
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
