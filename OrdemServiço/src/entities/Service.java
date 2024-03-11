package entities;

public class Service {
	
	private String description;
	private double price;
	
	
	public Service(String description, double price) {
		super();
		this.description = description;
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	   
	
}
