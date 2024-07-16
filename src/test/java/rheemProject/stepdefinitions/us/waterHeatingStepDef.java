package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rheemProject.pages.usPages.onlineClaimSubmissionFormPage;
import rheemProject.pages.usPages.waterHeatingPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static rheemProject.utilities.Driver.driver;
import static rheemProject.utilities.Driver.getDriver;

public class waterHeatingStepDef {
    waterHeatingPage page = new waterHeatingPage();

    @Given("Go to {string} website")

    public void goToWebsite(String  string) {

        selectURLandAcceptCookies.goTo(string);
       /* switch (string) {
            case "rheemIAT":
                Driver.getDriver().get(configurationReader.getProperty("rheemIAT"));
                break;
            case "rheem":
                Driver.getDriver().get(configurationReader.getProperty("rheem"));
                break;
            case "rheemUAT":
                Driver.getDriver().get(configurationReader.getProperty("rheemUAT"));
                break;
            case "productSizing":
                Driver.getDriver().get(configurationReader.getProperty("productSizing"));
                break;
            case "onlineclaimsubmission":
                Driver.getDriver().get(configurationReader.getProperty("onlineclaimsubmission"));

            default:
                break;
        }*/
    }

    @When("click on the products button")
    public void click_on_the_products_button() throws InterruptedException {


       // page.acceptAll.click();
      //  page.productsBtn.click();
        reusableMethods.clickwhenDisplayed(page.productsBtn, page.waterHeating);

    }

    @When("click on the water heating button")
    public void click_on_the_water_heating_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(page.waterHeating));

        page.waterHeating.click();
    }

    @Then("should be redirected to the water heating page")
    public void should_be_redirected_to_the_water_heating_page() {
        String actualURL = getDriver().getCurrentUrl();
        String expectedURL = "https://www.rheem.com/products/residential/water-heating/";
        assertEquals(actualURL, expectedURL);

    }
/*
2---------------------------------------------------------------------------
 */


    @When("clicked Tankless Water Heaters")
    public void clicked_tankless_water_heaters() {
        page.TanklessWaterHeaters.click();
    }

    @Then("the detail page appears.")
    public void the_detail_page_appears() {
        String actual = page.twhText.getText();
        String expected = "Tankless Water Heaters";
        assertEquals(actual, expected);

    }
 /*
 3------------------------------------------------------------------------------------
*/

    @When("clicked hyperlinked text")
    public void clicked_hyperlinked_text() {
        page.gasTwh.click();
    }
    @Then("should be redirected to the gas water heaters page")
    public void should_be_redirected_to_the_gas_water_heaters_page() {
        String actualUrl = getDriver().getCurrentUrl();
        String expectedUrl = "https://www.rheem.com/products/residential/water-heating/tank/residential_gas/";
        assertEquals(actualUrl, expectedUrl);
    }
/*
4-----------------------------------------------------------------------------------------------------
 */

    @When("water heating menu is visible")
    public void water_heating_menu_is_visible() {
        page.productsBtn.click();
        page.residential.isDisplayed();
    }

    @And("the user clicks on each sub-menu")
    public void the_user_clicks_on_each_sub_menu() {

        WebElement ulElement = driver.findElement(By.id("menu-residential-water-heating"));
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
        System.out.println(liElements);


        for (int i = 0; i < liElements.size(); i++) {

            ulElement = driver.findElement(By.id("menu-residential-water-heating"));
            liElements = ulElement.findElements(By.tagName("li"));
            WebElement liElement = liElements.get(i);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            wait.until(ExpectedConditions.elementToBeClickable(liElement));
            liElement.click();

           // wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete';"));


            wait.until(ExpectedConditions.elementToBeClickable(By.className("products")));

            WebElement productsButton = driver.findElement(By.xpath("//a[@class='products']"));
            productsButton.click();

        }

    }
    @Then("the user verifies that the corresponding sub-menu is clickable")
    public void the_user_verifies_that_the_corresponding_sub_menu_is_clickable() {
        String expectedURL = "https://www.rheem.com/products/residential/water-heating/accessories/";
        String actualURL = driver.getCurrentUrl();
        assertEquals(actualURL,expectedURL);

    }


    @Then("Rheem Residential Water Heaters header is displayed on the page")
    public void rheemResidentialWaterHeatersHeaderIsDisplayedOnThePage() {
        reusableMethods.textAssert(page.resWaterHeatersHeader,"Rheem Residential Water Heaters");
    }

    @Then("Rheem Residential Water Heaters text is displayed on the page")
    public void rheemResidentialWaterHeatersTextIsDisplayedOnThePage() {
        reusableMethods.textAssert(page.resWaterHeatersText,"With a full line of Rheem® tank and tankless water heaters to choose from, there’s sure to be one that’s the right fit for your family. " +
                "Whether you need high water delivery or low energy costs—or both, we have your next water heater. Be sure to browse our impressive line of sustainable, high efficiency tankless water heaters, gas " +
                "tank water heaters, and the most efficient water heater on earth – the Rheem hybrid electric water heater.");
    }

    @When("clicked more button")
    public void clickedMoreButton() {
        page.moreButton.click();
    }

    @Then("verify text in the Explore Products panel'S products")
    public void verifyTextInTheExploreProductsPanelSProducts() {
        List<String> testExplorelist = new ArrayList<>();
        reusableMethods.waterHeatingProducts(testExplorelist);
        reusableMethods.checkStringExistonList(page.explorelist,testExplorelist);

    }
}



