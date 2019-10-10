package cucumber.java.maven;

import java.util.ArrayList;

public class RestaurantMenu {
	
	
	ArrayList<RestaurantMenuItem> MenuItems=new ArrayList<>();
	
	public boolean addMenuItems(RestaurantMenuItem newMenuItem) {
		return MenuItems.add(newMenuItem);
		
	}
	
	public boolean DeosItemExists(RestaurantMenuItem newMenuItem) {
		
		boolean Exists=false;
		if(MenuItems.contains(newMenuItem)) {
			Exists=true;
		}
		return Exists;
	}
	
	
}
