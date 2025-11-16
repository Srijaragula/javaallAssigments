package allassignments;
 
public class YoungestAge {

	public static void main(String[] args) { 
		int age1=20;
		int age2=10; 
		int age3=3;
		int youngest;  
		
		if(age1<age2 && age1<age3) {
			youngest=age1;
		}	else if(age2<age1 && age2<age3) {
			youngest=age2;
		}		else {
			youngest=age3;
		}
		System.out.println("youngest is:" +youngest);
		
	}

}
