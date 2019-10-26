@parallelTest
Feature: Test the impact of static classes on concurrent run of cucumber tests

  Scenario Outline: To test GlobalDAOv2 with various initialization
    Given I initialize GlobalDAOv2 with <value>
    When I increment the GlobalDAOv2 by 1
    Then I should get it as <result>
    Examples:
      | value | result |
      | 2     | 3      |
      | 3     | 4      |
      | 4     | 5      |
      | 6     | 7      |
      | 8     | 9      |
  Scenario Outline: To test GlobalDAOv2 with various initialization
    Given I initialize GlobalDAOv2 with <value>
    When I increment the GlobalDAOv2 by 1
    Then I should get it as <result>
    Examples:
      | value | result |
      | 2     | 3      |
      | 3     | 4      |
      | 4     | 5      |
      | 6     | 7      |
      | 8     | 9      |

