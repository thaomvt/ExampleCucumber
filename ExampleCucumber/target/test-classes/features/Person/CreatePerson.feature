@person
Feature: Person
  I want to create a person

  @person
  Scenario: Create a person
    Given I am on homepage
    When I open the new person page
    And enter the required field organisation unit
    And enter the name field 'thao_test'
    When I Click Save
    Then New person page is displayed
    And Person data is inserted into the database
