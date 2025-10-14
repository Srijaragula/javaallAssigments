package allassignments;

import java.util.Scanner;

public class MaxMin {
 
	public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("Enter two numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	if(a>b) {
		System.out.println("a is Max");
	}
	else if(b>a){
		System.out.println("b is Max");
		
	}
	}

}
