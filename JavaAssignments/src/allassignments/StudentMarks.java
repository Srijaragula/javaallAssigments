package allassignments;
import java.util.*; 

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for 5 subjects:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();//jknjknkjn
		int m5=sc.nextInt();
		
		int total=m1+m2+m3+m4+m5;
		float percentage=total/5.0f;
		System.out.println("total marks:" +total);
		System.out.println("percentage is:" +percentage +"%");
		
		char grade;
		if(percentage>=90)
			grade='A';
		else if(percentage>=80)
			grade='B';
		else if(percentage>=60)
			grade='C';
		else if(percentage>=40)
			grade='D';
		
		else
			grade='F';
		System.out.println("grade"+grade);
	}
	
}


