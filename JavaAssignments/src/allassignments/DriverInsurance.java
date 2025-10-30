package allassignments;
 
public class DriverInsurance {
  
	public static void main(String[] args) {   
		 
		String gender="Female";//"male" or "female" 
		boolean married=true;// ture ot false
		int age=31;
		if(married) {
			System.out.println("driver is married");
		}
		else if(gender.equalsIgnoreCase("male") && age>30) {
			System.out.println("the driver is insured and unmarried male above age 30.");
			
		}
		else if(gender.equalsIgnoreCase("female") && age>25) {
			System.out.println("the driver is unmarried and insured female above age 25");
		}

	}

}
