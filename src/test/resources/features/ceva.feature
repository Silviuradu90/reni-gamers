Feature: Login


  #    Background:
#    Given I go to "http://localhost:3000/"
#  @Outline
#  Scenario Outline:
#    Given I go to "http://localhost:3000/"
#    When I click "<USER>" from homepage
#    Then I click "<PASSWORD>" from homepage


  @Data
  Scenario: Data Table
    Given I go to "http://localhost:3000/"
    And I write the following
      | NAME     | Sergiu |
      | PASSWORD | 123456 |
    Then I verify the login button color is teal
    And I click Login Button
