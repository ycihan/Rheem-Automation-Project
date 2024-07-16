package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import rheemProject.pages.usPages.findaproPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.List;

public class findaproStepDef {
    rheemHomePage homePage = new rheemHomePage();
    findaproPage proPage = new findaproPage();

    @Given("go to the {string} page")
    public void goToThePage(String arg0) {
        selectURLandAcceptCookies.goTo(arg0);
    }

    @Then("Click the find a pro button")
    public void clickTheFindAProButton() {
        homePage.findaproButton.click();
    }

    @When("click the water and heating button")
    public void clickTheWaterAndHeatingButton() {
        proPage.waterandheatingRadioButton.click();
    }

    @And("click the submit button")
    public void clickTheSubmitButton() throws InterruptedException {
        Thread.sleep(1000);
        proPage.searchButton.click();
    }

    @And("confirm the right page")
    public void confirmTheRightPage() {
        Assert.assertEquals("Find a Pro - Browse and Choose a Trusted, Independent Rheem Professional to Install and Service your Rheem Water Heater and HVAC System - Rheem Manufacturing Company", Driver.getDriver().getTitle());
    }

    @Then("write the {int}")
    public void write_the(Integer int1) throws InterruptedException {
        reusableMethods.scroolToElement(homePage.findaproButton);
        reusableMethods.writezips(proPage.textBoxforzips, int1);
        List<WebElement> plumbers = Driver.getDriver().findElements(By.xpath("//*[@class=\"rh-contractor-list-container\"]/div"));
        Assert.assertFalse("Plumbers doesn't exist", plumbers.isEmpty());
    }

    @When("click the heating and cooling")
    public void clickTheHeatingAndCooling() throws InterruptedException {
        Thread.sleep(1000);
        proPage.heatingandcoolingRadioButton.click();
    }

    @When("click the pool and spa button")
    public void clickThePoolAndSpaButton() throws InterruptedException {
        Thread.sleep(1000);
        proPage.poolandspaRadioButton.click();
    }

    @When("click the show me all contractor")
    public void clickTheShowMeAllContractor() throws InterruptedException {
        Thread.sleep(1000);
        proPage.allRadioButton.click();
    }


    @And("click the authorizedcheckbox")
    public void clickTheAuthorizedcheckbox() {
        reusableMethods.scroolToElement(Driver.getDriver().findElement(By.xpath("(//*[@id=\"products-all\"])[1]")));
        proPage.authorizedCheckBox.click();
    }

    @Then("write the {int} for water")
    public void writeTheForWater(Integer int1) throws InterruptedException {
        reusableMethods.scroolToElement(homePage.findaproButton);
        reusableMethods.writezips(proPage.textBoxforzips, int1);

    }

    @Then("write the {int} for heating")
    public void writeTheForHeating(Integer int1) throws InterruptedException {
        reusableMethods.scroolToElement(homePage.findaproButton);
        reusableMethods.writezips(proPage.textBoxforzips, int1);
       // List<WebElement> plumbers = Driver.getDriver().findElements(By.xpath("//*[@class=\"rh-contractor-list-container\"]/div"));
       // Assert.assertFalse("Plumbers doesn't exist", plumbers.isEmpty());
    }

    @Then("write the {int} for pool")
    public void writeTheForPool(Integer int1) throws InterruptedException {
        reusableMethods.scroolToElement(homePage.findaproButton);
        reusableMethods.writezips(proPage.textBoxforzips, int1);
    //    List<WebElement> plumbers = Driver.getDriver().findElements(By.xpath("//*[@class=\"rh-contractor-list-container\"]/div"));
    //    Assert.assertFalse("Plumbers doesn't exist", plumbers.isEmpty());
    }

    @Then("write the {int} for all")
    public void writeTheForAll(Integer int1) throws InterruptedException {
        reusableMethods.scroolToElement(homePage.findaproButton);
        reusableMethods.writezips(proPage.textBoxforzips, int1);
    //    List<WebElement> plumbers = Driver.getDriver().findElements(By.xpath("//*[@class=\"rh-contractor-list-container\"]/div"));
    //    Assert.assertFalse("Plumbers doesn't exist", plumbers.isEmpty());
    }
}
