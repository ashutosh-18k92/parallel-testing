@parallelTest
Feature: To test abuse of static

  Scenario: adding one plus two
    Given I have 1
    When I add 2
    Then I get 3

  Scenario: adding three plus four
    Given I have 3
    When I add 4
    Then I get 7

  Scenario: adding three plus four
    Given I have 5
    When I add 6
    Then I get 11

  Scenario: adding three plus four
    Given I have 13
    When I add 41
    Then I get 54

  Scenario: adding three plus four
    Given I have 23
    When I add 40
    Then I get 63