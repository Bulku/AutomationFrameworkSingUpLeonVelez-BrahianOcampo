Feature: Sing Up - Create Account

  Background:
    Given I am in the home page
    And I navigate to the login page
    Then The login page is displayed
    When I fill name and email fields in the signup form
    And I click on the sign up option
    Then The sign up page is displayed

  @this
  Scenario: Sign up with a new user - Happy path
    When I fill the sign up form with valid data
    And I finish the account creation
    Then The account created page is displayed
    When I click on the continue button
    Then I am in the home page

  @this
  Scenario: Alert message when the password field is empty
    When I fill the sign up form with valid data
    And I clean the password field and send the form
    Then Password is empty alert is displayed

  @this
  Scenario: Mobile phone field only allows numbers
    When I fill the sign up form with valid data
    And I clean phone field and fill the field with text
    Then Verify phone number is a number

  @this
  Scenario: Zip code field only allows numbers
    When I fill the sign up form with valid data
    And I clean zipcode field and fill the field with text
    Then Verify zipcode is a number


  @this
  Scenario: The User name size is less than 23 characters
    When I fill the sign up form with valid data
    And I overfill the user name field
    Then The User Name size is less than valid characters


