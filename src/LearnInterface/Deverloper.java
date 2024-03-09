package LearnInterface;

public class Deverloper implements Employee,Salary {
	
	private String name;
	private int age;
	public Deverloper(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
