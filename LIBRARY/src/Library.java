import java.util.ArrayList;

public class Library {

	private ArrayList<Book> library = new ArrayList<Book>();
	
	public Library() {
		
	}
	public Library(ArrayList<Book>library) {
		this.library = library;
	}
	
	public void printNames() {
		for (int i =0; i < this.library.size(); i++) {
			System.out.println(library.get(i).getName());
		}
	}
	
	public void printPrices() {
		for (int i =0; i < this.library.size(); i++) {
			System.out.println(library.get(i).getPrice());
		}
	}
	
	public void printAvailability() {
		for (int i =0; i < this.library.size(); i++) {
			System.out.println(library.get(i).getAvailability());
		}
	}
	
	public void addBook(Book book) {
		this.library.add(book);
	}
	
	public Integer size() {
		return this.library.size();
	}
} 
