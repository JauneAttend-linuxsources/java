import java.util.*;
import java.io.*;
public class RandomWriter {

	/*
	 * val1 is the number of numbers in numbers1.txt
	 */
	private int val1;
	
	/*
	 * val2 is the number of numbers in numbers2.txt
	 */
	private int val2;
	
	/*
	 * path1 is the path to the first file
	 */
	private String path1 = " ";
	
	/*
	 * path2 is the path to the second file
	 */
	private String path2 = " ";
	
	/*
	 * We initialize these values with a constructor
	 */
	public RandomWriter(int val1,int val2, String path1,String path2) {
		this.val1=val1;
		this.val2=val2;
		this.path1=path1;
		this.path2=path2;
	}
	
	/*
	 * Testor() will fill the two documents with 
	 * as many random numbers as we have values
	 */
	public void Testor() throws FileNotFoundException {
		OutputStream ou = new FileOutputStream(path1);
		PrintWriter pen = new PrintWriter(ou);
		OutputStream ou1 = new FileOutputStream(path2);
		PrintWriter pen1 = new PrintWriter(ou1);
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		
		for(int i = 0; i < this.val1; i++) {
			ar1.add(rand.nextInt(20));
		}
		
		ar1.sort(null);
		
		for(int i = 0; i < this.val1; i++) {
			pen.print(ar1.get(i) + " ");
		}
		
		for(int i = 0; i < this.val2; i++) {
			ar2.add(rand.nextInt(20));
		}
		
		ar2.sort(null);
		
		for(int i = 0; i < this.val2; i++) {
			pen1.print(ar2.get(i) + " ");
		}
		
		pen.close();
		pen1.close();
		
	}
	
	public static void main(String [] args) {
		RandomWriter ran = new RandomWriter(10,4,"numbers1.txt","numbers2.txt");
		try {
		ran.Testor();
		}
		catch(Exception ex){
			System.out.print(ex.getMessage());
		}
	}
}
