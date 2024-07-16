Feature: Apac Contact Page

  Scenario Outline: submit form without file upload
    When go to the contact page at "singapore"
    And write your fullname"<fullname>"
    And write your address"<address>"
    And write your city"<city>"
    And select country "Singapore"
    And enter the zip code"<zip>"
    And enter your phone number"<phone>"
    And write your email"<email>"
    And select topic "<topic>"
    And write comment "<comment>"
    Then click submit button and confirm no error message shown

    Examples:
      | fullname         | address   | zip   | phone      | email                      | city     | topic   | comment  |
      | Yigit Efe Yilmaz | adress123 | 59740 | 1234567890 | yigit.yilmaz@orionincc.com | Tekirdag | General | asdfg123 |
      | Yigit Efe Yilmaz | adress123 | 34abc | abcdfg     | yigit.yilmaz@orionincc.com | Tekirdag | General | asdfg123 |
      | Yigit Efe Yilmaz | adress123 |       |            | yigit.yilmaz@orionincc.com | Tekirdag | General | asdfg123 |

  Scenario Outline: submit form with file upload
    When go to the contact page at "singapore"
    And write your fullname"<fullname>"
    And write your address"<address>"
    And write your city"<city>"
    And select country "Singapore"
    And enter the zip code"<zip>"
    And enter your phone number"<phone>"
    And write your email"<email>"
    And select topic "<topic>"
    And write comment "<comment>"
    And upload the upload file with "<fileUpload>"
    Then click submit button and confirm no error message shown

    Examples:
      | fullname         | address   | zip   | phone      | email                      | city     | topic   | comment  | fileUpload |
      | Yigit Efe Yilmaz | adress123 | 59740 | 1234567890 | yigit.yilmaz@orionincc.com | Tekirdag | General | asdfg123 | C:\Users\barisa\Downloads\Free_Test_Data_1MB_JPG.jpg          |
      | Yigit Efe Yilmaz | adress123 | 34abc | abcdfg     | yigit.yilmaz@orionincc.com | Tekirdag | General | asdfg123 | C:\Users\barisa\Downloads\Free_Test_Data_1MB_JPG.jpg          |
      | Yigit Efe Yilmaz | adress123 |       |            | yigit.yilmaz@orionincc.com | Tekirdag | General | asdfg123 | C:\Users\barisa\Downloads\Free_Test_Data_1MB_JPG.jpg          |



