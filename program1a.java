package project1;
import java.util.Scanner;
public class Program1a {

	public static void main(String[] args) {
		
		// Declaration and initialization
		
		int room_capacity=0;
		int ppl_number=0;
		int rem=0;
		
		
		// Information gathering
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("How many people attending?");
        ppl_number= scan.nextInt();
        
        System.out.println("What the capacity of the room?");
        room_capacity= scan.nextInt();
        
        
        
        // Conditions and outputs
        
        if(ppl_number<=room_capacity) {
        	rem=room_capacity-ppl_number; 
        	System.out.println("Everything is all right! Add " + rem + " more people if you want!!");
        }
        else {
        	rem = ppl_number-room_capacity;
        	System.out.println("That's too many people! Get rid of " + rem + " ." );
        }
        
	}
	
}
