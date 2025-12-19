package allassignments;

public class Student {   
	private String name;
	private int age;  
	private double GPA=0.0;
	Student(String n,int a,double g){  
		name=n; 
		age=a;
		GPA=g;
		
	}
	Student(String r,int u){
		name=r;
		age=u;
	}
	public void displayGPA() {
		System.out.println("gpa is "+GPA);
	}
	public static void main(String args[]) {
		Student s=new Student("srija",21,10);
		s.displayGPA();
		System.out.println(s.name);
		System.out.println(s.age);
	}

}
