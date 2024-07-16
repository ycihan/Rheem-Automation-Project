Feature: Heating and cooling page - Residential

  Background: go to the heating and cooling page
    Given go to the rheem
    And click the products
    And click the residential
    And click the heating and cooling button

 Scenario: Text contains the header
   Then check text contains the header

 Scenario: Control the left panel products
   When click the more button
   Then check the all products name correct



 Scenario: control the ribbon headlers
   Then check the actual text equals expected text for all headers



 Scenario: Check the find a pro
    Then write the zip on the textbox

   Scenario: control the image and image link and image size
     Then image links are controlled with size