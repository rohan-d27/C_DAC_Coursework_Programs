package ModEmployee;

public class Date {
	int date;
	int month;
	int year;


	public Date() {

	}
	public Date(int d,int m,int  y)
	{
		date=d;
		month=m;
		year=y;

	}

	public void setDateDMY(String dob)
	{
		String[] str= dob.split("-");
		date= Integer.parseInt(str[0]);
		month=Integer.parseInt(str[1]);
		year=Integer.parseInt(str[2]);

	}
	public void display()
	{
		System.out.printf("DOB: %d / %d / %d",date,month,year);
	}

}
