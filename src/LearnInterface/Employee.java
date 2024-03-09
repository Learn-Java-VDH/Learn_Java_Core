package LearnInterface;

interface Employee {
	
	default void displayInfor(String name,int age) {
		System.out.println(name + " " + age);
	}
}
