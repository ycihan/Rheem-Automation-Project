Feature: Featured Innovations Commercial Page Test

  Background: Go to the Commercial Featured Innovations Page
    Given go to "rheem" site
    And click on the products
    And click on the Commercial
    When click on the featured innovations


  Scenario:Verify the title of the commercial featured innovations page
    Then check title the page

  Scenario:Verify the ribbon headlers commercial featured innovations page
    Then ribbons is displayed on the left top of the image and check  the texts all headers

  Scenario:Verify images link and image size on the commercial featured innovations page
    Then All images links are controlled with size


  Scenario:Commercial featured innovations verify all the texts on the page and the titles of the texts
    And verify the titles of the texts
    Then verify the texts contains ® or ™ or Rheem






