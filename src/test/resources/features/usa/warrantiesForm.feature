Feature: Navigate to the Warranties Form Page on the Rheem Website

  Background: : Entering Warranties Form Page
    Given Go to "rheem" website
    And click on the Warranties button


  Scenario: Testing that the correct page is opened
    Then should be redirected to  commercial resource center page


  Scenario: Broken Image Test
    Then Check all images on the Warranties Form Page are valid

  Scenario: Main title test
    Then verify the main title is correct


  Scenario: Testing Register your product,your warranty,need warranty service panels' headers test
    Then verify headers are correct

  Scenario: Testing that where's is my serial number hypertext
    When  click on hyperTexts
    Then  should be redirected to the correct pop up

  Scenario Outline: Testing that register your product panel's buttons lead to correct pages
    When click on "<Button>" button

    Examples:
      | Button                     |
      | water heating              |
      | heating and cooling        |
      | pool and spa               |
      | water heating verify       |
      | heating and cooling verify |







