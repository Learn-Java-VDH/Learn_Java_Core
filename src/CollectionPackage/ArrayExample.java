package CollectionPackage;

import java.util.Arrays;
import java.util.List;

public class ArrayExample {
	public static void exam() {
		String a[] = new String[] { "abc", "klm", "xyz", "pqr" };
		// array cố định kích thước
		// chỉ có method length
		List<String> list = Arrays.asList(a);

		// printing the list
		System.out.println("The list is:" + list);
	}
	
	
}
