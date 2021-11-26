package study.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Pallete {
private TreeSet<String> colors;

public Pallete()
{
	colors=new TreeSet<String>();
}

public TreeSet<String> getColors() {
	return colors;
}

public void setColors(TreeSet<String> colors) {
	this.colors = colors;
}

@Override
public String toString() {
	return "Pallete colors=" + colors + "";
}


public void addToPallete(String color)
{
	colors.add(color);
}

public void showAllColorsPallete()
{
	    //iterator method
//		Iterator<String> it=colors.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
      
	//for each method
	//for (String string : colors) {
	//		System.out.println(string);
	//	}
	
	//for each using stream
	colors.stream().forEach((element)->System.out.println(element));
		
}

public void removefromPallete(String color)
{
   colors.remove(color);
}
public boolean isColorinPalllete(String color) {
	return colors.contains(color);
}
public void removeAllColors() {
	Iterator<String> it=colors.iterator();
//	while(it.hasNext())
//    {
//		//colors.remove(it.next());
//		
//	}
	colors.removeAll(colors);
}
}//end of pallete
