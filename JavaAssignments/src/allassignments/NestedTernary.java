package allassignments;

public class NestedTernary { 
 
	public static void main(String[] args) { 
		int a=20,b=15,c=50; 
		int result=(a>b)?((a>c)?a:c):((b>c)?b:c); 
		System.out.println(result); 
	}

}
