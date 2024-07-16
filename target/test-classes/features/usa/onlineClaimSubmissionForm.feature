Feature:  Online Claim Submission Form Page

  Background: go to "online" submission form page
    Given Go to "onlineclaimsubmission" website


  Scenario Outline: Checking Submission Validation with Home Owner

    When select "<customerType>" on Customer Type dropdown
    And type the First Name "<firstName>" on First Name box
    And type the Last Name "<lastName>" on Last Name box
    And type the Email "<email>" on Email box
    And type the Confirm Email "<confirmEmail>" on Confirm Email box
    And type the Address Line1 "<addressLine1>" on Address Line1 box
    And type the Address Line2 "<addressLine2>" on Address Line2 box
    When User selects "<state>" from the State dropdown
    And User selects "<county>" from the County dropdown
    And User should be able to select "<city>" from the City dropdown
    And User should write "<zipcode>"
    And User can enter "<phoneNumber>"
    And User can enter "<cell>" number
    And User can enter the "<Fax Number>"
    When User should enter "<Serial Number>" of failed unit
    And User should enter "<modelNumber>"
    And User should enter "<WCN>" number
    And User should be select "<productType>" from Product Type dropdown
    And User should enter "<dateOfService>" was performed
    When User enter "<companyName>"
    And User can enter number of "<companyPhone>"
    And User can also enter  "<representativeName>"
    And User can enter "<descriptionOfWork>" done
    When User can give "<commentsNotes>"
    And User can enter "<partCost>" part cost
    And User can enter "<laborCost>" labor cost
    And User can enter "<additionalCost>" additional cost
    And User can upload "<invoiceAttachment>"
    And User can upload "<proofOfPurchase>" document
    And User can upload "<proofOfPayment>" for labor
    And User can upload "<additionalAttachment>" documents
    When click the Submit button
    Then shoul be displayed "<submissionResult>"




    Examples:
      | customerType | firstName | lastName | email                     | confirmEmail              | addressLine1                     | addressLine2           | state      | county  | city         | zipcode | phoneNumber  | cell         | Fax Number   | Serial Number | modelNumber | WCN  | productType          | dateOfService | companyName | companyPhone | representativeName | descriptionOfWork | commentsNotes                            | partCost | laborCost | additionalCost | invoiceAttachment | proofOfPurchase | proofOfPayment | additionalAttachment | submissionResult                 |
      | Home Owner   | Zeynep    | OZCAN    | zeynep.ozcan@orioninc.com | zeynep.ozcan@orioninc.com | Orion Innovation Turkey Istanbul | No: 12345 34000 Pendik | Alabama    | AUTAUGA | Autaugaville | 12345   | 123-456-7890 | 987-654-3210 | 111-222-3333 | ABC123        | XYZ789      | 1234 | Commercial           | 01-01-2023    | Company A   | 666-999-4444 | Representative A   | work in progress  | I want to be called from my mobile phone | $5.2     | $20.0     | $7.0           | C:\deneme.png     | C:\deneme.png   | C:\deneme.png  | C:\deneme.png        | All filled                       |
      | Home Owner   | John      | Doe      | john.doe@example.com      | john.doe@example          | Example Street                   | Apt 42                 | California | BUTTE   | Chico        | 90001   | 555-123-4567 | 555-987-6543 |              | DEF456        | LMN012      | 5678 | Type B               | 2023-02-15    |             |              |                    |                   |                                          |          |           |                |                   | C:\deneme.png   |                |                      | mismatched email                 |
      | Home Owner   |           | Smith    | jane.smith@company.com    | jane.smith@company.com    | Company Blvd                     | Suite 123              | Virginia   | AMELIA  | Mannboro     | 73301   | 512-111-2222 | 512-333-4444 | 512-555-6666 | GHI789        | ABC567      | 9012 | Residential Electric | 2023-03-20    |             |              |                    |                   |                                          |          |           |                | C:\deneme.png     |                 |                |                      | Empty Firstname                  |
      | Home Owner   | Barıs     | Askın    | barıs.askın@orioninc.com  | barıs.askın@orioninc.com  | Orion Innovation Turkey Istanbul | No: 12345 34000 Pendik | Maine      | WALDO   | Morrill      | 0000    |              |              |              |               |             |      |                      |               |             | 555-089-543  |                    |                   |                                          |          |           |                |                   |                 |                |                      | Missing Information              |
      | Home Owner   | Mary      | Johnson  | mary.johnson@example.com  | mary.johnson@example.com  | Address Line1                    |                        | California | BUTTE   | Chico        | 10001   |              | 718-111-2222 |              | DGF567765     | ECE234      | 3456 | Residential Gas      | 04-11-2023    |             |              |                    |                   |                                          |          |           |                | C:\deneme.png     |                 |                |                      | Just required information filled |
      | Home Owner   | Bob       | Brown    | bob.brown@company.com     | bob.brown@company.com     | Business Street                  | Suite 567              |            |         |              | 33101   | 305-111-2222 |              | 305-333-4444 |               |             | 7890 | Type A               | 2023-05-30    |             |              |                    |                   |                                          |          |           |                |                   |                 |                |                      | Empty County/City Error                           |


  Scenario Outline: Checking Submission Validation with Service Contractor

    When select "<customerType>" on Customer Type dropdown
    And type the First Name "<companyName>" on first box
    And type the Employee Identification Number "<EIN>"
    And type the Email "<email>" on Email box
    And type the Confirm Email "<confirmEmail>" on Confirm Email box
    And type the Address Line1 "<addressLine1>" on Address Line1 box
    And type the Address Line2 "<addressLine2>" on Address Line2 box
    When User selects "<state>" from the State dropdown
    And User selects "<county>" from the County dropdown
    And User should be able to select "<city>" from the City dropdown
    And User should write "<zipcode>"
    And User can enter "<phoneNumber>"
    And User can enter "<cell>" number
    And User can enter the "<faxNumber>"
    When User should enter "<serialNumber>" of failed unit
    And User should enter "<modelNumber>"
    And User should enter "<WCN>" number
    And User should be select "<productType>" from Product Type dropdown
    And User should enter "<dateOfService>" was performed
    When User enter "<companyName>"
    And User can enter number of "<companyPhone>"
    And User can also enter  "<representativeName>"
    And User can enter "<descriptionOfWork>" done
    When User can give "<commentsNotes>"
    And User can enter "<partCost>" part cost
    And User can enter "<laborCost>" labor cost
    And User can enter "<additionalCost>" additional cost
    And User can upload "<invoiceAttachment>"
    And User can upload "<proofOfPurchase>" document
    And User can upload "<proofOfPayment>" for labor
    And User can upload "<additionalAttachment>" documents
    When click the Submit button
    Then shoul be displayed "<submissionResult>"


    Examples:
      | customerType       | companyName | EIN    | email                     | confirmEmail              | addressLine1                     | addressLine2           | state      | county  | city         | zipcode | phoneNumber  | cell         | faxNumber    | serialNumber | modelNumber | WCN  | productType          | dateOfService | companyName | companyPhone | representativeName | descriptionOfWork | commentsNotes                            | partCost | laborCost | additionalCost | invoiceAttachment | proofOfPurchase | proofOfPayment | additionalAttachment | submissionResult                 |
      | Service Contractor | Company A   | XYZ789 | zeynep.ozcan@orioninc.com | zeynep.ozcan@orioninc.com | Orion Innovation Turkey Istanbul | No: 12345 34000 Pendik | Alabama    | AUTAUGA | Autaugaville | 12345   | 123-456-7890 | 987-654-3210 | 111-222-3333 | ABC123       | XYZ789      | 1234 | Commercial           | 01-01-2023    | Company A   | 666-999-4444 | Representative A   | work in progress  | I want to be called from my mobile phone | $5.2     | $20.0     | $7.0           | C:\deneme.png     | C:\deneme.png   | C:\deneme.png  | C:\deneme.png        | All filled                       |
      | Service Contractor |             | LMN012 | john.doe@example.com      | john.doe@example          | Example Street                   | Apt 42                 | California | BUTTE   | Chico        | 90001   | 555-123-4567 | 555-987-6543 |              | DEF456       | LMN012      | 5678 | Type B               | 2023-02-15    |             |              |                    |                   |                                          |          |           |                |                   | C:\deneme.png   |                |                      | mismatched email                 |
      | Service Contractor | Company B   | ABC567 | jane.smith@company.com    | jane.smith@company.com    | Company Blvd                     | Suite 123              | Virginia   | AMELIA  | Mannboro     | 73301   | 512-111-2222 | 512-333-4444 | 512-555-6666 | GHI789       | ABC567      | 9012 | Residential Electric | 2023-03-20    |             |              |                    |                   |                                          |          |           |                | C:\deneme.png     |                 |                |                      | Empty Firstname                  |
      | Service Contractor |             |        | barıs.askın@orioninc.com  | barıs.askın@orioninc.com  | Orion Innovation Turkey Istanbul | No: 12345 34000 Pendik | Maine      | WALDO   | Morrill      | 0000    |              |              |              |              |             |      |                      |               |             | 555-089-543  |                    |                   |                                          |          |           |                |                   |                 |                |                      | Missing Information              |
      | Service Contractor |             | ECE234 | mary.johnson@example.com  | mary.johnson@example.com  | Address Line1                    |                        | California | BUTTE   | Chico        | 10001   |              | 718-111-2222 |              | DGF567765    | ECE234      | 3456 | Residential Gas      | 04-11-2023    |             |              |                    |                   |                                          |          |           |                | C:\deneme.png     |                 |                |                      | Just required information filled |
      | Service Contractor |             |        | bob.brown@company.com     | bob.brown@company.com     | Business Street                  | Suite 567              | Florida    |         |              | 33101   | 305-111-2222 |              | 305-333-4444 |              |             | 7890 | Type A               | 2023-05-30    |             |              |                    |                   |                                          |          |           |                |                   |                 |                |                      | Empty County/City Error          |









 # One or more fields have an error. Please check and try again.

 # Claim has been submitted successfully



