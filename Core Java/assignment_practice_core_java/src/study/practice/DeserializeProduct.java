package study.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class DeserializeProduct {

	public static void main(String[] args) {
		InputStream fin = null;
		ObjectInputStream oin=null;
		List<Product> list=new ArrayList<>();
		try {

			fin = new FileInputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\productfile.txt");
			oin = new ObjectInputStream(fin);
			
			while(fin.available()>0)
			{
				 Product pp= (Product)oin.readObject();
				list.add(pp);
			} 
			 for(Product p:list)
				{
					 System.out.println(p);
				} 
			int totalP=0;
			for(int i=0;i<list.size();i++)
			{
				totalP+=list.get(i).getCost();
			}
			System.out.println("Total cost:"+totalP);
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		} 

		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (IOException e) {

			System.out.println(e);
		} 
		finally {
			try {
				if(oin!=null)
					oin.close();
			} catch (IOException e) {
				System.out.println(e);

			}
	}

}
}