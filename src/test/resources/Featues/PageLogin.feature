@Smoke
Feature: This feature is to test login page scenarios
	
Scenario Outline: This scenario is to test login with valid credential
	Given Launch the browser and load the Url.  
	When Provide valid "<Username>" and "<Password>".
	Then Validate the user is logged in "<Address>".
	
Examples: 
 |Username|Password|Address|
 |azharudeen@gmail.com|Abc@123|Chennai|
 |geetha@yahoo.com|Welcome@5|London|
 |sumithra@outlook.in|Test$234|New York|
 
 