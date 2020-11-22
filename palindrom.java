package program3;
import java.util.Scanner;
public class program3bAllarassemJonathan {
	
	public static int divide(int num) {
		return (int)(Math.ceil(num/2.0));
	}
	
	public static void fill( int size, char [] arr, Scanner sc) {
		for ( int  i = 0; i < size; i++) {
			System.out.println("Enter the letter number " + (i+1));
			arr[i] = sc.next().toUpperCase().charAt(0);
		}
		
	}
	
    public static boolean check( int size, char [] arr, int cp) {
	    for ( int i = 0; i < divide(size); ++i) {
				if( arr [i] == arr[size-1-i]) {
					cp ++;
					continue;
				}
				else {
					break;
				}
			}
	    return (cp == divide(size));
	}
    
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		// The counter initialization
		int cp = 0;
		
		// The creation of the array && check of the value
		int size = sc.nextInt();
		while(size <= 0) {
			System.out.println("Enter a positive value");
			size = sc.nextInt();
		}
		char [] arr = new char [size];
		
		
		// We fill the array with values
		fill(size, arr, sc);
		
		
		// if we have a palindrome we put so instead we say the opposite
		if(check (size, arr, cp)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
	
	
	
	
	
	
	
}
