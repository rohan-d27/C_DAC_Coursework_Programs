package study;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class TestClassClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	//	Class obj = java.lang.Thread.class;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter class name");
		String cname = sc.next();
		
		//cname obj = new cname();   //this cant be done , as classname is not known
		
		
		Class obj = Class.forName(cname);

		System.out.println(obj.newInstance());
		
		
		showInfo(obj);
	}
	
	
	public static void showInfo(Class cobj)
	{
		//show the fields of this class
		
		Field[] fields =cobj.getFields();
		
		for(Field f : fields)
		{
			System.out.println(f.getName() );
			System.out.println(f.getType());
			
			int modifiers = f.getModifiers();
			
			System.out.println(Modifier.toString(modifiers));
		}
		
		System.out.println("Method Summary");
		
		Method[] methods = cobj.getMethods();
		for(Method m :methods)
			System.out.println(m.getName());
		
		
		
		
		
		
		
		
		
	}

}
