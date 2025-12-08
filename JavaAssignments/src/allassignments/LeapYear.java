package allassignments;
import java.util.*;

public class LeapYear { 
 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int a;  
		System.out.println("enter a year"); 
		a=sc.nextInt();
		String b="leapyear";
		String c="not_a_leapyear";
		String year=(a%4==0 && a%100==0 && a%400==0)?b:c;
		System.out.println(year);
				}

}
