package study;

public class StringToByteArray {

	public static void main(String[] args) {
		String str = "hello";
		char[] arr = str.toCharArray();
		byte[] temp = new byte[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = (byte) arr[i];
		}
		display(temp);
		byte[] v = str.getBytes();
		display(v);

	}

	private static void display(byte[] temp) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");

		}
		System.out.println(" ");
	}
}
