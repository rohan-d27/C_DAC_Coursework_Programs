package practice_program_project_25nov;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentIOOperation {

	public static void writeToFile(List<Student> std)
	{
		ObjectOutputStream oos=null;
		try {
			OutputStream fout = new FileOutputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\student.db");
			oos = new ObjectOutputStream(fout);
			
			for(int i=0;i<std.size();i++)
			{
				Student obj=std.get(i);
				oos.writeObject(obj);}



		} catch (IOException e) {
			System.out.println(e);
		}
		finally
		{
			try {
				oos.flush();
				oos.close();
			} catch (IOException e) {
				System.out.println(e);
			}

		}
	}

	public static List<Student> readFromFile() throws StudentDBFileNotFound
	{
		ObjectInputStream oin=null;
		List<Student> list=new ArrayList<>();
		try {
			File file = new File("C:\\Users\\Dharurkar\\Desktop\\text_files\\student.db");
			if(file.exists())
			{
				FileInputStream fin = new FileInputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\student.db");
				oin = new ObjectInputStream(fin);
				while(fin.available()>0)
				{
					System.out.println(oin.readObject()); 
				}
			}

			else throw new StudentDBFileNotFound();

		} catch (ClassNotFoundException | IOException e) {

			System.out.println(e);
		} catch (StudentDBFileNotFound e) {
			throw new StudentDBFileNotFound();
		}
		finally {
			try {
				if(oin!=null)
					oin.close();
			} catch (IOException e) {
				System.out.println(e);

			}
		}
		return list;
	}
}
