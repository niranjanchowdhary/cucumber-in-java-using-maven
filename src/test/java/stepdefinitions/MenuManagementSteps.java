package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.java.maven.RestaurantMenu;
import cucumber.java.maven.RestaurantMenuItem;

public class MenuManagementSteps {
	RestaurantMenuItem newMenuItem;
	RestaurantMenu LocationMenu=new RestaurantMenu();
	
	@Given("I have a menu item with name \"([^\\]*)\" and price ([0-9]+)")
	public void i_have_a_menu_item_with_name_and_price(String menuItemName, Integer price) {
	    newMenuItem=new RestaurantMenuItem(menuItemName,menuItemName,price);
	    System.out.println("Step 1");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
	    LocationMenu.addMenuItems(newMenuItem);
	    System.out.println("Step 2");
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {
	    boolean Exists=LocationMenu.DeosItemExists(newMenuItem);
	    System.out.println("Step 3:"+Exists);
	}
}
