package allassignments;

public class PerfectNumber {
	public static void main(String args[]) { 
	int num=9;//jn
	int sum=0;
	//perfect number
	//sum of its multiples equal to its actual numbers 
	
	for(int i =1;i<=num;i++) {
		if(num%i==0)
		{
			sum+=i;
		}
		
		
	}
	if(sum==num)
		System.out.println("perfect number");
	else
		System.out.println("not perfect number");
}
}
