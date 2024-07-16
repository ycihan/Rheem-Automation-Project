Feature: Contact page at weatherKing USA

  Scenario Outline: contact page test without warranty registration help
    Given user go to the weatherking home page
    When user click the contact us button
    And user select the topic "<topic>"
    And user write the name "<name>"
    And user write the address "<address>"
    And user write the city "<city>"
    And user select the state "<state>"
    And user select the country "<country>"
    And user write the zip "<zip>"
    And user write the phone "<phone>"
    And user write the email "<email>"
    And user write the model number "<modelnumber>"
    And user write the serial number "<serialnumber>"
    And user write the plumber name "<plumbername>"
    And user write the plumber phone "<plumberphone>"
    And user write the message "<message>"
    Then confirm human and click the send message
    Examples:
      | topic             | name  | address              | city     | state           | country       | zip   | phone      | email                | modelnumber | serialnumber | plumbername      | plumberphone | message            |
      | Product Question  | asdfg | asdf's address       | new city | Kansas (KS)     | United States | 12345 | 1237894567 | 123asd._@gmail.com   | 123456      | QA1234Z      | Best seller ever | 1231231234   | text text 123 test |
      | Warranty Question |       | asdf's address no 35 | justcity | California (CA) | United States | 30303 | 5555555555 | 123asd._@hotmail.com |             | POITY8795    | dummy name 123   | 999 999 9999 | text text 123 test |

  Scenario Outline: contact page test with warranty registration help
    Given user go to the weatherking home page
    When user click the contact us button
    And user select the warranty registration help at topic
    And user write the name "<name>"
    And user write the address "<address>"
    And user write the city "<city>"
    And user select the state "<state>"
    And user select the country "<country>"
    And user write the zip "<zip>"
    And user write the phone "<phone>"
    And user write the email "<email>"
    And user write the model number "<modelnumber>"
    And user write the serial number "<serialnumber>"
    And user write the contractor name "<contractorname>"
    And user write the contractor phone "<contractorphone>"
    And user write the contractor company name "<contractorcompanyname>"
    And user write the contractor address "<contractoraddress>"
    And user write the contractor city "<contractorcity>"
    And user select the contractor state provinces "<contractorstateprovince>"
    And user write the contractor zip "<contractorzip>"
    And user write the contractor mail "<contractormail>"
    And user upload the copy of invoice "<copyofinvoice>"
    #And user upload the closing statement "<closingstatement>"
    #And user upload the email history "<emailhistory>"
    #And user upload the photo one "<photoone>"
    #And user upload the photo two "<phototwo>"
    #And user upload the photo three "<photothree>"
    #And user upload the other documents "<otherdocuments>"
    And user write the message "<message>"
    Then confirm human and click the send message
    Examples:
      | name | address      | city     | state       | country | zip   | phone      | email          | modelnumber | serialnumber | contractorcompanyname | contractorname  | contractoraddress | contractorcity | contractorstateprovince | contractorzip | contractormail   | contractorphone | copyofinvoice | closingstatement    | emailhistory   | photoone                             | phototwo                             | photothree | otherdocuments | message |
      | sdf  | asdfsadfsdaf | asdfasdf | Alaska (AK) | Canada  | 22222 | 2222222222 | uytr@jhgff.com | asdasd      | asdasd       | idontknow            | heisagoodseller | asdasdasd adress  | Istanbul       | Maine (ME)              | 33333         | asdasd@gmail.com | 55555555555     | C:\Adsız.png  | C:\desktop\asdf.jpg | D:\history.gif | C:\Users\Public\Documents\photo1.png | C:\Users\Public\Documents\photo2.png |            |                |         |

