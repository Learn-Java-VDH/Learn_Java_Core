package CollectionPackage;

import java.util.*;

public class SetExam {

	public static void addData() {
		int count[] = { 1, 3, 4, 6, 2, 5 };
		// hashset cho phép null và không tự sort
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < count.length; i++) {
				set.add(count[i]);
				System.out.println(count[i]);
			}
			System.out.println(set);

			TreeSet<Integer> sorted = new TreeSet<Integer>(set);
			// TreeSet không cho phép null và auto sort
			System.out.println(sorted);
			System.out.println(sorted.first());
			System.out.println(sorted.last());

		} catch (Exception e) {
		}
	}

	public static void examTreeset() {
//		kiểu object để cho biết user sẽ thêm 1 phần tử không xác định k/d/lieu trước
//		nhưng phải cùng chung 1 kiểu khi thêm
		TreeSet<Object> treeSet = new TreeSet<Object>();
		treeSet.add(45);
		treeSet.add(15);
		treeSet.add(99);
		treeSet.add(65);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(60);
		treeSet.add(80);
		System.out.println("TreeSet" + treeSet);
		System.out.println("TreeSet" + treeSet instanceof Object);
		TreeSet<Object> res = (TreeSet<Object>) treeSet.descendingSet();
		System.out.println("TreeSet after sorting in descending order" + res);
	}

}
