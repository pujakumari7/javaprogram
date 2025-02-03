package package2;

import java.util.ArrayList;
import java.util.List;

public class Listproperties {

	public static void main(String[] args) {
		List l= new ArrayList();
		l.add("tiya");
		l.add("puja");
		l.add("kiya");
		l.add(0, "piya");
		System.out.println(l);
		
		List l1= new ArrayList();
		l1.add("geeta");
		l1.add("sireesha");
		l1.addAll(1,l);
		
		System.out.println(l1);
		
		//l1.remove(0);
		l1.remove("piya");
		l1.removeAll(l);
		
		System.out.println(l1);
	}

}
