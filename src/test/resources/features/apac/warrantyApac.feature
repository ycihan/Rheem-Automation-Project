Feature: Warranty form APAC

  Scenario Outline: check the warranty form
    When go to the warranty page at "singapore"
    When write the fullname"<fullname>"
    When write the address"<address>"
    When write the addresstwo"<address2>"
    When write the city"<city>"
    When select the country "Singapore"
    When write the zip"<zip>"
    When write the phone"<phone>"
    When write the mail"<mail>"
    And click next button then observe the warnings
    When select the model one "<modelone>"
    And select the model two "<modeltwo>"
    When write the serialnumber"<serialnumber>"
    And click next button two then observe the warnings
    When write the purchase price "<price>"
    When write the purchase date "<date>"
    When write the promo code "<promo>"
    When write the where did u buy "<where>"
    When write the how did u find out "<how>"
    When choose the file "<path>"
    Then click the submit button and observe the warnings
    Examples:
      | fullname | address         | address2          | city         | zip    | phone      | mail           | modelone                                         | modeltwo                                         | serialnumber | price | date     | promo      | where        | how           | path         |
      | halil    | halil's address | halil's address 2 | halil's city | 30303  | 1234567890 | halil@test.com | RH388 Classic Plus Electric Instant Water Heater | Classic Plus Electric Instantaneous Water Heater | 11111        | 10000 | 11302023 | promo-test | i don'd know | Google Search | C:\image.png |
#      |          | halil's address | halil's address 2 | halil's city | 30303  | 1234567890 | halil@test.com | RH388 Classic Plus Electric Instant Water Heater | Classic Plus Electric Instantaneous Water Heater | 11111        | 10000 | 11302023 | promo-test | i don'd know | Google Search | C:\image.png |
#      | halil    | halil's address | halil's address 2 | halil's city | 30303  | 1234567890 | halil@test.com | RH388 Classic Plus Electric Instant Water Heater | Classic Plus Electric Instantaneous Water Heater | 11111        | 10000 | 11302023 | promo-test | i don'd know | Google Search | C:\image.png |
#      | halil    |                 | halil's address 2 | halil's city | 30303  | 1234567890 | halil@test.com | RH388 Classic Plus Electric Instant Water Heater | Classic Plus Electric Instantaneous Water Heater | 11111        | 10000 | 11302023 | promo-test | i don'd know | Google Search | C:\image.png |
#      | halil    | halil's address | halil's address 2 | halil's city | asdfgh | 1234567890 | halil@test.com | RH388 Classic Plus Electric Instant Water Heater | Classic Plus Electric Instantaneous Water Heater | 11111        | 10000 | 11302023 | promo-test | i don'd know | Google Search | C:\image.png |
#      | halil    | halil's address | halil's address 2 | halil's city | 30303  | 1234567890 | halil@test.com | RH388 Classic Plus Electric Instant Water Heater | Classic Plus Electric Instantaneous Water Heater | 11111        | 10000 | 11302023 | promo-test | i don'd know | Google Search | C:\image.png |
