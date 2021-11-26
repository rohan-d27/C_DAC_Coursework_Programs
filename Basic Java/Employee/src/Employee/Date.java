package Employee;

public class Date {

	private int date;
	private int month;
	private int year;
	
	
	public Date(int d, int m, int y) {
		date = d;
		month = m;
		year = y;		
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
	
	public String toString()
	{
		String str = "" + date + "/" + getStringMonth(month) + "/" + year;
		return str;
	}
	
	private String getStringMonth(int m)
	{
		String month = "";
		switch(m)
		{
		case 1:
			month =  "Jan";
			break;
		case 2:
			month =  "Feb";
			break;
		}
		
		return month;
	}
	
}
