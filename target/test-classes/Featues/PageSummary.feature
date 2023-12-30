Feature: Title of your feature

  @tag1
  Scenario: Title of your scenario
    Given Launch browser and load url
    When Provide all details and create user
    |FirstName|LastName|Email|Gender|Password|
    |Sony|Dasan|sonydasan@gmail.com|Female|Test@123|
    |Geetha|S|geethas@outlook.com|Female|Welcome@23|
    |Azhar|Mohamed|azhar@yahoo.in|Male|Test$567099|
    Then Perform validation for the account

