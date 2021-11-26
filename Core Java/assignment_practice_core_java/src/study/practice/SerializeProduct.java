package study.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class SerializeProduct {

	public static void main(String[] args) {
		Product[] prr=new Product[5];
        prr[0]=new Product("ABC",100,"abc","A");
        prr[1]=new Product("DEF",50,"def","D");
        prr[2]=new Product("IJK",20,"ijk","I");
        prr[3]=new Product("MNP",40,"mnp","M");
        prr[4]=new Product("PQR",500,"pqr","P");
        OutputStream fout=null;
        ObjectOutputStream oos=null;
        try {
			File f=new File("C:\\Users\\Dharurkar\\Desktop\\text_files\\productfile.txt");
					fout = new FileOutputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\productfile.txt",true);
					try {
						oos = new ObjectOutputStream(fout);
					} catch (IOException e) {
						System.out.println(e);
					}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		
		for(int i=0;i<prr.length;i++)
		{
			try {
				oos.writeObject(prr[i]);
				
			} catch (IOException e) {
				System.out.println(e);
			}
			
		}
		
		try {
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
