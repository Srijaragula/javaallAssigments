 package allassignments; 

public class Swap2Num { 
   
	public static void main(String[] args) {    
		int r=10;      
		int s=20;      
		r=r^s; 
		s=r^s;
		r=r^s;
		System.out.println(r+" "+s);

	}

}
