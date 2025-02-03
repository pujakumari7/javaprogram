package package2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionitaration {

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
		Iterator<Integer> i1=c1.iterator();
		System.out.println("Iterating through ->");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
	}

}
