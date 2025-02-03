package package2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listprogram
{
	public static void main(String[] args) {
		
	
	List<String> l= new ArrayList<String>();
	l.add("tiya");
	l.add("puja");
	l.add("kiya");
	l.add(0, "piya");
	
	System.out.println(l);
	
	Iterator<String> ite = l.iterator();
	System.out.println("forword Iterator->" );
	while(ite.hasNext())
	{
		System.out.println(ite.next());
	}
	 ListIterator<String> ll =l.listIterator();
	 System.out.println("forword List Iterator->" );
		while(ll.hasNext())
		{
			System.out.println(ll.next());
		}
	 
		System.out.println("Backord List Iterator->" );
		while(ll.hasPrevious())
		{
			System.out.println(ll.previous());
		}
		 
		 
	



	}
}
