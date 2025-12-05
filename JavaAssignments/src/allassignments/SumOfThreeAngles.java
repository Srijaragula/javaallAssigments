package allassignments;

public class SumOfThreeAngles {  
      
	public static void main(String[] args) { 
		int ang1=60; 
		int ang2=90;  
		int ang3=75;  
		
		int sum=ang1+ang2+ang3;
		 
		if(sum==180) { 
			System.out.println("angles form a valid traingle");
		}else {
			System.out.println("angles dont form a valid traingle");
		}

	}

}
