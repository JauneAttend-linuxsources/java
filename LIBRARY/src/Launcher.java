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
		lib.LibrarySize();
		lib.printAvailability();
		
		User g = new User();
		g.setName("patrick Li");
		Book b = new Book("Roman", 158, true);
		ReceiptP re = new ReceiptP(b,g.getName());
		re.generateReceipt(b, g.getName());
		
		User ge = new User();
		ge.setName("Lionnel Docko");
		Book bo = new Book("Italy in 1985", 158, true);
		re.generateReceipt(bo, ge.getName());
		
		
		g.BuyB("rome", lib);
		g.SearchForBook("rome", lib);
	
		
		
		
	}

}
