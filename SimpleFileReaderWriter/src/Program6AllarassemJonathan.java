import java.util.*;
import java.io.*;
public class Program6AllarassemJonathan {

	public static void sortFiles(Scanner sc1 , Scanner sc2, PrintWriter pen) {
		ArrayList<Integer> extractInt = new ArrayList<Integer>();
		/*
		 * While there is something in the file 
		 *  input1.txt if it is an integer we take it
		 */
		while(sc1.hasNext()) {
			extractInt.add(sc1.nextInt());
		}
		
		/*
		 * While there is something in the file 
		 * input2.txt if it is an integer we take it
		 */
		while(sc2.hasNext()) {
			extractInt.add(sc2.nextInt());
		}
		/**
		 * We create an array to stock the values 
		 */
		int [] array = new int [extractInt.size()];
		
		/*
		 * We stock it
		 */
		for (int i = 0; i < extractInt.size(); i++) {
			array[i]=extractInt.get(i);
		}
		/*
		 * We sort the value
		 */
		for (int i = 0; i < array.length; i++) {
			 for ( int j = i; j < array.length; j++) {
				 
				 /*The goal here is to take the minimum of the series 
				  * and to move it on the left side increasing each time 
				  * i by 1 index. SO we will compare successively i
				  * to all the elements of the array through j and 
				  * putting the lower one at the top of the array
				  * after each iteration
				  */
				 if(array[i] > array [j]) {
					 int temp = array[i];
					 array[i] = array[j];
					 array[j] = temp;
				 }
			 }
				
			}
		/*
		 * We write in the file output0.txt
		 */
		for (int i = 0; i < extractInt.size(); i++) {
			System.out.print(array[i]+ " ");
			pen.print(array[i] + " ");
		}
		
	}
	public static void main(String [] args) throws IOException {
		/*
		 * We create the tools necessary for the extraction and writing
		 */
		InputStream streamin1 = new FileInputStream("numbers1.txt");
		Scanner sc1 = new Scanner(streamin1);
		InputStream streamin2 = new FileInputStream("numbers2.txt");
		Scanner sc2 = new Scanner(streamin2);
		OutputStream streamou = new FileOutputStream("output.txt");
		PrintWriter pen = new PrintWriter(streamou);
	
		// when one file has more digits than the other
		RandomWriter ran = new RandomWriter(5,14,"numbers1.txt","numbers2.txt");
		ran.Testor();
		sortFiles(sc1,sc2,pen);
		
		
		InputStream streamin1Empty = new FileInputStream("empty1.txt");
		Scanner sc1empty = new Scanner(streamin1Empty);
		InputStream streamin2Empty = new FileInputStream("empty2.txt");
		Scanner sc2empty = new Scanner(streamin2Empty);
		InputStream streamSemi = new FileInputStream("SemiEmpty.txt");
		Scanner scSemi = new Scanner(streamSemi);
		OutputStream streamoutEmpty = new FileOutputStream("outputempty.txt");
		PrintWriter penEmpty = new PrintWriter(streamoutEmpty);
		OutputStream stremoutEmpty0 = new FileOutputStream("outputSemiEmpty.txt");
		PrintWriter penSemi = new PrintWriter(stremoutEmpty0);
		
		//when two file are empty
		RandomWriter ran1 = new RandomWriter(0,0,"empty1.txt","empty2.txt");
		ran1.Testor();
		sortFiles(sc1empty, sc2empty, penEmpty);
		
		//when one file is empty and the other not
		RandomWriter ran2 = new RandomWriter(10,0,"SemiEmpty.txt","empty2.txt");
		ran2.Testor();
		sortFiles(scSemi, sc2empty, penSemi);
		
		/*
		 * we close all the streams and objects
		 */
		pen.close();
		penSemi.close();
		penEmpty.close();
		sc1.close();
		sc2.close();
	
	}
}
