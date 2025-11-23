package allassignments; 
  
public class UnaryOperator { 
  
	public static void main(String[] args) { 
		int a=6,b=0,c=0,d=0;
		b=a++ + --a;
		System.out.println("A value is"+a);
		System.out.println("B value is"+b);
		c=++b + a++ - ++a;
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		System.out.println("C value is:"+c);
		d=c-- + ++c;
		System.out.println("D value is:"+d);
		System.out.println("c value is:"+c);
		

	}

}
