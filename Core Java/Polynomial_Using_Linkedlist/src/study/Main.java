package study;

public class Main {

	public static void main(String[] args) {
		Polynomial poly=new Polynomial();
		poly.addPolynomial(10, 3);
		poly.addPolynomial(20, 6);
		poly.addPolynomial(30, 9);
		poly.addPolynomial(5, 2);
		poly.display();
	}

}
