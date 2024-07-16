@contactPoolAndSpa
Feature: Pool And Spa Form Contact Page
  Background: : go to the Pool And Spa Form Contact Page
    Given go to the "rheem" Page
    And  click on the Contact button
    And  click on the Pool And Spa button


  Scenario Outline: Checking valid Submission Validation with Pool And Spa

    And type the Full Name "<full Name>" on First
    And type the Address LineFirst "<address Line1>"  on Address first Line box
    And type the Address Address secondLine "<address Line2>" on Address second line box
    And type the city "<city>" city box
    And User select the "<states Province>"  on States Provinces Type dropdown
    And User selects "<country>" from the Country dropdown
    And type the postalCode "<zipcode>"  on postalCode box
    And type the Company Name "<company Name>"  on Company box
    And type the Phone "<cell>"  on Phone box
    And type Email "<email>" on Email box
    And User selects "<subtopic>"  from the Select Subtopic dropdown
    And type the Model Number "<model Number>"  on Model Number box
    And type the Serial Number"<serial Number>"  on Serial Number box
    And type the Plumber Name "<plumber Name>"  on Plumber Name box
    And type the Plumber phone "<plumber Phone>"  on Plumber phone box
    And type the Comments "<comments>"  on Comments box
    Then Click the Submit Button Pool And Spa


    Examples:
      | full Name | address Line1                    | address Line2          | city         | states Province | country     | zipcode | company Name | cell         | email                     | subtopic              | model Number | serial Number | plumber Name         | plumber Phone | comments     |
      | Aydin     | Orion Innovation Turkey Istanbul | No: 12345 34000 Pendik | Autaugaville | Alaska (AK)     | Mexico      | 12345   | Company A    | 987-654-3210 | zeynep.ozcan@orioninc.com | Registering a Product | XYZ789       | ABC123        | Commercial           | 01-01-2023    | 666-999-4444 |
  #   | John      | Example Street                   | Apt 42                 | Chico        | Alaska(AK)      | Mexico      | 90001   | Company b    | 555-987-6543 | john.doe@example.com      | Part Information      | LMN012       | DEF456        | Type B               | 2023-02-15    |              |
  #   |           | Company Blvd                     | Suite 123              | Mannboro     | Maine (ME)      | Cambodia    | 0000    | Company c    | 512-333-4444 | jane.smith@company.com    | Pool & Spa Sales      | ABC567       | GHI789        | Residential Electric | 2023-03-20    |              |
  #   | Barıs     | Orion Innovation Turkey Istanbul | No: 12345 34000 Pendik | Morrill      | Maryland (MD)   | Romania     |         | 10001        |              | barıs.askın@orioninc.com  | Registering a Product |              | DGF567        |                      |               | 555-089-543  |
  #   | Mary      | Address Line1                    |                        | Chico        | Nevada (NV)     | South Sudan | 33101   |              | 718-111-2222 | mary.johnson@example.com  |                       | ECE234       |               | Residential Gas      | 04-11-2023    |              |
  #   | Bob       | Business Street                  | Suite 567              | Miami        | New York (NY)   |             |         |              |              | bob.brown@company.com     |                       |              |               | Type A               | 2023-05-30    |              |
  #   |           |                                  |                        |              |                 |             |         |              |              |                           |                       |              |               |                      |               |              |






