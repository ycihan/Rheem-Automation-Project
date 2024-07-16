package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.pages.usPages.waterHeatingCommercialPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;

public class waterHeatingCommercial_StepDef {
    waterHeatingCommercialPage waterHeatingPageCommercial= new waterHeatingCommercialPage();
    rheemHomePage homePage = new rheemHomePage();
    @Given("Go to the {string}")
    public void goToThe(String site) {
        selectURLandAcceptCookies.goTo(site);
      /*  switch (string) {
            case "rheemIAT":
                Driver.getDriver().get(configurationReader.getProperty("rheemIAT"));
                break;
            case "rheem":
                Driver.getDriver().get(configurationReader.getProperty("rheem"));
                break;
            case "rheemUAT":
                Driver.getDriver().get(configurationReader.getProperty("rheemUAT"));
                break;
            default:
                break;
        }

       */

    }

    @When("click on the products button home page")
    public void clickOnTheProductsButtonHomePage() throws InterruptedException {
       //waterHeatingPageCommercial.allowCookieButton.click();
        //Thread.sleep(2);
        reusableMethods.clickwhenDisplayed(waterHeatingPageCommercial.productsButton,waterHeatingPageCommercial.productsButton);
    }

   @And("click on the commercial button")
    public void clickOnTheCommercialButton() {waterHeatingPageCommercial.commercialButton.click();}

    @Then("click the water heating button")
    public void clickTheWaterHeatingButton() {waterHeatingPageCommercial.waterHeatingButton.click();

    }

    @Then("check title the Water Heating page")
    public void checkTitleTheWaterHeatingPage() {
        reusableMethods.wait(2);
        reusableMethods.checkTittle("Commercial Water Heaters - Rheem Manufacturing Company - Rheem Manufacturing Company");

    }

    @Then("check the visibility of the connection and that it goes to the correct address")
    public void checkTheVisibilityOfTheConnectionAndThatItGoesToTheCorrectAddress() {
      //  waterHeatingPage.commercialTanklessWaterHeaterslink.click();
       // reusableMethods.checkTittle(Driver.getDriver().getTitle(),"");

    }

    @And("click the more button on left side  Water Heating page")
    public void clickTheMoreButtonOnLeftSideWaterHeatingPage() throws InterruptedException {
        reusableMethods.scroolToElement(waterHeatingPageCommercial.waterHeatingButton);
        waterHeatingPageCommercial.moreButtonWaterHeatingProducts.click();
        reusableMethods.scroolToElement(waterHeatingPageCommercial.lessButton);
      Thread.sleep(3000);

    }

    @Then("check whether the names of all products are correct Water Heating")
    public void checkWhetherTheNamesOfAllProductsAreCorrectWaterHeating() {
        List<String> test=new ArrayList<>();
        reusableMethods.createListforWaterHeatingCommercialProducts(test);
        reusableMethods.checkStringExistonList(waterHeatingPageCommercial.productListWaterHeatingC, test);

    }

    @Then("ribbons is displayed on the left top of the image and check the texts all headers Water Heating Commercial page")
    public void ribbonsIsDisplayedOnTheLeftTopOfTheImageAndCheckTheTextsAllHeadersWaterHeatingCommercialPage() throws InterruptedException {
        List<String> test = new ArrayList<>();
        reusableMethods.createListforWaterHeatingCommercialRibbons(test);
        reusableMethods.checkRibbonHeaders(waterHeatingPageCommercial.ribbonHeadersW,test);
    }

    @Then("All images links are controlled with size Water Heating Commercial page")
    public void allImagesLinksAreControlledWithSizeWaterHeatingCommercialPage() throws InterruptedException {
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(waterHeatingPageCommercial.images,reusableMethods.createArrayforImageNamesWaterHeatingCommercial(),mainTabHandle);

    }
}
