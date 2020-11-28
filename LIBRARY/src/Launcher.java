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
		
		lib.printNames();
		lib.printPrices();

	}

}
