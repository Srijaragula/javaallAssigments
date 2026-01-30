package allassignments; 
 
public class GreatestOf4 {

	public static void main(String[] args) { 
		int num1 = 25; 
        int num2 = 78;
        int num3 = 12;
        int num4 = 90;

        int greatest = (num1 > num2 ?
                       (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4)) ://num
                       (num2 > num3 ? (num2 > num4 ? num2 : num4) : (num3 > num4 ? num3 : num4)));

        System.out.println("The four numbers are: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
        System.out.println("The greatest number is: " + greatest);

	}

}
