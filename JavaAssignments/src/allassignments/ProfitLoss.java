package allassignments;
import java.util.*;

public class ProfitLoss {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("cost price:");
		System.out.println("selling price:");
		double cp=sc.nextDouble();
		double sp=sc.nextDouble();
		sc.close();
		if(sp>cp) {
			double profit=sp-cp;
			System.out.println("profit" +profit);
		
		}else if(cp>sp){
			double loss=cp-sp;//sp
			System.out.println("loss" +loss);
		}else {
			System.out.println("no profit no loss");
		}
	}

}
