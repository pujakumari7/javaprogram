package package2;
import java.util.ArrayList;
import java.util.Collection;

public class Propertyofcollection1 {

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
		
	}

}

