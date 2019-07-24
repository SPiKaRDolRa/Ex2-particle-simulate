
public class Triangle extends Shape {

	double base,height;
		
	public Triangle(String color,double base,double height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	double getArea() {
		return 0.5 * base * height;
	}
	
	public String toString() {
		return "Triangle[color="+ this.color+",area="+ getArea()+"]";
	}
	
}
