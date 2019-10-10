package cucumber.java.maven;

public class RestaurantMenuItem {
	
	private String ItemName;
	private String Description;
	private Integer price;
	
	public RestaurantMenuItem(String itemName, String description, Integer price) {
		super();
		ItemName = itemName;
		Description = description;
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getItemName() {
		return ItemName;
	}

}
