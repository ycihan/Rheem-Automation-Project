Feature: Rheem Pool and Spa Products
  As a user, I want to interact with Rheem's Pool and Spa products page to explore,check and test

  Background: the same steps
    Given the user navigates to "rheem"
    When the user clicks on the Products menu
    And the user selects Pool and Spa

  Scenario: Navigating to Rheem Homepage and Viewing Pool and Spa Products
    Then verify that user sees a list of Rheem Pool and Spa products.


  Scenario: Navigating to Rheem Homepage and Clicking on a Pool and Spa Product
    And the user clicks on a specific Pool and Spa product
 #   Then verify that user is taken to the detailed product page for the selected item.



  Scenario: test find a rheem pro
    Then test the zip code on the find a rheem pro textbox

  Scenario: Verify the presence of images on the Pool and Spa page
    Then test all images displayed

