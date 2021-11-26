

public class MyDate implements Comparable<MyDate>{
	private int day,month,year;

	public MyDate() {

	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
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
		return ""+ day + "-" + month + "-" + year + "";
	}

	@Override
	public int compareTo(MyDate d) {

		//System.out.println("compare to called for "+ this+" and "+d);

		if(this.year > d.year)  return 1;
		if(this.year < d.year)  return -1;
		else //year is same
		{
			if(this.month>d.month)  return 1;
			if( this.month <d.month) return -1;
			else //month is same
			{
				if( this.day > d.day)  return 1;
				if(this.day < d.day)  return -1;
				else  //day is same
					return 0;
			}
		}


	}
}
