
package Learn;

public class Rectangle {
	public int width; // null
	public int height; // null

	
	public static String name;
	

	public int calculateArea() {
		return width * height;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		this.width = 1;
		this.height = 2;
		Rectangle.name = "Wy";
		this.show();
	}
	
	public int getWH() {
		return width;
	}
	
	private void show() {
		System.out.println("Hello World");
	}
}
