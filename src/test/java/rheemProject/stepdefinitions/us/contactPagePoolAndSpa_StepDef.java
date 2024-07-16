package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import rheemProject.pages.usPages.contactPagePoolAndSpaFormPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.Map;

import static rheemProject.utilities.Driver.driver;
import static rheemProject.utilities.reusableMethods.selectDropdownValuesPoolAndSpaContact;
import static rheemProject.utilities.reusableMethods.selectDropdownValuesPoolAndSpaSelectSubtopic;

public class contactPagePoolAndSpa_StepDef {


    contactPagePoolAndSpaFormPage poolAndSpaPage=new contactPagePoolAndSpaFormPage();
    @Given("go to the {string} Page")
    public void goToThePage(String site) {
        selectURLandAcceptCookies.goTo(site);
    }

    @And("click on the Contact button")
    public void clickOnTheContactButton() throws InterruptedException {
        reusableMethods.clickwhenDisplayed(poolAndSpaPage.ContactButton,poolAndSpaPage.ContactButton);

    }

    @And("click on the Pool And Spa button")
    public void clickOnThePoolAndSpaButton() {
        poolAndSpaPage.poolAndSpaButton.click();
    }


    @And("type the Full Name {string} on First")
    public void typeTheFullNameOnFirst(String fullName) {
        poolAndSpaPage.fullName.sendKeys(fullName);
    }

    @And("type the Address LineFirst {string}  on Address first Line box")
    public void typeTheAddressLineFirstOnAddressFirstLineBox(String addressLine1) { poolAndSpaPage.address1.sendKeys(addressLine1);
    }

    @And("type the Address Address secondLine {string} on Address second line box")
    public void typeTheAddressAddressSecondLineOnAddressSecondLineBox(String addressLine2) {
        poolAndSpaPage.address2.sendKeys(addressLine2);
    }


    @And("type the city {string} city box")
    public void typeTheCityCityBox(String city) {
        poolAndSpaPage.city.sendKeys(city);
    }

    @And("User select the {string}  on States Provinces Type dropdown")
    public void userSelectTheOnStatesProvincesTypeDropdown(String statesProvince) {
     //   String stateDropdownLocator = "//span[@class='wpcf7-form-control-wrap stateProvince']//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']";
        Map<String, String> stateOptions = Map.of("stateProvince",statesProvince);
        selectDropdownValuesPoolAndSpaContact(driver, stateOptions);
    }

    @And("User selects {string} from the Country dropdown")
    public void userSelectsFromTheCountryDropdown(String country) {
        //String stateDropdownLocator = "//span[@class='wpcf7-form-control-wrap country']//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']";
        Map<String, String> stateOptions = Map.of("country",country);
        selectDropdownValuesPoolAndSpaContact(driver, stateOptions);
    }


    @And("type the postalCode {string}  on postalCode box")
    public void typeThePostalCodeOnPostalCodeBox(String zipcode) {
        poolAndSpaPage.postalCode.sendKeys(zipcode);
    }

    @And("type the Company Name {string}  on Company box")
    public void typeTheCompanyNameOnCompanyBox(String companyName) {
        poolAndSpaPage.companyName.sendKeys(companyName);
    }

    @And("type the Phone {string}  on Phone box")
    public void typeThePhoneOnPhoneBox(String cell) {
        poolAndSpaPage.phone.sendKeys(cell);
    }
    @And("type Email {string} on Email box")
    public void typeEmailOnEmailBox(String email) {
        poolAndSpaPage.email.sendKeys(email);
    }

    @And("User selects {string}  from the Select Subtopic dropdown")
    public void userSelectsFromTheSelectSubtopicDropdown(String subtopic) throws InterruptedException {

        try {
            reusableMethods.scroolToElement(poolAndSpaPage.tittle);
            // reusableMethods.wait(3);
            // String stateDropdownLocator = "//span[@class='wpcf7-form-control-wrap subtopic']//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control']";
            Map<String, String> stateOptions = Map.of("subtopic", subtopic);
            selectDropdownValuesPoolAndSpaSelectSubtopic(driver, stateOptions);

            //reusableMethods.clickwhenDisplayed(poolAndSpaPage.goToRaypakButton,poolAndSpaPage.goToRaypakButton);
            reusableMethods.wait(4);
            reusableMethods.checkTittle("404 - File or directory not found.");

        } catch (Exception e) {

            System.out.println("ERROR!! " + e.getMessage());

        }

    }

    @And("type the Model Number {string}  on Model Number box")
    public void typeTheModelNumberOnModelNumberBox(String modelNumber) {
        poolAndSpaPage.modelNumber.sendKeys(modelNumber);
    }

    @And("type the Serial Number{string}  on Serial Number box")
    public void typeTheSerialNumberOnSerialNumberBox(String serialNumber) {
        poolAndSpaPage.serialNumber.sendKeys(serialNumber);
    }

    @And("type the Plumber Name {string}  on Plumber Name box")
    public void typeThePlumberNameOnPlumberNameBox(String plumberName) {
        poolAndSpaPage.plumberName.sendKeys(plumberName);

    }

    @And("type the Plumber phone {string}  on Plumber phone box")
    public void typeThePlumberPhoneOnPlumberPhoneBox(String plumberPhone) {
        poolAndSpaPage.plumberPhone.sendKeys(plumberPhone);
    }

    @And("type the Comments {string}  on Comments box")
    public void typeTheCommentsOnCommentsBox(String comments) {
        poolAndSpaPage.comments.sendKeys(comments);
    }

    @Then("Click the Submit Button Pool And Spa")
    public void clickTheSubmitButtonPoolAndSpa() {
        poolAndSpaPage.submitButton.click();
    }



}
