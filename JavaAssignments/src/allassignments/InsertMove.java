package allassignments;

import java.lang.reflect.Array;  
  
public class InsertMove {  
 
	public static void main(String[] args) {
	int[] r= {20,27,89,40}; 
	int[] arr=new int[r.length+1];
	r[0]=18;//yjyy
	
	for(int i=0;i<r.length;i++) {
		arr[i+1]=r[i];
		
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	

	}

}
