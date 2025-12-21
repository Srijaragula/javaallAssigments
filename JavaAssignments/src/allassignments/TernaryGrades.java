package allassignments; 
  
public class TernaryGrades {   
         
	public static void main(String[] args) {  
		int marks = 85;   
		String result=(marks>90 && marks<=80)?"distinction":(marks>75)?"first class":(marks>50)?"second class":(marks>45)?"third class":"fail";
		System.out.println(result);  
 
	}

}
