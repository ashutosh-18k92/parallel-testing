@parallelTest
Feature: Test to demonstrate that parallel execution should not use any shared vairable
  Tests when run in parallel should go with their own variables otherwise running
  tests with shared vairable may inhibit the state of other tests.

  Scenario Outline: To test GlobalDAO with various initialization
    Given I initialize GlobalDAO with <value>
    When I increment the GlobalDao by 1
    Then I should get <result>
    Examples:
      | value | result |
      | 2     | 3      |
      | 3     | 4      |
      | 4     | 5      |
      | 6     | 7      |
      | 8     | 9      |
  Scenario Outline: To test GlobalDAO with various initialization
    Given I initialize GlobalDAO with <value>
    When I increment the GlobalDao by 1
    Then I should get <result>
    Examples:
      | value | result |
      | 2     | 3      |
      | 3     | 4      |
      | 4     | 5      |
      | 6     | 7      |
      | 8     | 9      |

