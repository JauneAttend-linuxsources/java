import java.io.*;
import java.util.*;
public class Launcher {

	public static void main(String[] args) throws FileNotFoundException {
		
		InputStream in = new FileInputStream("library.txt");
		Scanner sc = new Scanner(in);
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
		
		lib.printNames();
		lib.printPrices();
		lib.LibrarySize();
		lib.printAvailability();
		User user1 = new User("Jonathan");
		User user2 = new User("Fred");
		Receipt r = new Receipt();
		
		Book book0 = new Book("Otoman", 1450, true);
		String name0 = "Jonathan";
		
		Book book1 = new Book("Roman Empire", 2000, true);
		String name1 = "Jeremiah";
		
		Book book2 = new Book("Sydney City of Light", 15000, true);
		String name2 = "Johnson";
		
		Book book3 = new Book("Paris today", 1000, true);
		String name3 = "Paul Harden";
		try {
		r.generateReceipt(book0, name0);
		r.generateReceipt(book1, name1);
		r.generateReceipt(book2, name2);
		}
		catch(Exception e) {
			System.out.println("Error...");
		}
		
		
		user1.BuyB("rome", lib);
		user2.SearchForBook("rome", lib);
	
		
		
		
	}

}
