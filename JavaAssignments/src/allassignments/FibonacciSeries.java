package allassignments;

public class FibonacciSeries {  
    
	public static void main(String[] args) {
		//Addition of last two numbers is  the next number
		//0 1 1 2 3 5 8 
		int n1=0,n2=1,n3=0;//high
		System.out.print(n1+" "+n2+" ");//jnhj
		for(int i=2;i<10;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
