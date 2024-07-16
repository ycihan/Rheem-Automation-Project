Feature: Home Enhancements Intro Page
  Background: : go to the home enhancements intro page
    Given go to the "rheem"
    And  click on the Products menu button
    And  click on the Home Enhancements button

  Scenario:Verify images link and image size on the home enhancements intro page
    Then Verify image link and size

  Scenario: Verify Rheem Home Enhancements header on the home enhancements intro page
    Then Rheem Home Enhancements text is displayed on the page.


  Scenario:Verify Explore Products panel and more button are visible on the home enhancements intro page
    When More button visibility is checked and clicked
    Then Verify text in the Explore Products panel


  Scenario: Verify EcoNet image and ribbon are visible on the home enhancements intro page
    And  EcoNet image is displayed on the on the home enhancements intro page
    Then HOME INTEGRATION ribbon is displayed on the left top of the EcoNet image

  Scenario: Verify texts and learn more button are visible on EcoNet image
    And  HOME INTEGRATION texts are displayed on the right of the EcoNet image
    Then HOME INTEGRATION learn more button displayed on the right of the EcoNet image


  Scenario:Verify Smart Home image and ribbon are visible on the home enhancements intro page
    Then ECONET ribbon is displayed on the left the top of the Smart Home image

  Scenario: Verify texts and learn more button are visible on Smart Home image
    And  ECONET texts are displayed on the of the Smart Home image
    Then ECONET learn more button displayed on the left Smart Home image



  Scenario: Verify texts and learn more button are visible on indoorquality image
    And  RESIDENTIAL AIR texts are displayed on the left indoorquality image
    Then RESIDENTIAL AIR learn more button displayed on the left indoorquality image






