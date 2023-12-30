
Feature: This feature is to test home page scenarios

Background: 
	Given Launch the browser and load the Url

@Regression
Scenario: This scenario is to test Mobile Search
#	Given Launch the browser and load the Url   
	When Input keyword Mobile and hit Search
	Then Validate the results are displayed for Mobiles

@Regression
Scenario: This scenario is to test Laptop Search
#	Given Launch the browser and load the Url   
	When Input keyword Laptop and hit Search
	Then Validate the results are displayed for Mobiles
	
Scenario: This scenario is to test iPhone Purchse
#	Given Launch the browser and load the Url
	And Login to the account and search for iPhone
	When Add the phone to cart and checkout
	And Provide the valid payment detail and place order
	Then Validate the order placed and Order id generated
	And Sign out from the account and close browser
