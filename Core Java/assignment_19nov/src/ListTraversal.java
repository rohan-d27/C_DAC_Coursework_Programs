
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTraversal {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(22);
		list.add(44);
		list.add(10);
		list.add(2);
		
		
		
		//Iterat;r<Integer> iterator = list.iterator();		
		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());				
//		}
		System.out.println("list:"+list);
		while(itr.hasNext())
		{
			if(itr.next()!=null)
                itr.remove();			
		}
				System.out.println("After Removing:"+list);
//		Enumeration<Integer> enumer = Collections.enumeration(list);
//		
//		Vector<Integer> v= new Vector();
//		v.add(33);
//		v.add(44);
//		v.add(77);
//			
//		Enumeration<Integer> enumeration = v.elements();
//		while(enumeration.hasMoreElements())
//		{
//			System.out.println(enumeration.nextElement());
//		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
