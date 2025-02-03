package package2;
import java.util.ArrayList;
import java.util.Collection;

public class Popertyofcollection2 {

	public static void main(String[] args) 
	{
		Collection<String> c1 = new ArrayList<String>(); //Upcasting
		c1.add("Sita");
		c1.add("Ram");
		c1.add("Arjun");
		c1.add("Puja");
		c1.add("Arti");
		c1.add("Sonam");
		boolean b1 = c1.isEmpty();  //isemtymethod
		System.out.println(b1);
		System.out.println(c1);
		
		Collection<String> c2 = new ArrayList<String>(); //Upcasting
		c2.add("Riya");          //add
		c2.addAll(c1);           //addall
		System.out.println(c2);
		c2.remove("Sonam");     //remove
		System.out.println("Updated->" +c2);
		c2.removeAll(c1);
		System.out.println("Updated->" +c2);
	}

}

