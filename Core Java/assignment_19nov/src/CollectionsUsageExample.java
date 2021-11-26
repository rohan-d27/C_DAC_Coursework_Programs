

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUsageExample {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("Az");
		list.add("YB");
		list.add("RC");
		list.add("HD");
		
		System.out.println("Original List:");
		for(String s: list)
			System.out.println(s);
		
		Collections.shuffle(list);
		System.out.println("\nAfter shuffling List:");
		for(String s: list)
			System.out.println(s);
		
		Collections.sort(list);
		
		System.out.println("\nAfter Sorting list:");
		
		for(String s: list)
			System.out.println(s);
		
		
		System.out.println("\nmax="+Collections.max(list));
		
		System.out.println("\nmin="+Collections.min(list));
		
		
		List<Integer> numbers = Arrays.asList(423,12,313,34556,8989,54);
		
		Collections.sort(numbers);
		
		for(Integer i : numbers)
			System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
