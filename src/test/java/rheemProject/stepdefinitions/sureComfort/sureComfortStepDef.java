package rheemProject.stepdefinitions.sureComfort;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import rheemProject.pages.sureComfortPages.sureComfortPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;

public class sureComfortStepDef {

    sureComfortPage page = new sureComfortPage();

    @Given("go to the sure comfort contact page")
    public void goToTheSureComfortContactPage() {
        Driver.getDriver().get("https://www.surecomfort.com/contact/");
    }

    @When("type the name on {string} text box")
    public void typeTheNameOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The name field musn't be empty.");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a)) {
                    System.err.println("The name must be alphabetic.");
                    break;
                }
            }
        }
        page.name.sendKeys(arg0);
    }

    @And("type the email on {string} email box")
    public void typeTheEmailOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The phone field musn't be empty.");
        } else {
            if (!arg0.contains("@") && !arg0.contains(".com")) {
                System.err.println("The e-mail address entered is invalid.");
            }
        }
        page.email.sendKeys(arg0);
    }

    @And("type the address on {string} text box")
    public void typeTheAddressOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The address field musn't be empty.");
        }
        page.address.sendKeys(arg0);
    }

    @And("type the city on {string} text box")
    public void typeTheCityOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The city field musn't be empty.");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a)) {
                    System.err.println("The city must be alphabetic.");
                    break;
                }
            }
        }
        page.city.sendKeys(arg0);
    }

    @And("select the states and provinces from {string} dropdown")
    public void selectTheStatesAndProvincesFromDropdown(String arg0) {
        page.statesandprovinces.click();
        Driver.getDriver().findElement(By.xpath("//*[@value='" + arg0 + "']")).click();
    }

    @And("type the zipcode on {string} text box")
    public void typeTheZipcodeOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The zip doe field musn't be empty.");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a) && !Character.isDigit(a)) {
                    System.err.println("The zip code must be alphabetic or numeric.");
                    break;
                }
            }
        }
        page.zipcode.sendKeys(arg0);
    }

    @And("type the phone on {string} phone box")
    public void typeThePhoneOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The phone field musn't be empty.");
        } else {
            for (char a : arg0.toCharArray()) {
                if (Character.isAlphabetic(a)) {
                    System.err.println("The phone number must be numeric.");
                    break;
                }
            }
        }

        page.phone.sendKeys(arg0);
    }

    @And("select the topic from {string} dropdown")
    public void selectTheTopicFromDropdown(String arg0) {
        page.topic.click();
        Driver.getDriver().findElement(By.xpath("//*[@value='" + arg0 + "']")).click();
    }

    @And("type message on {string} message area")
    public void typeMessageOnMessageArea(String arg0) {
        page.message.sendKeys(arg0);
    }

    @Then("click the submit button and verify response output text")
    public void clickTheSubmitButtonAndVerifyResponseOutput() {
        reusableMethods.scroolToElement(page.copyofinvoince);
        page.submitButton.click();
        reusableMethods.waitForVisibilityy(By.xpath("//*[@class=\"wpcf7-response-output\"]"), 10);// if (Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Your message was sent successfully. Thanks.')]")).getText().equals("Your message was sent successfully. Thanks."))
        if (page.validationOutputText.getText().equals("Your message was sent successfully. Thanks."))
        {
            System.err.println(page.validationOutputText.getText() + "\nNo error");
        } else if (page.validationOutputText.getText().equals("Validation errors occurred. Please confirm the fields and submit it again.")) {
            System.err.println(page.validationOutputText.getText() + "\nError");
        } else {
            System.err.println(page.validationOutputText.getText() + "\nNot expected result for both scenario");
        }
    }

    @And("type the contractorCompanyName on {string} text box")
    public void typeTheContractorCompanyNameOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Contractor Company Name musn't be empty");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a)) {
                    System.err.println("The Contractor Company Name must be alphabetic");
                }
            }
        }
        page.contractorCompanyName.sendKeys(arg0);
    }

    @And("type the contractorName on {string} text box")
    public void typeTheContractorNameOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Contractor Name musn't be empty");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a)) {
                    System.err.println("The Company Name must be alphabetic");
                }
            }
        }
        page.contractorName.sendKeys(arg0);
    }

    @And("type the contractorAddressLine on {string} text box")
    public void typeTheContractorAddressLineOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Contractor Address musn't be empty");
        }
        page.contractorAddressLine.sendKeys(arg0);
    }

    @And("type the contractorCity on {string} text box")
    public void typeTheContractorCityOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Contractor City musn't be empty");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a)) {
                    System.err.println("The Company City must be alphabetic");
                }
            }
        }
        page.contractorCity.sendKeys(arg0);
    }

    @And("select the contractorStateProvince from {string} dropdown")
    public void selectTheContractorStateProvinceFromDropdown(String arg0) {
        page.contractorStatesProvinces.click();
        Driver.getDriver().findElement(By.xpath("(//*[@value='" + arg0 + "'])[2]")).click();
    }

    @And("type the contractorZipPostalCode on {string} text box")
    public void typeTheContractorZipPostalCodeOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Contractor Name musn't be empty");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a) && !Character.isDigit(a)) {
                    System.err.println("The Company Zip Code must be alphabetic or numeric");
                }
            }
        }
        page.contractorZipPostalCode.sendKeys(arg0);
    }

    @And("type the contractorEmail on {string} email box")
    public void typeTheContractorEmailOnEmailBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Contractor Mail musn't be empty");
        } else {
            if (!arg0.contains("@") && !arg0.contains(".com")) {
                System.out.println("The Contractor Mail format was not correct.");
            }
        }
        page.contractorEmail.sendKeys(arg0);
    }

    @And("type the contractorPhone on {string} phone box")
    public void typeTheContractorPhoneOnPhoneBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Contractor Phone musn't be empty");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isDigit(a)) {
                    System.err.println("The Company Phone must be numeric");
                }
            }
        }
        page.contractorPhone.sendKeys(arg0);
    }

    @And("type the model number on {string} text box")
    public void typeTheModelNumberOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Model Number is empty but this field is not required.");
        }
        page.modelNumber.sendKeys(arg0);
    }

    @And("type the serial number on {string} text box")
    public void typeTheSerialNumberOnTextBox(String arg0) {
        if (arg0.isEmpty()) {
            System.err.println("The Serial Number musn't be empty");
        }
        page.serialNumber.sendKeys(arg0);
    }

    @And("upload the copy of invoice file with {string}")
    public void uploadTheCopyOfInvoiceFileWith(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Copy of Invoice file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.copyofinvoince.sendKeys(arg0);
    }

    @And("upload the closing statement file with {string}")
    public void uploadTheClosingStatementFileWith(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Closing Statement file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.closingstatement.sendKeys(arg0);
    }

    @And("upload the email history file with {string}")
    public void uploadTheEmailHistoryFileWith(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Email History file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.emailhistory.sendKeys(arg0);
    }

    @And("upload the installation photo one file with {string}")
    public void uploadTheInstallationPhotoOneFileWith(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png")) {
            System.err.println("Installation Photo 1 file must be jpg or png. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.installphoto1.sendKeys(arg0);
    }

    @And("upload the installation photo two file with {string}")
    public void uploadTheInstallationPhotoTwoFileWith(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png")) {
            System.err.println("Installation Photo 2 file must be jpg or png. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.installphoto2.sendKeys(arg0);
    }

    @And("upload the installation photo three file with {string}")
    public void uploadTheInstallationPhotoThreeFileWith(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png")) {
            System.err.println("Installation Photo 3 file must be jpg or png. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.installphoto3.sendKeys(arg0);
    }

    @And("upload the other documents file with {string}")
    public void uploadTheOtherDocumentsFileWith(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Other documents file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.otherdocs.sendKeys(arg0);
    }

}