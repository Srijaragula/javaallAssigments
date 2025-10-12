package allassignments;

public class StaticBlock {
	static String companyname; 
	static {
		System.out.println("Inside the block");
		companyname="TCS";
	}
	static {
		System.out.println("ststic block2");
		
	}
	static {
		System.out.println("static block3");
	}
	public static void main(String args[]) {
		System.out.println("main method");
		System.out.println("companyname "+companyname);
	}
	static {
		System.out.println("static4");
	}

}
