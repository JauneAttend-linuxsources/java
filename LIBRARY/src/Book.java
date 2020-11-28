
public class Book {

	private String name;
	private Integer price;
	private Boolean Available;
	// private Land land;
	
	public Book(String name, Integer price, Boolean isthere ) {
		this.name = name;
		this.price = price;
		this.Available = isthere;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getPrice() {
		return this.price;
	}
	
	public Boolean getAvailability() {
		return this.Available;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public void setAvailable(Boolean ok) {
		this.Available= ok;
	}
	
}
