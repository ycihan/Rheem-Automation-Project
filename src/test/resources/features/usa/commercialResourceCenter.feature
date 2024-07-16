Feature:Commercial Resource Center Page

  Background: Entering Commercial Resource Center Page
    Given Go to "rheem" site
    When click on the products button
    And click  on the commercial
    And click on the Resource Center

  Scenario: Testing that the correct page is opened
    Then  ought to be sent to the page of the resource center.

  Scenario: Testing Commercial Resource Center header
    Then Commercial Resource Center header is displayed on the page

  Scenario: Broken Image Testing
    Then Verify the validity of each image on the website.

    #stale element not found, please investigate the problem
#  Scenario: Testing that Revit Files & Install Diagrams' links
#    When  click on the link
#    Then  sshould be redirected to the link

      #stale element not found, please investigate the problem
#  Scenario: Testing that Industries' links
#    When  click  link
#    Then  should be redirected to the link







