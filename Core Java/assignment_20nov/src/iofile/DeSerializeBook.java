package iofile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class DeSerializeBook {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\books.bingo");
		
		ObjectInputStream oin = new ObjectInputStream(fin);
       // method1
		while(fin.available()>0)
		{
        	System.out.println(oin.readObject()); 
		}
		
		//method2
//		 Book b1=(Book)oin.readObject();
//         Book b2=(Book)oin.readObject();
//         Book b3=(Book)oin.readObject();
//         Book b4=(Book)oin.readObject();
//         Book b5=(Book)oin.readObject();
         
//         System.out.println(b1);
//         System.out.println(b2);
//         System.out.println(b3);
//         System.out.println(b4);
//         System.out.println(b5);
		
		
		//method3
//		ArrayList<Object> arlist=new ArrayList<>();
//		int i=0;
//		while(true)
//		{
//			try
//			{
//				arlist.add(oin.readObject());
//				System.out.println(arlist.get(i));
//				i++;
//			}
//			catch(EOFException e)
//			{
//				System.out.println(e+"\nEnd of file reached!!");
//			    break;
//			}
	//	}
         oin.close();
	}

}
