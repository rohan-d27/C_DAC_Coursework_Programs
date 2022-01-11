package study;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import study.example.MyUtilityClass;

public class ContainerExample {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class csobj = new MyUtilityClass().getClass();
		
		
		Method[] methods = csobj.getMethods();
		
		
		for(Method m : methods)
		{
			if(m.isAnnotationPresent(RedSticker.class))
			{
				System.out.println(new Date());
				m.invoke(new MyUtilityClass(), null);
			}
			else
				m.invoke(new MyUtilityClass(), null);
		}
		
		
		

	}

}
