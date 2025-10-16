package allassignments;
import java.util.*;   
 
public class CountNotes { 

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
    System.out.print("Enter amount: ");
    int amount = sc.nextInt();
    sc.close();

    int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    int[] count = new int[notes.length];

    int remaining = amount;

    for (int i = 0; i < notes.length; i++) {
        if (remaining >= notes[i]) {
            count[i] = remaining / notes[i];
            remaining %= notes[i];
        }
    }

    System.out.println("\nCurrency Count ->");
    int totalNotes = 0;
    for (int i = 0; i < notes.length; i++) {
        if (count[i] > 0) {
            System.out.println(notes[i] + " : " + count[i]);
            totalNotes += count[i];
        }
    }
    System.out.println("Total notes = " + totalNotes);
	}

}
