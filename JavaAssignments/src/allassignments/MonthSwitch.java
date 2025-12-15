package allassignments;
import java.util.*;
     
public class MonthSwitch { 
 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);//kjbhkjb
		System.out.println("Enter months from 1-12");
		int m=sc.nextInt();
		
		String name;//jnkj
		switch (m) { 
		case 1:
			name="january";
			break;
		case 2:
			name="feb";
			break;
		case 3:
			name="march";
			break;
		case 4:
			name="april";
			break;
		case 5:
			name="may";
			break;
		case 6:
			name="june";
			break;
		case 7:
			name="july";
			break;
		case 8:
			name="aug";
			break;
		case 9:
			name="sept";
			break;
		case 10:
			name="oct";
			break;
		case 11:
			name="nov";
			break;
		case 12:
			name="dec";
			break;
		default:
           name="invalidmonthnumber";
            break;
		}
       System.out.println("Month:"+name);
       sc.close();
	}

}
