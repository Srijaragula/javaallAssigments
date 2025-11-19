package allassignments;

public class Person {
	private String name;  
	private int age;
	Person(String a,int b){
		name=a;
		age=b;
		
	}
	public void introduce() {//njjn
		System.out.println("Introducing her name and age :");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
	} 
	public static void main(String args[]) {
		Person p=new Person("srija",22);
		p.introduce();
		Person p1=new Person("Tharu",21);
		p1.introduce();
	}
}
