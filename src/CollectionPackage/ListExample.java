package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	
	public static void addData() {
		List<String> list = new  ArrayList<String>();
		list.add("Hoang");
		list.add("Wy");
		list.add("Hoang");
		for(String a : list) {
			System.out.println(a);
		}
		
	}
}
