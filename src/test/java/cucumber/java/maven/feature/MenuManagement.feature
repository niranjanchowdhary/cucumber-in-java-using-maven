Feature: Menu Management
Background: Setup a menu item
  Given I have a menu item with name "Chicken Sandwich" and price 20
  When I add that menu item
  Then Menu Item with name "Chicken Sandwich" should be added
	
	@SmokeTest
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwich" and price $20
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added
	
	@RegularTest
	Scenario: Add another menu item
    Given I have a menu item with name "Cucumber Salad" and price 20
    When I add that menu item
    Then Menu Item with name "Cucumber Salad" should be added
  
  @NightlyBuildTest @RegularTest
 	Scenario: Add a third menu item
    Given I have a menu item with name "Chicken Sandwich" and price 20
    When I add that menu item
    Then I should see an error message with value "Duplicate Item";