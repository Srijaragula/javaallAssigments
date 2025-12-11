package allassignments;
  
public class Switchweek {     
 
	public static void main(String[] args) {  
		int day =2;    
		String result=switch(day) {  
		case 1->"Monday"; 
		case 2->"Tuesday";
		case 3->"wednesday"; 
		case 4->"Thursday";
		case 5->"Friday"; 
		case 6->"saturday";
		case 7->"Sunday";
		default->"Please Enter proper Input value";
		
		
		};
		System.out.println("Result: "+result);

	}

}
