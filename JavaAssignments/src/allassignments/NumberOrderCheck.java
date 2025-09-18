package allassignments;

public class NumberOrderCheck {

	public static void main(String[] args) {
		int num1=20;
		int num2=80;
		int num3=70;
		
       if(num1<num2 && num2<num3) {//jnj
    	   System.out.println("numbers are in increasing order");
       }else if(num1>num2 && num2>num3) {
    	   System.out.println("numbers are in decreasing order");
       }else {//kjnk
    	   System.out.println("numbers are neither in increasing order nor in decreasing order");
       }
	}

}
