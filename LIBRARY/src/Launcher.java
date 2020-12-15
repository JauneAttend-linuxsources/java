import java.io.*;
import java.util.*;
public class Launcher {

	public static void main(String[] args) throws FileNotFoundException {
		
		InputStream in = new FileInputStream("library.txt");
		InputStream inWE = new FileInputStream("Welcome.txt");
		Scanner sc = new Scanner(in);
		Scanner scWE = new Scanner(inWE);
		Library lib = new Library();
		
		while(sc.hasNext()) {
			String name = sc.next();
			Integer price = sc.nextInt();
			Boolean ok = true;
			Book book = new Book(name, price, ok);
			lib.addBook(book);
		}
		
		/*
		 * WE ARE TESTING TO SEE IF ALL THE METHODS
		 * ARE WORKING!!!
		 */
		System.out.println("			LIBRARY SERVICE            \n" + 
				"-----------------------------------------------------------------------\n" + 
				"\n" + 
				"	Welcome to our library service. We provide basics interactions to users\n" + 
				"they can buy or borrow a book or just search for one. Some of the options a\n" + 
				"re available other not but hey, you can still use it and enjoy! \n" + 
				"									\n" + 
				"													Happy Reading!");
		
		
	}

}
