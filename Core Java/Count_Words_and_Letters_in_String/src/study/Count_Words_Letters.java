package study;

public class Count_Words_Letters {
	public final static int OUT = 0;
	public final static int IN = 1;

	public static void main(String[] args) {
		String str = "Hello World\nwelcome to java \t how are you?";
		//countWordsLetters(str);
		int wc = countWords(str);
		//System.out.println(str);
		
		int cc=countLetters(str);
		System.out.println("total characters: "+cc+" total words: " + wc);
	}

	private static int countLetters(String str) {
		int cc=0;
		for(int i=0;i<str.length();i++)
		{
			cc++;
		}
		return cc;
	}

	private static int countWords(String str) {
		int i = 0;
		int state = OUT;
		int count = 0;
		while (i < str.length()) {
			if ((str.charAt(i) == ' ') || str.charAt(i) == '\n' || (str.charAt(i) == '\t')) {
				state = OUT;
			} else if (state == OUT) {
				state = IN;
				count++;
			}
			i++;
		}
		return count;
	}

	private static void countWordsLetters(String str) {
		String[] words = str.split(" ");
		System.out.println("String has " + str.length() + " letters and " + words.length + " words");

	}

}
