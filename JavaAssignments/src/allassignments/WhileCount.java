package allassignments;

public class WhileCount {

	public static void main(String[] args) {
		int n=234788959;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("count"+count);
		
	}

}
