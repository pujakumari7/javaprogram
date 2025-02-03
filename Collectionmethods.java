package package2;

import java.util.ArrayList;
import java.util.Collection;

public class Collectionmethods {

	public static void main(String[] args) 
	{
		Collection<Integer> c1 = new ArrayList<Integer>(); //Upcasting
		c1.add(90000);
		c1.add(536);
		c1.add(743);
		c1.add(11);
		c1.add(49);
		c1.add(123);
		
		System.out.println(c1);
		
		Collection<Integer> c3 = new ArrayList<Integer>(); //Upcasting
		c3.add(11);
		System.out.println(c3.contains(900)); //contains
		System.out.println(c3.contains(11));
		c3.addAll(c1);
		System.out.println(c3.containsAll(c1)); //containsall
		
		c3.add(null);
		System.out.println(c3);
	}

}
