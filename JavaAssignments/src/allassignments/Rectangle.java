package allassignments;

public class Rectangle {
	private double length; 
	private double width;
	double Area;
	Rectangle(double l,double w){ 
		length=l;
		width=w; 
		
	}
	public double calculateArea() {
		Area=length*width;
		System.out.println("area is :"+Area);
		return Area;
		
	}
	public static void main(String args[]) {
		Rectangle t=new Rectangle(3.55,56.9);
		t.calculateArea();
		
	}

}
