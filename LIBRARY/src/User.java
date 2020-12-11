import java.io.FileNotFoundException;
import java.util.*;
public class User {

	protected String name;
	protected String password;
    private ArrayList<Book> BorrowedBook = new ArrayList<Book>();
	private ArrayList<Book> BoughtBook = new ArrayList<Book>();
	
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 
	 * @param name | set the name of the user
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param password | set the password of the user
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Print the user
	 */
	public void printUser() {
		System.out.println("User " + this.name);
	}
	
	/**
	 * 
	 * @param name | name of the user
	 * @param lib  | library where you borrow
	 */
	public void BorrowB(String name, Library lib) {
		name = name.toUpperCase();
		if(lib.getBook(name).getAvailability()) {
			this.BorrowedBook.add(lib.getBook(name));
			lib.getBook(name).setAvailable(false);
			System.out.println("Book sucessfully borrowed...");
		}
		else {
		
			System.out.println("This book is not available");
		}
	}
	
	/**
	 * 
	 * @param name | name of the user
	 * @param lib  | library where you buy
	 */
	public void BuyB(String name, Library lib) throws FileNotFoundException {
		if(lib.getBook(name).getAvailability()) {
			this.BoughtBook.add(lib.getBook(name));
			lib.getBook(name).setAvailable(false);
			lib.removeB(name, lib);
			System.out.println("Book sucessfully bought! you can take out your receipt");
		}
		else {
			System.out.println("This book is not available");
		}
		
	}
	
	/**
	 * 
	 * @param name | name of the book
	 * @param lib  | library where you search
	 */
	public void SearchForBook(String name, Library lib) {
		if(lib.getBook(name) == null) {
			System.out.println("this book is not in our database");
		}
		else if(lib.getBook(name).getAvailability()) {
			lib.getBook(name).printBook();
			System.out.print(" " + "is available");
		}
		else {
			System.out.println("this book has been borrowed or bought");
		}
	}
	
	/**
	 * 
	 * @param name | name of the book you bring back
	 * @param lib  | library where you bring your book back
	 */
	public void BringB(String name, Library lib) {
		lib.getBook(name).setAvailable(true);
		this.BorrowedBook.remove(lib.getBook(name));
		System.out.println("this book is available now!");
	}
	
	}
	

