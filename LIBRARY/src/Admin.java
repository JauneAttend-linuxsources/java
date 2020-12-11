
public class Admin extends User{
	
	
	public Admin(String name, String password) {
		
		super.name = name;
		super.password = password;
	}
	
	public void addBook(Book book, Library library) {
		library.addBook(book);
	}
	
	
}
