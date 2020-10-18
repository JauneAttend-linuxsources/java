import java.util.Scanner;
public class program4b {
    /**
     * 
     * @param num1 the number of dots printed before the stars
     * @param num2 the number of stars printed
     * @param num3 the number of dots printed after the stars
     */
	public static void starPrint(int num1, int num2, int num3) {
		for (int i = 0; i <num1; ++i) {
			System.out.print(".");
		}
		for (int i = 0; i <num2; ++i) {
			System.out.print("*");
		}
		for (int i = 0; i <num3; ++i) {
			System.out.print(".");
		}
		
	}
	/**
	 * 
	 * @param row the height of our Christmas tree
	 * the number of stars follow odd numbers pattern (2i+1)
	 * and the number of dots decreased at the left 
	 * and right side from one star. 
	 */
	public static void ChristmasTree( int row) {
		System.out.print("\n");
		for (int i = 0; i <=row; i++) {
			starPrint(row-i,2*i+1,row-i);
			System.out.print("\n");
	        
			if( i == row) {
				i = 0;
				starPrint(row-i,2*i+1,row-i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		while(row < 3) {
			System.out.println("Enter a number greater than 2");
			row = sc.nextInt();
		}
		ChristmasTree(row);
	}

}
