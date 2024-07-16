Feature: Contact page at surecomfort USA

  Scenario Outline: testing with the all parameters
    Given go to the sure comfort contact page
    When type the name on "<name>" text box
    And type the email on "<email>" email box
    And type the address on "<address>" text box
    And type the city on "<city>" text box
    And select the states and provinces from "<statesandprovinces>" dropdown
    And type the zipcode on "<zipcode>" text box
    And type the phone on "<phone>" phone box
    And select the topic from "<chooseatopic>" dropdown
    And type message on "<message>" message area
    Then click the submit button and verify response output text
    Examples:
      | name  | email       | address | city   | statesandprovinces | zipcode | phone      | chooseatopic       | message  |
      | asd   | asd@asd.com | asd     | asd    | Alabama (AL)       | 12345   | 1234567890 | Find a Distributor | testtest |
      | -*.as | asd@asd.com | asd     | 123asd | Alabama (AL)       | 1a2345  | asdasd     | Find a Distributor | testtest |
      | asd   | asd@asd.cm  | asd     | asd    | Alabama (AL)       | asdfg   | 1234       | Find a Distributor | testtest |
      | asd   | asd@asd.com | asd     |        | Alabama (AL)       | asdfg   | 1234       | Find a Distributor | testtest |
      | asd   | asd@asd.com |         | asd    | Alabama (AL)       | 12345   |            | Find a Distributor | testtest |
      |       | asd@asd.com | asd     | asd    | Alabama (AL)       | 12345   |            | Find a Distributor | testtest |


  Scenario Outline: Validation of Contact form with Document types
    Given go to the sure comfort contact page
    When type the name on "<name>" text box
    And type the email on "<email>" email box
    And type the address on "<address>" text box
    And type the city on "<city>" text box
    And select the states and provinces from "<statesandprovinces>" dropdown
    And type the zipcode on "<zipcode>" text box
    And type the phone on "<phone>" phone box
    And select the topic from "<chooseatopic>" dropdown
    And type the contractorCompanyName on "<contractorCompanyName>" text box
    And type the contractorName on "<contractorName>" text box
    And type the contractorAddressLine on "<contractorAddressLine>" text box
    And type the contractorCity on "<contractorCity>" text box
    And select the contractorStateProvince from "<contractorStateProvince>" dropdown
    And type the contractorZipPostalCode on "<contractorZipPostalCode>" text box
    And type the contractorEmail on "<contractorEmail>" email box
    And type the contractorPhone on "<contractorPhone>" phone box
    And type message on "<message>" message area
    And type the model number on "<modelnumber>" text box
    And type the serial number on "<serialnumber>" text box
    And upload the copy of invoice file with "<copyofinvoicefile>"
   #And upload the closing statement file with "<closingstatement>"
   #And upload the email history file with "<emailhistory>"
   #And upload the installation photo one file with "<installationphoto1>"
   #And upload the installation photo two file with "<installationphoto2>"
   #And upload the installation photo three file with "<installationphoto3>"
   #And upload the other documents file with "<otherdocuments>"
    Then click the submit button and verify response output text
    Examples:
      | name | email       | address | city | statesandprovinces | zipcode | phone    | chooseatopic               | contractorCompanyName | contractorName | contractorAddressLine | contractorCity | contractorStateProvince | contractorZipPostalCode | contractorEmail | contractorPhone | message         | modelnumber | serialnumber | copyofinvoicefile | closingstatement | emailhistory | installationphoto1 | installationphoto2 | installationphoto3 | otherdocuments |
      | asdf | asd@asd.com | asdf    | asdf | Alabama (AL)       | 12345   | 123456   | Warranty Registration Help | asdf                  | asdf           | asdf                  | asdf           | Arizona (AZ)            | 12345                   | asdf@asdf.com   | 1234567890      | text test dummy |             | asdfgh       | C:\Users\barisa\Downloads\Free_Test_Data_1MB_JPG.jpg   |                  |              |                    |                    |                    |                |
      | 123  | asd@asd.com | asdf    | 123  | Alabama (AL)       | 12345   | 12345asd | Warranty Registration Help | asdf                  | asdf           | asdf                  | asdf           | Arizona (AZ)            | 12345                   | asdf@asdf.com   | 1234567890      | text test dummy |             | asdfgh       | C:\Untitled.jpg  |                  |              |                    |                    |                    |                |

