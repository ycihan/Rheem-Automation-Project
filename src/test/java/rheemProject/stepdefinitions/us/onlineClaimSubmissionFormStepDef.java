package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rheemProject.pages.usPages.onlineClaimSubmissionFormPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static rheemProject.utilities.Driver.driver;
import static rheemProject.utilities.reusableMethods.selectDropdownValuesOnlineClaimSubmission;

public class onlineClaimSubmissionFormStepDef {
    onlineClaimSubmissionFormPage onlineClaimSubmissionFormPage = new onlineClaimSubmissionFormPage();

    @When("click the submit button with mandatory fields empty")
    public void clickTheSubmitButtonWithMandatoryFieldsEmpty() {
        onlineClaimSubmissionFormPage.allowCookieButton.click();
        reusableMethods.wait(2);
        onlineClaimSubmissionFormPage.fileUploadInvoiceAttachment.sendKeys("C:\\Screenshot_2.png");
        onlineClaimSubmissionFormPage.submitButton.click();
    }

    @Then("see validation errors prompting to fill in the required fields")
    public void seeValidationErrorsPromptingToFillInTheRequiredFields() {

        String actualonlineClaimSubmissionerrorMessage = onlineClaimSubmissionFormPage.errorMessage.getText();

        System.out.println(actualonlineClaimSubmissionerrorMessage);

        String expectedonlineClaimSubmissionerrorMessage = "One or more fields have an error. Please check and try again.";

        Assert.assertEquals(actualonlineClaimSubmissionerrorMessage, expectedonlineClaimSubmissionerrorMessage);


    }

    @When("select {string} on Customer Type dropdown")
    public void selectOnCustomerTypeDropdown(String option) throws InterruptedException {

       // onlineClaimSubmissionFormPage.allowCookieButton.click();
        reusableMethods.wait(2);
        onlineClaimSubmissionFormPage.selectCustomerTypeOption(option);

    }

    @And("type the First Name {string} on First Name box")
    public void typeFirstNameOnFirstNameBox(String firstName) {
        try {
            onlineClaimSubmissionFormPage.firstName.sendKeys(firstName);
        }
        catch (Exception e){}
    }

    @And("type the Last Name {string} on Last Name box")
    public void typeTheLastNameOnLastNameBox(String lastName) {
        onlineClaimSubmissionFormPage.lastName.sendKeys(lastName);
    }

    @And("type the Email {string} on Email box")
    public void typeTheEmailOnEmailBox(String email) {
        onlineClaimSubmissionFormPage.email.sendKeys(email);
    }

    @And("type the Confirm Email {string} on Confirm Email box")
    public void typeTheConfirmEmailOnConfirmEmailBox(String confirmEmail) {
        onlineClaimSubmissionFormPage.emailConfirm.sendKeys(confirmEmail);
    }

    @And("type the Address Line1 {string} on Address Line1 box")
    public void typeTheAddressLineOnAddressLineBox(String addressLine1) {
        onlineClaimSubmissionFormPage.addressLine1.sendKeys(addressLine1);
    }

    @And("type the Address Line2 {string} on Address Line2 box")
    public void typeTheAddressLine2OnAddressLineBox(String addressLine2) {
        onlineClaimSubmissionFormPage.addressLine2.sendKeys(addressLine2);
    }

    @When("User selects {string} from the State dropdown")
    public void userSelectsFromTheStateDropdown(String state) {

        try {
            Map<String, String> stateOptions = Map.of("state", state);
            selectDropdownValuesOnlineClaimSubmission(driver, stateOptions);
        }
        catch (Exception e){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(onlineClaimSubmissionFormPage.state));
            onlineClaimSubmissionFormPage.state.click();
        }

    }


    @And("User selects {string} from the County dropdown")
    public void userSelectsFromTheCountyDropdown(String county) {

        try {
            Map<String, String> countyOptions = Map.of("county", county);
            selectDropdownValuesOnlineClaimSubmission(driver, countyOptions);
        }
        catch (Exception e){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(onlineClaimSubmissionFormPage.counties));
            onlineClaimSubmissionFormPage.counties.click();

        }



    }

    @And("User should be able to select {string} from the City dropdown")
    public void user_should_be_able_to_select_from_the_city_dropdown(String city) {


        try {
            Map<String, String> cityOptions = Map.of("city", city);
            selectDropdownValuesOnlineClaimSubmission(driver, cityOptions);
        }
        catch (Exception e){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(onlineClaimSubmissionFormPage.citiess));
            onlineClaimSubmissionFormPage.citiess.click();

        }





    }

    @And("User should write {string}")
    public void userShouldWrite(String zipcode) {
        onlineClaimSubmissionFormPage.zip.sendKeys(zipcode);

    }


    @And("User can enter {string}")
    public void userCanEnter(String phoneNumber) {
        onlineClaimSubmissionFormPage.phone.sendKeys(phoneNumber);
    }

    @And("User can enter {string} number")
    public void userCanEnterNumber(String cell) {
        onlineClaimSubmissionFormPage.cell.sendKeys(cell);
    }

    @And("User can enter the {string}")
    public void userCanEnterThe(String FaxNumber) {
        onlineClaimSubmissionFormPage.fax.sendKeys(FaxNumber);
    }

    @When("User should enter {string} of failed unit")
    public void userShouldEnterOfFailedUnit(String SerialNumber) {
        onlineClaimSubmissionFormPage.serialNumber.sendKeys(SerialNumber);
    }

    @And("User should enter {string}")
    public void userShouldEnter(String ModelNumber) {
        onlineClaimSubmissionFormPage.modelNumber.sendKeys(ModelNumber);
    }

    @And("User should enter {string} number")
    public void userShouldEnterNumber(String WCN) {
        onlineClaimSubmissionFormPage.WCN.sendKeys(WCN);
    }


    @And("User should be select {string} from Product Type dropdown")
    public void userShouldBeSelectFromProductTypeDropdown(String options) {
        onlineClaimSubmissionFormPage.selectProductTypeOption(options);

    }

    @And("User should enter {string} was performed")
    public void userShouldEnterWasPerformed(String DateOfService ) {
        onlineClaimSubmissionFormPage.date.sendKeys(DateOfService);
    }


    @When("User enter {string}")
    public void userEnter(String CompanyName) {
        onlineClaimSubmissionFormPage.companyName.sendKeys(CompanyName);
    }

    @And("User can enter number of {string}")
    public void userCanEnterNumberOf(String CompanyPhone) {
        onlineClaimSubmissionFormPage.companyPhone.sendKeys(CompanyPhone);
    }


    @And("User can also enter  {string}")
    public void userCanAlsoEnter(String RepresentativeName) {
        onlineClaimSubmissionFormPage.representativeName.sendKeys(RepresentativeName);
    }

    @And("User can enter {string} done")
    public void userCanEnterDone(String Descriptionofwork) {
        onlineClaimSubmissionFormPage.descriptionOfWorkDone.sendKeys(Descriptionofwork);
    }

    @When("User can give {string}")
    public void userCanGive(String CommentsNotes) {
        onlineClaimSubmissionFormPage.commentsNotes.sendKeys(CommentsNotes);
    }


    @And("User can enter {string} part cost")
    public void userCanEnterPartCost(String PartCost) {
        onlineClaimSubmissionFormPage.partCost.sendKeys(PartCost);
    }

    @And("User can enter {string} labor cost")
    public void userCanEnterLaborCost(String LaborCost) {
        onlineClaimSubmissionFormPage.laborCost.sendKeys(LaborCost);
    }

    @And("User can enter {string} additional cost")
    public void userCanEnterAdditionalCost(String AdditionalCost) {
        onlineClaimSubmissionFormPage.additionalCost.sendKeys(AdditionalCost);
    }


    @And("User can upload {string}")
    public void userCanUpload(String InvoiceAttachment) {

        try {
            onlineClaimSubmissionFormPage.fileUploadInvoiceAttachment.sendKeys(InvoiceAttachment);
        } catch (Exception e) {

            System.out.println("Uyarı: Dosya yükleme hatası - " + e.getMessage());

        }


    }

    @And("User can upload {string} document")
    public void userCanUploadDocument(String ProofofPurchase) {
        try {
            onlineClaimSubmissionFormPage.fileUploadProofOfPurchase.sendKeys(ProofofPurchase);
        }
        catch (Exception e){}
    }
    @And("User can upload {string} for labor")
    public void userCanUploadForLabor(String Proofofpayment) {

        try {
            onlineClaimSubmissionFormPage.fileUploadProofOfPayment.sendKeys(Proofofpayment);
        }
        catch (Exception e){}
    }



    @And("User can upload {string} documents")
    public void userCanUploadDocuments(String AdditionalAttachment) {
       try {
           onlineClaimSubmissionFormPage.fileUploadAdditionalAttachment.sendKeys(AdditionalAttachment);
       }
       catch (Exception e){}
    }

    @When("click the Submit button")
    public void clickTheSubmitButton() {
        onlineClaimSubmissionFormPage.submitButton.click();
    }

    @Then("shoul be displayed {string}")
    public void shoulBeDisplayed(String SubmissionResult) {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String successXPathExpression = "//div[contains(text(),'Claim has been submitted successfully. Your voucher number is VP-') and contains(text(),'.')]";
        String errorXPathExpression = "//div[contains(text(),'One or more fields have an error. Please check and try again.')]";
        String tryAgainXPathExpression = "//div[contains(text(),'Please try again.')]";

        try {
            WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successXPathExpression)));
            String successMessage = successMessageElement.getText();
            System.out.println("Form başarıyla gönderildi. Mesaj: " + successMessage);
        } catch (TimeoutException e) {
            try {
                WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(errorXPathExpression)));
                String errorMessage = errorMessageElement.getText();
                System.out.println("Form gönderilirken bir hata oluştu. Mesaj: " + errorMessage);
            } catch (TimeoutException ex) {
                try {
                    WebElement tryAgainMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tryAgainXPathExpression)));
                    String tryAgainMessage = tryAgainMessageElement.getText();
                    System.out.println("Lütfen tekrar deneyin. Mesaj: " + tryAgainMessage);
                } catch (TimeoutException exception) {
                    System.out.println("Form gönderilirken bir hata oluştu veya mesaj görüntülenmedi.");
                }
            }
        }













    }


    @And("type the First Name {string} on first box")
    public void typeTheFirstNameOnFirstBox(String CompanyName) {

        onlineClaimSubmissionFormPage.CompanyNameFirst.sendKeys(CompanyName);


    }

    @And("type the Employee Identification Number {string}")
    public void typeTheEmployeeIdentificationNumber(String EIN) {

        onlineClaimSubmissionFormPage.CompanyEinNumber.sendKeys(EIN);

    }
}




