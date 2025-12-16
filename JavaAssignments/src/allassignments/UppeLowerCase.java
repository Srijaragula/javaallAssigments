 package allassignments;
import java.util.*;   
     
public class UppeLowerCase {    
 
		    public static void main(String[] args) {   
		        Scanner sc = new Scanner(System.in);      
		        System.out.print("Enter a single character: ");
		        String input = sc.next();
		        sc.close();
 
		        if (input.length() != 1) { 
		            System.out.println("Invalid input: please enter exactly one character.");
		            return;
		        }

		        char ch = input.charAt(0);

		        if (Character.isUpperCase(ch)) {
		            System.out.println(ch + " is an uppercase alphabet.");
		        } else if (Character.isLowerCase(ch)) {
		            System.out.println(ch + " is a lowercase alphabet.");
		        } else {
		            System.out.println(ch + " is not an alphabet character.");
		        }
		    }



	}


