@parallelTest
Feature: Checking global variables
  Scenario Outline: s1
    Given I have a set of global variables <name>
    And I initialize them with some value <count>
    When I use their value
    Then The values should be consistent
    Examples:
    |count| name |
    |1    | 'ak'  |
    |2    | 'bk'  |
    |3    | 'ck'  |
    |4    | 'dk'  |
    |5    | 'ek'  |