package rheemProject.stepdefinitions.weatherkingStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import rheemProject.pages.weatherkingPages.weatherkingContactPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

public class weatherkingContactStepDef {
    weatherkingContactPage page= new weatherkingContactPage();
    @Given("user go to the weatherking home page")
    public void userGoToTheWeatherkingHomePage() {
        selectURLandAcceptCookies.goTo("weatherking");
    }

    @When("user click the contact us button")
    public void userClickTheContactUsButton() {
        page.contactUsButton.click();
    }

    @And("user select the topic {string}")
    public void userSelectTheTopic(String arg0) {
        reusableMethods.scroolToElement(page.name);
        Select topic =new Select(page.topic);
        topic.selectByValue(arg0);
        //reusableMethods.scroolToElement(page.topic);
        //page.topic.click();
        //Driver.getDriver().findElement(By.xpath("//*[@value='"+arg0+"']")).click();
    }

    @And("user write the name {string}")
    public void userWriteTheName(String arg0) {
        reusableMethods.controltheName(arg0,"name");
        page.name.sendKeys(arg0);
    }

    @And("user write the address {string}")
    public void userWriteTheAddress(String arg0) {
        if(arg0.isEmpty()) System.out.println("Address is empty.");
        page.address.sendKeys(arg0);
    }

    @And("user write the city {string}")
    public void userWriteTheCity(String arg0) {
        reusableMethods.controltheName(arg0,"City");
        page.city.sendKeys(arg0);
    }

    @And("user select the state {string}")
    public void userSelectTheState(String arg0) {
        Select state =new Select(page.state);
        state.selectByValue(arg0);
    }

    @And("user select the country {string}")
    public void userSelectTheCountry(String arg0) {
        Select country =new Select(page.country);
        country.selectByValue(arg0);
    }

    @And("user write the zip {string}")
    public void userWriteTheZip(String arg0) {
        reusableMethods.controltheZip(arg0,"Zip Code");
        page.zip.sendKeys(arg0);
    }

    @And("user write the phone {string}")
    public void userWriteThePhone(String arg0) {
        reusableMethods.controlthePhone(arg0,"Phone Number");
        page.phone.sendKeys(arg0);
    }

    @And("user write the email {string}")
    public void userWriteTheEmail(String arg0) {
        reusableMethods.controltheMail(arg0,"Email");
        page.email.sendKeys(arg0);
    }

    @And("user write the model number {string}")
    public void userWriteTheModelNumber(String arg0) {
        if(arg0.isEmpty()) System.err.println("Model number is empty but this field is not required.");
        page.modelNumber.sendKeys(arg0);
    }

    @And("user write the serial number {string}")
    public void userWriteTheSerialNumber(String arg0) {
        if(arg0.isEmpty()) System.err.println("Serial number is empty.");
        page.serialNumber.sendKeys(arg0);
    }

    @And("user write the plumber name {string}")
    public void userWriteThePlumberName(String arg0) {
        reusableMethods.controltheName(arg0,"Plumber Name");
        page.plumberName.sendKeys(arg0);
    }

    @And("user write the plumber phone {string}")
    public void userWriteThePlumberPhone(String arg0) {
        reusableMethods.controlthePhone(arg0,"Phone Number");
        page.plumberPhone.sendKeys(arg0);
    }

    @And("user write the message {string}")
    public void userWriteTheMessage(String arg0) {
        if(arg0.isEmpty()) Assert.fail("Message is empty.");
        page.message.sendKeys(arg0);
    }

    @Then("confirm human and click the send message")
    public void confirmHumanAndClickTheSendMessage() throws InterruptedException {
        reusableMethods.scroolToElement(page.email);
        Thread.sleep(1000);
        page.human.click();
        page.submitButton.click();
        reusableMethods.waitForVisibility(page.outputResponse,5);
        System.out.println(page.outputResponse.getText());

    }

    @And("user write the contractor company name {string}")
    public void userWriteTheContractorCompanyName(String arg0) {
        reusableMethods.controltheName(arg0,"Contractor Company Name");
        page.contractorCompanyName.sendKeys(arg0);
    }

    @And("user write the contractor name {string}")
    public void userWriteTheContractorName(String arg0) {
        reusableMethods.controltheName(arg0,"Contractor Name");
        page.plumberName.sendKeys(arg0);
    }

    @And("user write the contractor address {string}")
    public void userWriteTheContractorAddress(String arg0) {
        if(arg0.isEmpty()) System.out.println("Contractor address is empty.");
        page.contractorAddress.sendKeys(arg0);
    }

    @And("user write the contractor city {string}")
    public void userWriteTheContractorCity(String arg0) {
        reusableMethods.controltheName(arg0,"Contractor City");
        page.contractorCity.sendKeys(arg0);
    }

    @And("user select the contractor state provinces {string}")
    public void userSelectTheContractorStateProvinces(String arg0) {
        Select contractorState=new Select(page.contractorstateprovinces);
        contractorState.selectByValue(arg0);
    }

    @And("user write the contractor zip {string}")
    public void userWriteTheContractorZip(String arg0) {
        reusableMethods.controltheZip(arg0,"Contractor Zip Code");
        page.contractorZip.sendKeys(arg0);
    }

    @And("user write the contractor mail {string}")
    public void userWriteTheContractorMail(String arg0) {
        reusableMethods.controltheMail(arg0,"Contractor Mail");
        page.contractorEmail.sendKeys(arg0);
    }

    @And("user write the contractor phone {string}")
    public void userWriteTheContractorPhone(String arg0) {
        reusableMethods.controlthePhone(arg0,"Contractor Phone Number");
        page.plumberPhone.sendKeys(arg0);
    }

    @And("user upload the copy of invoice {string}")
    public void userUploadTheCopyOfInvoice(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("Copy of Invoice file path is empty.");
        }
        else
        {
            try {
                reusableMethods.fileSizeControl(arg0);
                page.copyofinvoice.sendKeys(arg0);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }
    }

    @And("user upload the closing statement {string}")
    public void userUploadTheClosingStatement(String arg0) {
        if(arg0.isEmpty())
        {
            System.err.println("Closing Statement file path is empty.");
        }
        else
        {
            reusableMethods.fileSizeControl(arg0);
            page.closingstatement.sendKeys(arg0);
        }
    }

    @And("user upload the email history {string}")
    public void userUploadTheEmailHistory(String arg0) {if(arg0.isEmpty())
    {
        System.err.println("Email History file path is empty.");
    }
    else
    {
        reusableMethods.fileSizeControl(arg0);
        page.emailhistory.sendKeys(arg0);
    }
    }

    @And("user upload the photo one {string}")
    public void userUploadThePhotoOne(String arg0) {if(arg0.isEmpty())
    {
        System.err.println("Photo 1 file path is empty.");
    }
    else
    {
        reusableMethods.fileSizeControl(arg0);
        page.photoone.sendKeys(arg0);
    }
    }

    @And("user upload the photo two {string}")
    public void userUploadThePhotoTwo(String arg0) {if(arg0.isEmpty())
    {
        System.err.println("Photo 2 file path is empty.");
    }
    else
    {
        reusableMethods.fileSizeControl(arg0);
        page.phototwo.sendKeys(arg0);
    }
    }

    @And("user upload the photo three {string}")
    public void userUploadThePhotoThree(String arg0) {if(arg0.isEmpty())
    {
        System.err.println("Photo 3 file path is empty.");
    }
    else
    {
        reusableMethods.fileSizeControl(arg0);
        page.photothree.sendKeys(arg0);
    }
    }

    @And("user upload the other documents {string}")
    public void userUploadTheOtherDocuments(String arg0) {if(arg0.isEmpty())
    {
        System.err.println("Other Document file path is empty.");
    }
    else
    {
        reusableMethods.fileSizeControl(arg0);
        page.otherdocuments.sendKeys(arg0);
    }
    }

    @And("user select the warranty registration help at topic")
    public void userSelectTheWarrantyRegistrationHelpAtTopic() {
        Select topic=new Select(page.topic);
        topic.selectByValue("Warranty Registration Help");
    }
}
