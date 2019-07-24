
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Shape("red");
		System.out.println(s);
		System.out.println(s.getArea());
		
		Rectangle r = new Rectangle("blue",2.0,5.0);
		System.out.println(r);
		System.out.println(r.getArea());
		
		Triangle t = new Triangle("green",3.0,8.0);
		System.out.println(t);
		System.out.println(t.getArea());
	}

}
