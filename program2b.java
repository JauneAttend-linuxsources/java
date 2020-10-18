import java.util.Scanner;
public class Program2bAllarassemJonathan {
	
	public static void main(String[] args) {
		double size;
		long days;
		long i;
		
		Scanner sc = new Scanner(System.in);
		
		// TAKE BACK THE SIZE AT DAY 0 AND THE NUMBER OF DAYS
		
		System.out.println("Give the number of days");
		days = sc.nextLong();
		System.out.println("Give the inital Size in pounds");
		size = sc.nextLong();
		
		/* FOR EACH DAY I CHECK IF IT'S DIVISIBLE BY 5 
		 *OR NO THEN ADD 1 OR MULTIPLY BY 2*/
		
		for ( i = 1 ; i <= days ; ++i) {

			if ( i%5 == 0 ) {
				size*=2;
			}
			else {
			    size+=1;	
			}
		}
		System.out.println(size);
		}
		
	}


