Feature: Products

  @MRA-600
  Scenario: Product Data Table
    Given I go to "http://localhost:3000/products"
    Then  I check the table is preset
    And  I check "food" column is present
    And  I check "Calories" column is present
    And  I check "Protein" column is present
    And  I check "Carbs" column is present
    And  I check "Fat" column is present

  @MRA-601
  Scenario: Product Data Table
    Given I go to "http://localhost:3000/products"
    Then I click on the Blackberries arrow and the menu expands
    And the following text is present "History"
    And the following text is present "Date"
    And the following text is present "Customer"
    And the following text is present "Amount"
    And the following text is present "Total price (Eur)"

  @MRA-603
  Scenario: Product Data Table
    Given I go to "http://localhost:3000/products"
    And the menu expands for Blackberries