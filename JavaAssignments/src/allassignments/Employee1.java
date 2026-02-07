package allassignments; 
  
public class Employee1 { 
	int empid;       
	String ename;   
	private float esalary;  
	class Person extends Employee1{ 
		private float esalary;
		Person(int id,String name,float salary){
			empid=id;
			ename=name;
			esalary=salary;
		}
		public void displaySalary() {
			System.out.println("employees salary is:");
			System.out.println("empid"+empid);
			System.out.println("ename"+ename);
			System.out.println("esalary"+esalary);
		}
		public static void main(String args[]) {
			Person e=new Person();
			e.displaySalary();
		}
		
	}

}
