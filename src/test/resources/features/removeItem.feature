Feature: remove an item


  @testing
  Scenario: remove item
    Given user is on homepage
    And add new item
    And remove the item added
    Then verify new item is removed
