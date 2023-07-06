@NewUser

Feature: New user

  @Data
  Scenario: New user
    Given I am on "http://localhost:3000/users/new"

  @MRA-500
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the field "Add new Users" in add new user page exists

    And the field "Add new Users" has green text

    And the field "Picture Area" in add new user page exists
    And the field "Name and Surname" in add new user page exists
    And the field "Phone" in add new user page exists
    And the field "Address" in add new user page exists
    And the field "Username" in add new user page exists
    And the field "Email" in add new user page exists
    And the field "Password" in add new user page exists
    And the field "Age" in add new user page exists
    And the field "Country Dropdown" in add new user page exists
    And the field "Submit button" in add new user page exists

  @MRA-500a
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then upload picture button is present and can upload "ugc.jpg"
    And upload picture button is present and can upload "sel.png"

  @MRA-501
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and button for "Upload Image:" in add new user page exists

  @MRA-502
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and field for "Name and surname" in add new user page exists

  @MRA-503
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and field with number for "Phone" in add new user page exists

  @MRA-504
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and field with address for "Address" in add new user page exists

  @MRA-505
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and field with name for "Username" in add new user page exists

  @MRA-506
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and field with email for "Email" in add new user page exists

  @MRA-507
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and empty field for "Password" in add new user page exists

  @MRA-508
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the text and Age dropdown for "Age Dropdown" in add new user page exists
    And the text and field for "Age Dropdown" in add new user page exists


  @MRA-509
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the dropdown for "Country" is present
    And I click on "Andorra" from dropdown
    And I click on "Zimbabwe" from dropdown

  @MRA-510
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then the color for "Submit" button is green

  @MRA-511
  Scenario:
    Given I am on "http://localhost:3000/users/new"
    Then click the "Submit" button
    And the Age Range Dropdown is mandatory



