package study.jdbc;

public class StaticBlockExample {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("study.jdbc.StaticBlockUsed");
		//StaticBlockused.m1();
	}

}

class StaticBlockUsed
{
	static {
		System.out.println("the static block is executed");

	}


}