package allassignments;
import java.util.*;

public class CharAlphaFind {//jnjn

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a single value:");
		String input=sc.next();
		char ch=input.CharAt(0);
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("it is an alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("it is a digit");//gy
		}
		else {
			System.out.println("it is a special character");
		}

	}

}
