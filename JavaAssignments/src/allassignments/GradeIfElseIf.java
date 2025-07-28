package allassignments;

public class GradeIfElseIf {

	public static void main(String[] args) {
		int total=560;
		char grade=' ';
		if(total>=500 && total<=600)
			grade='A';
		else if(total>=400 && total<500)
			grade='B';
		else if(total>=300 && total<400)
			grade='C';
		else if(total<300)
			grade='D';
		System.out.println("Grade is:" +grade);

	}

}
