package allassignments; 
import java.util.Scanner;  

public class WhileNumbers { 

	public static void main(String[] args) {  
		int num=0;    
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers"); 
		num=sc.nextInt();
		System.out.println("num value is:"+num);
		while(i<=num) {
			System.out.println(i);
			i++;
		}
		

	}

}
