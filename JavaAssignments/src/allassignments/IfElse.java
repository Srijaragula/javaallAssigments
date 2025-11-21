package allassignments;

public class IfElse {

	public static void main(String[] args) {
		int bal_amt=5000,withdw_amt=6000; 
		if(bal_amt>=withdw_amt)
		{
			bal_amt-=withdw_amt;
			System.out.println("balance:"+bal_amt);
	}
		else
		
			System.out.println("Insufficient funds");
		

	}

}
