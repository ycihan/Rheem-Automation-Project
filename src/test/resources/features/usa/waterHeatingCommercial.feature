Feature: Navigate to the Water Heating Commercial Page on the Rheem Website

  Background: Go to the Water Heating Commercial Page
    Given Go to the "rheem"
    When  click on the products button home page
    And   click on the commercial button
    Then  click the water heating button

  Scenario:Verify the title of the Water Heating Commercial page
    Then check title the Water Heating page

  Scenario:Verify the link for commercial tankless water heaters written in red in the Rheem Commercial Water heaters text
    Then check the visibility of the connection and that it goes to the correct address

  Scenario: check the left panel products name Water Heating Commercial page
    And click the more button on left side  Water Heating page
    Then check whether the names of all products are correct Water Heating

  Scenario:Verify the ribbon headlers  Water Heating Commercial page
    Then ribbons is displayed on the left top of the image and check the texts all headers Water Heating Commercial page

  Scenario:Verify images link and image size on the Water Heating Commercial page
    Then All images links are controlled with size Water Heating Commercial page




