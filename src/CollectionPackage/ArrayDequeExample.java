package CollectionPackage;

import java.util.*;

public class ArrayDequeExample {
	public static void addData() {
		Deque<Integer> objDeque = new ArrayDeque<>();
		// Adding elements at first and last
		objDeque.add(2);
		objDeque.add(12);
		objDeque.add(5);
		objDeque.add(3);
		
		objDeque.addFirst(15);
		objDeque.addLast(28);
		
		System.out.println(objDeque);

		// Removing the elements
		int ele1 = objDeque.removeFirst();
		int ele2 = objDeque.removeLast();

		// Printing removed elements
		System.out.println("First removed element is : " + ele1);
		System.out.println("Last removed element is : " + ele2);
	}
}
