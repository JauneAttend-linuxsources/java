import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Receipt {

	private LocalDateTime date = LocalDateTime.now();
	private Integer i = 0;
	
	
	public String toString(Book book, String user) {
		String str = "PurchaseReceipt"
				+ book.getName() + "\n"
				+ book.getPrice() + "\n"
				+ user + "\n"
				+ date + "\n";
		
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
		

	}

}
