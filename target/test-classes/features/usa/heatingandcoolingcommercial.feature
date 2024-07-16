Feature: Heating and cooling page - Commercial
  Background: go to the heating and cooling commercial page
    Given go to the "rheem" com
    And click the products button
    And click the commercial button
    And click the heating and cooling button on list

  Scenario: check the url
    Then check the current url is equals to "https://www.rheem.com/products/commercial/heating-and-cooling/"

  Scenario: check the left panel products name
    And click the more button on left side
    And wait the loading the list
    Then check whether the names of all products are correct

  Scenario: check all text of ribbons
    Then check the all ribbons text is correct

  Scenario:control the product images and the size
    Then check the all image name are correct and the size is expected

  Scenario: check the text contains the "commercial" on the product label
    Then check all the texts contains the "commercial" text

  Scenario: check the header on the product label
    Then check the all header where the product panel

