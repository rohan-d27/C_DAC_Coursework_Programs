package polymorphism;

public class Patient extends Person {
   String diseaseDescription; 
  
   
   public Patient(String n,Date d,String desc)
	{
		super(n,d);
		this.diseaseDescription=desc;
		//System.out.println("Parameterized constructor of Patient class");
	}
   public Patient()
  	{
	  // System.out.println("No Parameter constructor of Patient class");
  	}
  	


public String getDiseaseDescription() {
	return diseaseDescription;
}


public void setDiseaseDescription(String diseaseDescription) {
	this.diseaseDescription = diseaseDescription;
}
@Override
public String toString() {
	return "Patient  Name=" + getName() +", Dob=" + getDob()+" Disease Description= " + diseaseDescription + "\n";
}
public boolean equals(Object obj)
{
	Patient temp=(Patient)obj;
	if(this.getName().equals(temp.getName())&&this.getDob().equals(temp.getDob())&&this.getDiseaseDescription().equals(temp.getDiseaseDescription()))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
