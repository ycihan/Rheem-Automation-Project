Feature: Navigate to the Commercial Product Sizing Page on the Rheem Website

  Background: Entering Commercial Product Sizing Page
    Given Go to "rheem" website
    When click on the products button
    And click on  commercial button
    And click on the Product Sizing button

  Scenario: Testing that the correct page is opened
    Then should be redirected to the commercial resource center page

  Scenario: Testing that click
    Then should be clicked


    
  Scenario: Main title test
    Then verify main title is correct

  Scenario: Broken Image Test
    Then Checked all images on the page are valid

  Scenario Outline: Testing that Revit Files & Install Diagrams panel' elements is working
    When  click on the "<Button>" button
    Then  should be redirected to the "<Page>" page

    Examples:
      | Button                         | Page                                |
      | BIM Resources                  | BIM Resources page                  |
      | View All Revit Files           | View All Revit Files page           |
      | Tankless Installation Diagrams | Tankless Installation Diagrams page |
      | Tank Installation Diagrams     | Tank Installation Diagrams page     |

  Scenario Outline: Testing that Get It Sized panel' elements is working
    When  click on the "<button>" buttons
    Then  should be redirected to "<Page>" page

    Examples:
      | button              | Page                                                                                                                |
      | RapidSpec™          | http://www.rapidspec.com/                                                                                           |
      | Get Help from a Pro | https://www.rheem.com/products/commercial/commercial_resource_center/commercial-project-sizing-selection-solutions/ |

  Scenario Outline: Testing that Industriess panel' elements is working
    When  click on the "<Button>" buttons
    Then  should be redirected to the "<Page>" page

    Examples:
      | Button      | Page                                |
      | Hospitality | BIM Resources page                  |
      | Education   | View All Revit Files page           |
      | Healthcare  | Tankless Installation Diagrams page |
      | Restaurants | Tank Installation Diagrams page     |
      | Energy      | Energy Page                         |
      | Retail      | Retail Page                         |

  Scenario Outline: Testing that Roles panel' elements is working
    When  click on the "<Button>" buttons
    Then  should be redirected to the "<Page>" page

    Examples:
      | Button                 | Page                        |
      | Spec Engineers         | Spec Engineers page         |
      | Commercial Contractors | Commercial Contractors page |

       # Steps Undefined, it is not working, please look at it
#  Scenario Outline: Testing that Commercial heating and cooling panel' elements is working
#    When click on commercial heating and cooling button
#    And  Click on the "<Button>" button
#    Then Should be redirected to the "<Page>" page
#
#    Examples: Get It Sized Panel
#      | Button     | Page            |
#      | RapidSpec™ | RapidSpec™ Page |
#
#    Examples: Industries Panel
#      | Button      | Page             |
#      | Hospitality | Hospitality Page |
#      | Education   | Education Page   |
#      | Healthcare  | Healthcare Page  |
#      | Restaurants | Restaurants Page |
#      | Energy      | Energy Page      |
#      | Retail      | Retail Page      |
#
#    Examples: Roles Panel
#      | Button                 | Page                             |
#      | Spec Engineers         | Tools for Spec Engineers page    |
#      | Commercial Contractors | Commercial Contractor Tools page |

    # Steps Undefined, it is not working, please look at it
#  Scenario Outline: Testing drop-down menu
#    When click Product Line Brochure( Commercial Water Heaters) button
#    And description and hypertext should be appear
#    And click on the "<hyperText>"
#    Then should be redirected to the "<Page>" hypertext' page
#    Examples:
#      | hyperText              | Page                              |
#      | tank-type              | Commercial Gas Water Heaters page  |
#      | tankless water heaters | Commercial Gas Water Heaters page |
#      | download brochure      | Rheem-CommercialWaterHeaters.pdf  |

