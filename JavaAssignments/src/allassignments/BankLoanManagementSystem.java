package allassignments;
import java.util.Scanner; 
public class BankLoanManagementSystem {    
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in); 
		String registeredUsername="";   
		String registeredPassword=""; 
		String fullName="";
		String adress="";
		String phoneNumber="";
		double annualIncome = 0;
		int loginAttempts = 0;
		boolean isLocked = false;
		boolean isRegistered = false;
		while(true) {
			System.out.println("\n--------Bank Loan Management Menu----");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("1.Exit");
			System.out.println("Choose an Option");
			int option = sc.nextInt();
			sc.nextLine();	
			if(option==1) {
				System.out.println("Enter username:");
				registeredUsername =sc.nextLine();
				
				System.out.println("enter password(min 8 characters):");
				registeredPassword = sc.nextLine();
				if(registeredPassword.length()<8) {
					System.out.println("password is too short!");
					continue;
				}	
				System.out.println("enter full name: ");
				fullName=sc.nextLine();
				System.out.println("Enter adress: ");
				adress = sc.nextLine();
				System.out.print("Enter phone number: ");
                phoneNumber = sc.nextLine();
                System.out.print("Enter annual income: ");
                annualIncome = sc.nextDouble();
                sc.nextLine();
			}
		}    	
	}
}
