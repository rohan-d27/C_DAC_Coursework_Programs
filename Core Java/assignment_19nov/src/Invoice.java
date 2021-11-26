
public class Invoice implements Comparable<Invoice> {
	private  MyDate  dateOfInvoice;
	private  double amount; 
	private  String invoiceGivenBy;
	private  String  invoiceGivenTo;


	public Invoice(MyDate dateOfInvoice, double amount, String invoiceGivenBy, String invoiceGivenTo) {
		this.dateOfInvoice = dateOfInvoice;
		this.amount = amount;
		this.invoiceGivenBy = invoiceGivenBy;
		this.invoiceGivenTo = invoiceGivenTo;
	}


	public Invoice() {

	}


	public MyDate getDateOfInvoice() {
		return dateOfInvoice;
	}


	public void setDateOfInvoice(MyDate dateOfInvoice) {
		this.dateOfInvoice = dateOfInvoice;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getInvoiceGivenBy() {
		return invoiceGivenBy;
	}


	public void setInvoiceGivenBy(String invoiceGivenBy) {
		this.invoiceGivenBy = invoiceGivenBy;
	}


	public String getInvoiceGivenTo() {
		return invoiceGivenTo;
	}


	public void setInvoiceGivenTo(String invoiceGivenTo) {
		this.invoiceGivenTo = invoiceGivenTo;
	}


	@Override
	public String toString() {
		return "Invoice Date Of Invoice=" + dateOfInvoice + ", Amount=" + amount + ", Invoice GivenBy=" + invoiceGivenBy
				+ ", Invoice GivenTo=" + invoiceGivenTo + "\n";
	}


	@Override
	public int compareTo(Invoice d) {
		if(this.getDateOfInvoice().getYear() > d.getDateOfInvoice().getYear())  return 1;
		if(this.getDateOfInvoice().getYear()< d.getDateOfInvoice().getYear())  return -1;
		else //year is same
		{
			if(this.getDateOfInvoice().getMonth()>d.getDateOfInvoice().getMonth())  return 1;
			if( this.getDateOfInvoice().getMonth() <d.getDateOfInvoice().getMonth()) return -1;
			else //month is same
			{
				if( this.getDateOfInvoice().getDay() > d.getDateOfInvoice().getDay())  return 1;
				if(this.getDateOfInvoice().getDay() < d.getDateOfInvoice().getDay())  return -1;
				else  //day is same
					return 0;
			}
		}

	} 

}
