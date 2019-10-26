@parallelTest
Feature: To test whether call made in runnable is thread-safe since it requires static variables.

  Scenario Outline: Test whether Runnable implementation of wait is thread-safe
    Given I have a response variable
    When I create a Runnable to set <res>
    Then I should get same <resp>
    Examples:
      |res|resp|
      |1  |1   |
      |3  |3   |
      |2  |2   |
      |5  |5   |
      |6  |6   |
