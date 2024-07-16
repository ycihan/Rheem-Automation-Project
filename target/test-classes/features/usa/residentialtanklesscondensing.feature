Feature: Residential Tankless Condensing Page

  Background: go to the tankless condensing page
    Given go to the "rheem" comm
    When click on the products button
    And click on residential
    And click on tankless condensing

  Scenario: Testing that the correct page is opened
  Then Check if the correct page opened

  Scenario: Testing that the title is correct
    Then Check if the title is correct

  Scenario: Testing that the intro text is correct
    Then Check the intro text is correct

  Scenario: Product Listing Test
    Then check that all of the expected products are listed

  Scenario: Broken Image Test
    Then check all images on the page are valid

 # Scenario: Verify that product images are correct
  #  Then check product images are correct