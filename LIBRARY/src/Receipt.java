import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Receipt {

	private LocalDateTime date = LocalDateTime.now();
	private Integer i = 0;
	
	public Receipt() {
		
	}
	
	public String toString(Book book, String user) {
		String str = "Purchase Receipt\n"
				+ "Book name" + book.getName() + "\n"
				+ "Price $" + book.getPrice()+ "\n"
				+ "Client" + user + "\n"
				+ "Date" + date + "\n";
		return str;
	}
	
	public void generateReceipt(Book book, String user) throws FileNotFoundException {
		OutputStream ou = new FileOutputStream("PurchaseReceipt" + i + ".txt");
		PrintWriter pen = new PrintWriter(ou);
		pen.print(this.toString(book,user));
		i++;		
		pen.close();
	}
	
	public static void main(String[] args) {
		Receipt r = new Receipt();
		
		Book book0 = new Book("Otoman", 1450, true);
		String name0 = "Jonathan";
		
		Book book1 = new Book("Roman Empire", 2000, true);
		String name1 = "Jeremiah";
		
		Book book2 = new Book("Sydney City of Light", 15000, true);
		String name2 = "Johnson";
		try {
		r.generateReceipt(book0, name0);
		r.generateReceipt(book1, name1);
		r.generateReceipt(book2, name2);
		}
		catch(Exception e) {
			System.out.println("Error...");
		}
	}

}
