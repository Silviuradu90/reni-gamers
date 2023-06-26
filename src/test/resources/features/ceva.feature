Feature: Login

  @Data
  Scenario: Data Table
    Given I go to "http://localhost:3000/"
    And I write the following
      | NAME     | Sergiu |
      | PASSWORD | 123456 |
    Then I verify the login button color is teal
    And I click Login Button

@Data
  Scenario:
    Given I go to "http://localhost:3000/"

 @MRA-201a, @MRA-201
  Scenario:
   Given I go to "http://localhost:3000/dashboard"
   Then the field "searchEngine" in dashboard page exists
   And the field "languageDisplayed" in dashboard page exists
   And the field "theme" in dashboard page exists
   And the field "notification" in dashboard page exists
   And the field "messages" in dashboard page exists
   And the field "profile" in dashboard page exists

 @MRA-201b, @MRA-201
 Scenario:
  Given I go to "http://localhost:3000/dashboard"
  Then I write "bla bla" and hit enter


@MRA-202
 Scenario:
  Given I go to "http://localhost:3000/dashboard" page
  Then the field "Main" in dashboard page is present
  And the field "dashboard" in dashboard page is present
  And the field "lists" in dashboard page is present
  And the field "users" in dashboard page is present
  And the field "products" in dashboard page is present
  And the field "progression" in dashboard page is present
  And the field "calendar & time" in dashboard page is present
  And the field "control panel" in dashboard page is present
  And the field "settings" in dashboard page is present
  And the field "API" in dashboard page is present
  And the field "System Monitor" in dashboard page is present
  And the field "Logs" in dashboard page is present
  And the field "User" in dashboard page is present
  And the field "Profile" in dashboard page is present
  And the field "Log out" in dashboard page is present
  And the field "White Theme" in dashboard page is present
  And the field "Black Theme" in dashboard page is present

 @MRA-203a, @MRA-203b, @MRA-203
 Scenario:
  Given I go to "http://localhost:3000/dashboard"
  And the field "MAIN" in dashboard page is present with upper case
  And the field "LISTS" in dashboard page is present with upper case
  And the field "CONTROL PANEL" in dashboard page is present with upper case
  And the field "USERS" in dashboard page is present with upper case

  And the field "dashboard" in dashboard page is present with one upper case
  And the field "users" in dashboard page is present with one upper case
  And the field "products" in dashboard page is present with one upper case
  And the field "progression" in dashboard page is present with one upper case
  And the field "calendar & time" in dashboard page is present with one upper case
  And the field "settings" in dashboard page is present with one upper case
  And the field "API" in dashboard page is present with one upper case
  And the field "System Monitor" in dashboard page is present with one upper case
  And the field "Logs" in dashboard page is present with one upper case
  And the field "Profile" in dashboard page is present with one upper case
  And the field "Log out" in dashboard page is present with one upper case

  @MRA-300
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the area "Users" is present
    And the area "Products" is present
    And the area "Budget" is present
    And the area "Happyness" is present
    And the area "Energy chart" is present
    And the area "Having fun" is present
    And the area "Latest Transactions" is present


  @MRA-301
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the field "Users" is present in dashboard
    And the field "number users" is present in dashboard
    And the field "Arrow Users" is present in dashboard
    And the field "See All Users" is present in dashboard
    And the field "Icon Users" is present in dashboard


  @MRA-301color
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then check the arrow color

  @MRA-302
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the field "PRODUCTS" is present in dashboard
    And the field "Number Products" is present in dashboard
    And the field "Arrow Products" is present in dashboard
    And the field "See All Products" is present in dashboard
    And the field "Icon Products" is present in dashboard

  @MRA-303
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the field "BUDGET" is present in dashboard
    And the field "Arrow Budget" is present in dashboard
    And the field "Budget Numbers" is present in dashboard
    And the field "Budget Symbol" is present in dashboard

  @MRA-304
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the field "HAPPYNESS" is present in dashboard
    And the field "Arrow HAPPYNESS" is present in dashboard
    And the field "HAPPYNESS Number" is present in dashboard
    And the field "HAPPYNESS Symbol" is present in dashboard

  @MRA-305
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the field "ENERGY" is present in dashboard page
    And the field "ENERGY TEXT" is present in dashboard page
    And the field "ENERGY CHART" is present in dashboard page
    And the field "ENERGY Level" is present in dashboard page
    And the field "ENERGY PERCENTAGE" is present in dashboard page
    And the field "ENERGY Target" is present in dashboard page
    And the field "ENERGY Target Percentage" is present in dashboard page
    And the field "ENERGY Week" is present in dashboard page
    And the field "ENERGY Week PERCENTAGE" is present in dashboard page
    And the field "ENERGY Month" is present in dashboard page
    And the field "ENERGY Month Percentage" is present in dashboard page

  @MRA-306
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the field "FUN" is present in dashboard page
    And the field "FUN CHART" is present in dashboard page
    And the field "FUN Level" is present in dashboard page
    And the field "FUN PERCENTAGE" is present in dashboard page
    And the field "FUN Target" is present in dashboard page
    And the field "FUN Target Percentage" is present in dashboard page
    And the field "FUN WEEK" is present in dashboard page
    And the field "FUN Week PERCENTAGE" is present in dashboard page
    And the field "FUN Month" is present in dashboard page
    And the field "FUN Month PERCENTAGE" is present in dashboard page
    And the field "FUN TEXT" is present in dashboard page



  @MRA-307
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the area "Table Header" is present in dashboard page
    Then the area "Tracking Id" is present in dashboard page
    Then the area "Product" is present in dashboard page
    Then the area "Vendor" is present in dashboard page
    Then the area "Date" is present in dashboard page
    Then the area "Amount" is present in dashboard page
    Then the area "Payment Method" is present in dashboard page
    Then the area "Status" is present in dashboard page

  @MRA-308
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the status colors for "Status" is present in dashboard page for each line

  @MRA-309
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the payment status for "Payment Method" is present in dashboard page for each line

  @MRA-310
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the number for "Amount" is present in dashboard page for each line

  @MRA-311
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the correct data format for "Date" is present in dashboard page for each line

  @MRA-312
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the name & icon product for "Product" is present in dashboard page for each line

  @MRA-313
  Scenario:
    Given I visit "http://localhost:3000/dashboard"
    Then the id number for "Tracking ID" is present in dashboard page for each line




