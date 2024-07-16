package rheemProject.stepdefinitions.ruud;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import rheemProject.pages.ruudPages.contactPageRuud;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;

public class contactStepDef {
    contactPageRuud page=new contactPageRuud();
    @Given("go to the ruud contact page")
    public void goToTheRuudContactPage() {Driver.getDriver().get("https://www.ruud.com/contact/");}

    @When("write the name {string}")
    public void writeTheName(String arg0) {
        reusableMethods.controltheName(arg0,"name");
        page.fullName.sendKeys(arg0);
    }

    @And("select the countryy {string}")
    public void selectTheCountryy(String arg0) {
        page.country.click();
        Driver.getDriver().findElement(By.xpath("//*[@value='"+arg0 +"']")).click();
    }

    @And("write the address {string}")
    public void writeTheAddress(String arg0) {page.addresss.sendKeys(arg0);
    }

    @And("write the cityy {string}")
    public void writeTheCityy(String arg0) {
        reusableMethods.controltheName(arg0,"city");
        page.cityy.sendKeys(arg0);
    }

    @And("select the state {string}")
    public void selectTheState(String arg0) {
        page.states.click();
        if(page.statesoptions.getAttribute("value").equals("na"))
        {
            System.out.println("The state drop down is empty");
        }
        else
        {
            Driver.getDriver().findElement(By.xpath("//*[@value='"+arg0 +"']")).click();
        }
    }

    @And("write the zipcode {string}")
    public void writeTheZipcode(String arg0) {
        reusableMethods.controltheZip(arg0,"zip");
        page.zipcode.sendKeys(arg0);
    }

    @And("write the email {string}")
    public void writeTheEmail(String arg0) {
        reusableMethods.controltheMail(arg0,"mail");
        page.emaill.sendKeys(arg0);
    }

    @And("write the phonenumber {string}")
    public void writeThePhonenumber(String arg0) {
        reusableMethods.controlthePhone(arg0,"phone");
        page.phone.sendKeys(arg0);
    }

    @And("select the topic {string}")
    public void selectTheTopic(String arg0) {
        reusableMethods.scroolToElement(page.topic);
        page.topic.click();
        Driver.getDriver().findElement(By.xpath("//*[@value='"+arg0 +"']")).click();
    }

    @And("select the subtopic {string}")
    public void selectTheSubtopic(String arg0) {
        page.subtopic.click();
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]")).click();
    }

    @And("write the modelnumber {string}")
    public void writeTheModelnumber(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("The Model Number is empty but this field is not required.");
        }
        page.modelNumber.sendKeys(arg0);
    }

    @And("write the serial {string}")
    public void writeTheSerial(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("The Serial Number mustn't be empty");
        }
        page.serialNumber.sendKeys(arg0);
    }
    @And("write the serialw {string}")
    public void writeTheSerialw(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("The Serial Number is empty but this field is not required.");
        }
        page.serialNumberW.sendKeys(arg0);
    }

    @And("write the plumbername {string}")
    public void writeThePlumbername(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("The Contractor Name is empty but this field is not required.");
        }
        reusableMethods.scroolToElement(page.phone);
        page.contractorName1.sendKeys(arg0);
    }

    @And("write the plumbernumber {string}")
    public void writeThePlumbernumber(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("The Contractor Number is empty but this field is not required.");
        }
        page.contractorPhone.sendKeys(arg0);
    }

    @And("write the comments {string}")
    public void writeTheComments(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("The Comments mustn't be empty");
        }
        page.comments.sendKeys(arg0);
    }

    @Then("click the submitbutton and observer the warnings if exist")
    public void clickTheSubmitbuttonAndObserverTheWarningsIfExist() {
        reusableMethods.scroolToElement(page.submitButton);
        page.submitButton.click();
        reusableMethods.waitForVisibilityy(By.xpath("//*[@class=\"wpcf7-response-output\"]"), 10);// if (Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Your message was sent successfully. Thanks.')]")).getText().equals("Your message was sent successfully. Thanks."))
        if (page.validationText.getText().equals("Your message was sent successfully. Thanks."))
        {
            System.err.println(page.validationText.getText() + "\nNo error");
        } else if (page.validationText.getText().equals("Validation errors occurred. Please confirm the fields and submit it again.")) {
            System.err.println(page.validationText.getText() + "\nError");
        } else {
            System.err.println(page.validationText.getText() + "\nNot expected result for both scenario");
        }
    }

    @And("write the contractor name {string}")
    public void writeTheContractorName(String arg0) {
        reusableMethods.controltheName(arg0,"Contractor Name");
        page.contractorName2.sendKeys(arg0);
    }

    @And("write the contractor company name {string}")
    public void writeTheContractorCompanyName(String arg0) {
        reusableMethods.controltheName(arg0,"Contractor Company Name");
        page.contractorCompanyName.sendKeys(arg0);
    }

    @And("write the contractor address {string}")
    public void writeTheContractorAddress(String arg0) {
        page.contractorAddressLine.sendKeys(arg0);
    }

    @And("write the contractor city {string}")
    public void writeTheContractorCity(String arg0) {
        reusableMethods.controltheName(arg0,"City");
        page.contractorCity.sendKeys(arg0);
    }

    @And("select the contractor state {string}")
    public void selectTheContractorState(String arg0) {
        reusableMethods.scroolToElement(page.contractorName2);
        page.contractorStates.click();
        Driver.getDriver().findElement(By.xpath("(//*[@value='" + arg0 + "'])[2]")).click();
    }

    @And("write the contractor zip {string}")
    public void writeTheContractorZip(String arg0) {
        reusableMethods.controltheZip(arg0,"Zip code");
        page.contractorZipPostalCode.sendKeys(arg0);
    }

    @And("write the contractor email {string}")
    public void writeTheContractorEmail(String arg0) {
        reusableMethods.controltheMail(arg0,"Mail");
        page.contractorEmail.sendKeys(arg0);
    }

    @And("write the contractor phone {string}")
    public void writeTheContractorPhone(String arg0) {
        reusableMethods.controlthePhonewithlenght(arg0,"Phone");
        page.contractorPhone.sendKeys(arg0);
    }

    @And("upload the copy of invoice file {string}")
    public void uploadTheCopyOfInvoiceFile(String arg0) {
        reusableMethods.scroolToElement(page.copyofinvoice);
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Copy of Invoince file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.copyofinvoice.sendKeys(arg0);
    }

    @And("upload the closing statement file {string}")
    public void uploadTheClosingStatementFile(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Closing Statement file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.closingstatement.sendKeys(arg0);
    }

    @And("upload the email history file {string}")
    public void uploadTheEmailHistoryFile(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Email History file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.emailhistory.sendKeys(arg0);
    }

    @And("upload the photo one file {string}")
    public void uploadThePhotoOneFile(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png")) {
            System.err.println("Installation Photo 1 file must be jpg or png. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.installphoto1.sendKeys(arg0);
    }

    @And("upload the photo two file {string}")
    public void uploadThePhotoTwoFile(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png")) {
            System.err.println("Installation Photo 2 file must be jpg or png. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.installphoto2.sendKeys(arg0);
    }

    @And("upload the photo three file {string}")
    public void uploadThePhotoThreeFile(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png")) {
            System.err.println("Installation Photo 3 file must be jpg or png. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.installphoto3.sendKeys(arg0);
    }

    @And("upload the other documents file {string}")
    public void uploadTheOtherDocumentsFile(String arg0) {
        if (!arg0.contains(".jpg") || !arg0.contains(".png") || !arg0.contains(".doc") || !arg0.contains(".pdf")) {
            System.err.println("Other documents file must be jpg, png, doc or pdf. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.otherdocs.sendKeys(arg0);
    }
}