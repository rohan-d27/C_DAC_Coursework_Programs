package inheritance;

public class Patient extends Person {
   String diseaseDescription; 
  
   
   public Patient(String n,Date d,String desc)
	{
		super(n,d);
		this.diseaseDescription=desc;
		System.out.println("Parameterized constructor of Patient class");
	}
   public Patient()
  	{
	   System.out.println("No Parameter constructor of Patient class");
  	}
  	


public String getDiseaseDescription() {
	return diseaseDescription;
}


public void setDiseaseDescription(String diseaseDescription) {
	this.diseaseDescription = diseaseDescription;
}
	
}
