package iofile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;



public class SerializeBook {

	public static void main(String[] args)  {
		//1
		Author b1=new Author();
		String[] str2=new String[1];
		str2[0]="BNMK";
		b1.setAuthor(str2);
		Book bk1=new Book("ACFD",500,b1,new MyDate(10,10,2021));

		//3
		Author b2=new Author();
		String[] str3=new String[1];
		str3[0]="ABCD";
		b2.setAuthor(str3);
		Book bk2=new Book("XYZ",100,b2,new MyDate(2,1,2011));

		//3
		Author b3=new Author();
		String[] str4=new String[1];
		str4[0]="WERT";
		b3.setAuthor(str4);
		Book bk3=new Book("VGT",670,b3,new MyDate(8,8,2012));

		//4
		Author b4=new Author();
		String[] str5=new String[1];
		str5[0]="POI";
		b4.setAuthor(str5);
		Book bk4=new Book("QAZ",898,b4,new MyDate(7,7,2013));


		//5
		Author b5=new Author();
		String[] str6=new String[1];
		str6[0]="GHJJ";
		b5.setAuthor(str6);
		Book bk5=new Book("NMJ",700,b5,new MyDate(1,5,2010));
		try {
			OutputStream fout = new FileOutputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\books.bingo");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(bk1);
			oos.writeObject(bk2);
			oos.writeObject(bk3);
			oos.writeObject(bk4);
			oos.writeObject(bk5);
			oos.flush();
			oos.close();
		
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

}
