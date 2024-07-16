@demo @apac
Feature: Speak to a specialist pop-up

  Scenario Outline: testing the specialist
    Given user going to the "indonesia"
    When user click the products button
    And user click the Centralized Control Panels
    And user click the learn about this product button
    And user click the speak to a specialist button
    And user type the first name "<firstname>"
    And user type the last name "<lastname>"
    And user type the company name "<companyname>"
    And user type the company mail "<companymail>"
    And user type the job title "<jobtitle>"
    And user type the contact number "<contactnumber>"
    And user slect the product reference "<productreference>"
    And user slect the system required "<systemrequired>"
    And user slect the industry "<industry>"
    And user slect the project focus "<projectfocus>"
    And user type the description "<description>"
    Then user click the submit button
    Examples:
      | firstname | lastname | companyname | companymail    | jobtitle   | contactnumber | productreference | systemrequired | industry    | projectfocus | description         |
      | Ali       | Can      | Page        | page@info.com  | Restaurant | asdfgh        | Premium          | Tanks          | Hospitality | ROI          | test test text test |
      | Veli      | Can      | Paper       | paper@info.com | Cafe       | 123457        | Standard         | Solar          | F&B         | Others       | test test text test |