package OOP;

public class Dog extends Animal {
	 @Override
	 public void makeSound() {
		 System.out.println("Dog barks");
	 }
	 
	 public Dog() {
		// TODO Auto-generated constructor stub
		 super(); 
		 
	}
	 public void changeName() {
		 System.out.println(name + " makes a sound");
		 name = "Bird";
		 System.out.println(name + " makes a sound");
		 
	 }

	 
}
