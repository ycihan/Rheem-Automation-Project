Feature: Navigate to the Residential Resource Center Page on the Rheem Website

  Background: Entering Residential Resource Center Page
    Given Go to "rheem" website
    When click on the products button
    And click on the Resource Center button

  Scenario: Testing that the correct page is opened
    Then should be redirected to the resource center page

  Scenario: Testing Homeowner Resource Center header
    Then Homeowner Resource Center header is displayed on the page

  Scenario: Broken Image Test
    Then Check all images on the page are valid

  Scenario Outline: Testing that Quick Links' hypertexts lead to correct pages
    When  click on "<hyperTexts>"
    Then  should be redirected to the "<Page>"

    Examples:
      | hyperTexts                         | Page                                   |
      | Heating & Cooling                  | heating & cooling page                 |
      | Water Heating                      | water heating page                     |
      | Residential KwikComfort® Financing | residential KwikComfort page           |
      | Rebate Center                      | rebate center page                     |
      | Water Heating Technical Bulletins  | water heating technical bulletins page |

  Scenario Outline: Testing that Warranty Information' hypertexts lead to correct pages
    When I click on "<hyperTexts>"
    Then I should be redirected to the "<Page>"

    Examples:
      | hyperTexts                         | Page                                    |
      | Heating & Cooling Products         | Heating & Cooling Products Page         |
      | Water Heating Products             | Water Heating Products Page             |
      | Protection Plus® Extended Warranty | Protection Plus® Extended Warranty Page |

  Scenario Outline: Testing that Heating & Cooling' hypertexts lead to correct pages
    When  click on "<hyperTexts>"
    Then  should be redirected to the "<Page>"

    Examples:
      | hyperTexts                      | Page                             |
      | View Heating & Cooling Products | Heating & Cooling Products Page  |
      | Replacement Parts               | Replacement Parts Page           |
      | Air Filters                     | Air Filters Page                 |
      | How Old Is My AC? Tool          | How Old Is My AC? Tool Page      |
      | How Old Is My Furnace? Tool     | How Old Is My Furnace? Tool Page |


  Scenario Outline: Testing that Water Heating' hypertexts lead to correct pages
    When  click on "<hyperTexts>"
    Then  should be redirected to the "<Page>"

    Examples:
      | hyperTexts                       | Page                                  |
      | View Tank-Type Water Heaters     | View Tank-Type Water Heaters Page     |
      | Replacement Parts                | Replacement Parts Page                |
      | Water Heater Sizing              | Water Heater Sizing Page              |
      | View Tankless Water Heaters      | View Tankless Water Heaters Page      |
      | Tankless Support                 | Tankless Support Page                 |
      | View Solar Water Heaters         | View Solar Water Heaters Page         |
      | How Old Is My Water Heater? Tool | How Old Is My Water Heater? Tool Page |

  Scenario: Testing Rheem Product Education header and text
    Then Header and text will be true and visible

  Scenario: Testing Find Saving button
    When click on Find Savings button
    Then should be directed to the rebate page

  Scenario: Testing Get Answer button
    When click on Get Answers button
    Then should be directed to the FAQ page

  Scenario: Testing Contact Us button
    When click on Contact Us button
    Then should be directed to the contact rheem page



















