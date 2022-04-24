package study;

import java.util.*;

public class TestClass {
 public static void main(String args[] ) throws Exception {
 
     Scanner s = new Scanner(System.in);

       
     while (s.hasNext()) {
			String name = s.nextLine();
			StringBuilder str = new StringBuilder();

			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == '\\' && i < name.length() - 1 && name.charAt(i + 1) == 'b') {
                 if (str.length()>0)
					str.deleteCharAt(str.length() - 1);

					i++;
				} else if (name.charAt(i) == '\\' && i < name.length() - 1 && name.charAt(i + 1) == 'n') {
					System.out.println(str.toString());
					str.setLength(0);

					i++;

				} else {
					str.append(name.charAt(i));
				}

			}
			if (str.length() > 0) {
				System.out.println(str.toString());
			}
		}

 }
}

