Feature: Featured Innovations Page Test

  Background: Entering Residential Featured Innovations Page
    Given go to "rheem"
    When click on the products button
    And click on residential
    And click on featured innovations

  Scenario: Correct Page Test
    Then confirm that correct page opened

  Scenario: Broken Image Test
    Then check all images on the page are valid


  Scenario: Product Listing Test
    Then confirm that all of the expected products are listed


  Scenario: Correct Title Test
    Then confirm that motto title is correct