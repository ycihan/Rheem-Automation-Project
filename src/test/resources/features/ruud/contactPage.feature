Feature: Contact page at ruud USA

  Scenario Outline: testing contact form without documents
    Given go to the ruud contact page
    When write the name "<name>"
    And select the countryy "<country>"
    And write the address "<address>"
    And write the cityy "<city>"
    And select the state "<state>"
    And write the zipcode "<zipcode>"
    And write the email "<email>"
    And write the phonenumber "<phonenumber>"
    And select the topic "<topic>"
    And select the subtopic "<subtopic>"
    And write the modelnumber "<modelnumber>"
    And write the serial "<serial>"
    And write the plumbername "<plumbername>"
    And write the plumbernumber "<plumbernumber>"
    And write the comments "<comments>"
    Then click the submitbutton and observer the warnings if exist
    Examples:
      | name   | country       | address          | city  | state        | zipcode | email           | phonenumber | topic           | subtopic         | modelnumber | serial  | plumbername | plumbernumber | comments          |
      | John   | United States | John's address   |       | Alabama (AL) | 12345   | john@test.com   | 12345678    | Home Generators | Consumer Support | 991702      | 33test1 | symbol      | 33test         | test 123 test _-* |
      | George | United States | George's address | Aubum | Alabama (AL) | 12345   | george@test.com | 12345678    | Home Generators | Consumer Support | 991702      | 33test2 | symbol2     | 33test         | test 123 test _-* |

  Scenario Outline: testing warranty registration help
    Given go to the ruud contact page
    And select the topic "<topic>"
    And select the subtopic "Warranty Registration Help"
    When write the name "<name>"
    And select the countryy "<country>"
    And write the address "<address>"
    And write the cityy "<city>"
    And select the state "<state>"
    And write the zipcode "<zipcode>"
    And write the email "<email>"
    And write the phonenumber "<phonenumber>"
    And write the modelnumber "<modelnumber>"
    And write the serialw "<serial>"
    And write the contractor name "<contractorname>"
    And write the contractor company name "<contractorcompanyname>"
    And write the contractor address "<contractoraddress>"
    And write the contractor city "<contractorcity>"
    And select the contractor state "<contractorstate>"
    And write the contractor zip "<contractorzip>"
    And write the contractor email "<contractoremail>"
    And write the contractor phone "<contractorphone>"
    And upload the copy of invoice file "<copyofinvoice>"
    #And upload the closing statement file "<closingstatement>"
    #And upload the email history file "<emailhistory>"
    #And upload the photo one file "<photoone>"
    #And upload the photo two file "<phototwo>"
    #And upload the photo three file "<photothree>"
    #And upload the other documents file "<otherdocuments>"
    And write the comments "<comments>"
    Then click the submitbutton and observer the warnings if exist
    Examples:
      | topic   | name | country       | address | city | state        | zipcode | email         | phonenumber | modelnumber | serial  | contractorname | contractorcompanyname | contractoraddress | contractorcity | contractorstate | contractorzip | contractoremail | contractorphone | copyofinvoice | closingstatement                                | emailhistory | photoone | phototwo     | photothree   | otherdocuments | comments       |
      | General | asdf | United States | asdf    | asdf | Arizona (AZ) | 12345   | asdf@asdf.com | 1234567899  |             | asdf123 | asdf           | aasdf                 | asdfqwer          | zxcasd         | Maine (ME)      | 12345         | asdf@asdf.com   | 12344567890     | C:\image.png | C:\Cucumber_ile_Behavior_Driven_Development.pdf |              |          | C:\Adsız.jpg | C:\Adsız.png |                | text text test |