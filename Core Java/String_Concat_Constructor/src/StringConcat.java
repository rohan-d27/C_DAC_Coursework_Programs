
class MyString {
	String str;

	public MyString(String str) {
		this.str = str;
	}

	public MyString(String a, String b) {
		this.str = a + b;
	}

	@Override
	public String toString() {
		return str;
	}

}

public class StringConcat {
	public static void main(String[] args) {
		MyString s = new MyString("Hello", " Java");
		System.out.println(s);
	}
}