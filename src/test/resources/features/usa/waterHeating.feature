@rheem
Feature: Navigate to the Water Heating Page on the Rheem Website

Background: Go to the Water Heating Page

  Given Go to "rheem" website
  When click on the products button
  And click on the water heating button

 Scenario: test correct page is opened
    Then should be redirected to the water heating page

 Scenario: Tankless Water Heaters detail viewing

   When clicked Tankless Water Heaters
   Then the detail page appears.

  Scenario: Test hyperlinked text "Gas Water Heaters" is clickable
    When clicked hyperlinked text
    Then should be redirected to the gas water heaters page

  Scenario: Testing the Clickability of Sub-Menus under "Water Heating" Menu

    When water heating menu is visible
    And the user clicks on each sub-menu
    Then the user verifies that the corresponding sub-menu is clickable

  Scenario: Test Rheem Residential Water Heaters header is visible

    Then Rheem Residential Water Heaters header is displayed on the page

  Scenario: Test Rheem Residential Water Heaters text is visible and true

    Then Rheem Residential Water Heaters text is displayed on the page

  Scenario: Test Explore Products panel's products and more button are visible

    When clicked more button
    Then verify text in the Explore Products panel'S products
















