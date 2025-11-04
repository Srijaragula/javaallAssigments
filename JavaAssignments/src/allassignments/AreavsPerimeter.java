package allassignments;
public class AreavsPerimeter {    
	public static void main(String[] args) { 
		int length=20; 
		int breadth=30;
		int area=length*breadth;  
		int perimeter=2*(length+breadth);
		System.out.println("Area:" +area);
		System.out.println("perimeter:" +perimeter);	
		if(area>perimeter) {
			System.out.println("area is greater");
		}else if(perimeter>area) {
			System.out.println("perimeter is greater");
		}else {
			System.out.println("both are equal");
		}
	}
}
