package rheemProject.stepdefinitions.apac;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import rheemProject.pages.apacPages.homePageApac;
import rheemProject.pages.apacPages.speakToASpecialistPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;


public class speakToSpecialistStepDef {
    speakToASpecialistPage page = new speakToASpecialistPage();
    homePageApac home=new homePageApac();

    @Given("user going to the {string}")
    public void userGoingToThe(String arg0) {
        selectURLandAcceptCookies.goTo(arg0);
    }

    @When("user click the products button")
    public void userClickTheProductsButton() throws InterruptedException {
        reusableMethods.clickwhenDisplayed(home.productsButtonApac,home.electricInstantWaterHeatersButton);
    }

    @And("user click the Centralized Control Panels")
    public void userClickTheCentralizedControlPanels() {
        home.centralizedControlPanelsButton.click();
    }

    @And("user click the learn about this product button")
    public void userClickTheLearnAboutThisProductButton() {
        page.learnaboutthisproductButton.click();
    }

    @And("user click the speak to a specialist button")
    public void userClickTheSpeakToASpecialistButton() {
        page.speakToSpecialistButton.click();
    }

    @And("user type the first name {string}")
    public void userTypeTheFirstName(String arg0) {
        page.firstName.sendKeys(arg0);
        reusableMethods.controltheName(arg0,"Name");
        }

    @And("user type the last name {string}")
    public void userTypeTheLastName(String arg0) {
        page.lastName.sendKeys(arg0);
        reusableMethods.controltheName(arg0,"Lastname");
    }

    @And("user type the company name {string}")
    public void userTypeTheCompanyName(String arg0) {
        page.companyName.sendKeys(arg0);
        if(arg0.isEmpty())Assert.fail("The Company Name field musn't be empty.");
        }

    @And("user type the company mail {string}")
    public void userTypeTheCompanyMail(String arg0) {
        page.companyEmail.sendKeys(arg0);
        reusableMethods.controltheMail(arg0,"Mail");

    }

    @And("user type the job title {string}")
    public void userTypeTheJobTitle(String arg0) {
        page.jobTitle.sendKeys(arg0);
        if(arg0.isEmpty())Assert.fail("The JOb Title field musn't be empty.");

    }

    @And("user type the contact number {string}")
    public void userTypeTheContactNumber(String arg0) {
        page.contactNumber.sendKeys(arg0);
        reusableMethods.controlthePhone(arg0,"Contact Number");
    }

    @And("user slect the product reference {string}")
    public void userSlectTheProductReference(String arg0) {
        Driver.getDriver().findElement(By.xpath("//*[@value='" + arg0 + "']")).click();
    }

    @And("user slect the system required {string}")
    public void userSlectTheSystemRequired(String arg0) {
        Driver.getDriver().findElement(By.xpath("//*[@value='" + arg0 + "']")).click();
    }

    @And("user slect the industry {string}")
    public void userSlectTheIndustry(String arg0) {
        page.industry.click();
        Driver.getDriver().findElement(By.xpath("//span[@class=\"wpcf7-form-control-wrap industry\"]/div/ul/li[@data-value='"+arg0+"']")).click();
    }

    @And("user slect the project focus {string}")
    public void userSlectTheProjectFocus(String arg0) {
        page.projectFocus.click();
        Driver.getDriver().findElement(By.xpath("//span[@class=\"wpcf7-form-control-wrap project-focus\"]/div/ul/li[@data-value='"+arg0+"']")).click();
    }

    @And("user type the description {string}")
    public void userTypeTheDescription(String arg0) {
        page.description.sendKeys(arg0);
        if(arg0.isEmpty())Assert.fail("The Project Description field musn't be empty.");
    }

    @Then("user click the submit button")
    public void userClickTheSubmitButton() {
        page.submitButtonSpeak.click();
        reusableMethods.waitForVisibility(page.outputResponse,5);// this code need for if form's fields are correct the page response time is about 5 sec.
        if(page.outputResponse.equals("One or more fields have an error. Please check and try again."))
        {
            Assert.fail("One or more fields have an error. Please check and try again.");
        }
        else if (page.outputResponse.equals("There was an error trying to send your message. Please try again later."))
        {
            Assert.fail("There was an error trying to send your message. Please try again later.");
        }

    }
}
