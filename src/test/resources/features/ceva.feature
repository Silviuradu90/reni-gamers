Feature: Login


  @Data
  Scenario: Data Table
    Given I go to "http://localhost:3000/"
    And I write the following
      | NAME     | Sergiu |
      | PASSWORD | 123456 |
    Then I verify the login button color is teal
    And I click Login Button


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









