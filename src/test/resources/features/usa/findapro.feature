Feature: Testing the Find a pro page

  Background: go to the find a pro page
    Given go to the "rheem" page
    Then Click the find a pro button

  @demo
  Scenario Outline: water and heating
    When click the water and heating button
    And click the submit button
    And confirm the right page
    Then write the <"zip"> for water
    Examples:
      | "zip"     |
      | 30303     |
      | 123123123 |
      | 1234      |
      | 88888     |

  Scenario Outline: heating and cooling
    When click the heating and cooling
    And click the submit button
    And confirm the right page
    Then write the <"zip"> for heating
    Examples:
      | "zip" |
      | 30303 |
@baris
  Scenario Outline: pool and spa
    When click the pool and spa button
    And click the submit button
    And confirm the right page
    Then write the <"zip"> for pool
    Examples:
      | "zip" |
      | 30303 |


  Scenario Outline: show me all contractor
    When click the show me all contractor
    And click the submit button
    And confirm the right page
    Then write the <"zip"> for all
    Examples:
      | "zip" |
      | 30303 |
