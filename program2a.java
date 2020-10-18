import java.util.Scanner;
public class Program2a {

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
		
		char choice1 ;
		char choice2 ;
		boolean ok1, ok2;
		boolean paper1, paper2,scissor1,scissor2,rock1,rock2;
		
		int [] [] [] array2 = new int [5] [4] [2];
		
		int [] [] array0 = new int [4][6];
		
		int []  array1 = new int [5];
		
	    System.out.println(array0[0].length);
	    
	    System.out.println(array1.length);
	    
	    System.out.println(array2[4].length);
		
	/*	
		
		do {
			
			// VERIFICATION THAT THE INPUT ARE EITHER P,S OR R
			
			System.out.println("Player 1, what is your choice?");
			choice1 = sc.next().toUpperCase().charAt(0);
			ok1 = choice1 =='P' || choice1 =='S' || choice1 =='R' ;
			
			while(!ok1) {
				System.out.println("Only enter R, P, or S, try again");
				choice1 = sc.next().toUpperCase().charAt(0);
				ok1 = choice1 =='P' || choice1 =='S' || choice1 =='R' ;

			}
			
			System.out.println("Player 2, what is your choice?");
			choice2 = sc.next().toUpperCase().charAt(0);
			ok2 = choice2 =='P' || choice2 =='S' || choice2 =='R' ;
			while(!ok2) {
				System.out.println("Only enter R, P, or S, try again");
				choice2 = sc.next().toUpperCase().charAt(0);
				ok2 = choice1 =='P' || choice1 =='S' || choice1 =='R' ;
			}
			
			// ANALYSIS OF THE INPUT
			
			paper1 = choice1 =='P' && choice2 =='R';
			paper2 = choice2 =='P' && choice1 =='R';
			scissor1 = choice1 =='S' && choice2 =='P';
			scissor2 = choice2 =='S' && choice1 =='P';
			rock1 = choice1 =='R' && choice2 =='S';
			rock2 = choice2 =='R' && choice1 =='S';
			
			
			// OUTPUTS
			
			if(paper1) {
				System.out.println("Paper covers rock - Player 1 wins.");
			}
			else if(paper2) {
				System.out.println("Paper covers rock - Player 2 wins.");
			}
			else if(scissor1) {
				System.out.println("Scissors cut paper - Player 1 wins.");
			}
			else if(scissor2) {
				System.out.println("Scissors cut paper - Player 2 wins.");
			}
			else if(rock1) {
				System.out.println("Rock breaks scissors - Player 1 wins.");
			}
			else if(rock2) {
				System.out.println("Rock breaks scissors - Player 2 wins.");
			}
			else {
				System.out.println("Draw, nobody wins");
			}
			
		}while(true);
		
		
		
		
		*/

	}

}
