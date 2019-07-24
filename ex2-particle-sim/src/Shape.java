
public class Shape {
	
	String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	double getArea() {
		System.err.println("Can't calculate area");
		return 0;
	}
	
	public String toString() {
		return "Shape[color="+ this.color + "]";
	}
	
}
