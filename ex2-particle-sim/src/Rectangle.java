
public class Rectangle extends Shape {

	double length,width;
		
	public Rectangle(String color,double length,double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	double getArea() {
		return length * width;
	}
	
	public String toString() {
		return "Rectangle[color= "+ this.color+",area= "+getArea()+"]";
	}
}
