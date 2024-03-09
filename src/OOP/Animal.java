package OOP;

public class Animal {
	public String name;
	public String typeAnimal;
	
	public Animal() {
		this.name = "dog";
		this.typeAnimal = "";
	}
	
	public void makeSound() {
        System.out.println("Animal makes a sound");
    }

	public void display() {
        System.out.println("Hello from Parent class");
    }
	
	class AnimalInfor {
		public void display1() {
			System.out.println("AnimalInfor");
			display();
			
		}
	}
	

	public static void main(String[] args) {
// downcasting
//		Animal animal = new Animal();
//		animal.display();		
//		Dog dog = (Dog) animal;
//		dog.changeName();
//upcasting
//		Dog d = new Dog();
//		d.makeSound();
//		Animal a = d;
//		a.makeSound();
//inner class
		Animal animal = new Animal();
//		animal.display();
		Animal.AnimalInfor a = animal.new AnimalInfor();
		a.display1();
		
	}

	
}
