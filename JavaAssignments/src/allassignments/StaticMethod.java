package allassignments;
  
public class StaticMethod {
	//ststic mthod 
	//global variaqble  
	static String companyname;  
	 //static block 
	static {
		System.out.println("inside the block");
		companyname =" tcs";
	}
	//user defined static method
	//Access modifier statickeyword returntype methodname
	public static void printdata() {
		//calling static variable
		System.out.println("companyname"+companyname);
	}
	//predefined static method
	public static void main(String args[]) {
		System.out.println("main method");
		//calling static method
		printdata();//employee.printdata();
	}

}
