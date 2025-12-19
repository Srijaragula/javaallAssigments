package allassignments;  
import java.util.*;
   
public class WeekDay {    
     
	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the day number(1-7) :"); 
		int dayNum=sc.nextInt();  
		
		String day;  
		switch (dayNum){
		case 1:
			day ="Monday";//j
			break;
		case 2:
			day ="tues";
			break;
		case 3:
			day ="wed";
			break;
		case 4:
			day ="thurs";
			break;
		case 5:
			day ="friday";
			break;
		case 6:
			day ="saturday";
			break;
		case 7:
			day ="sunday";
			break;
		default:
			day ="invaliddaynum";
			break;
			
		}
		System.out.println("day:" +day);
		sc.close();
		

	}

}
