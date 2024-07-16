package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rheemProject.pages.usPages.featuredInnovationsCommercialPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;

public class featuredInnovationsCommercial_StepDef {
    rheemHomePage homePage = new rheemHomePage();
    featuredInnovationsCommercialPage featuredCommercialPage = new featuredInnovationsCommercialPage();

    @Given("go to {string} site")
    public void goToSite(String site) {
        selectURLandAcceptCookies.goTo(site);
    }

    @And("click on the products")
    public void clickOnTheProducts() throws InterruptedException {
        reusableMethods.clickwhenDisplayed(homePage.productsButton, homePage.heatingandcoolingButton);
    }

    @And("click on the Commercial")
    public void clickOnTheCommercial() {
        homePage.commercialButton.click();
    }

    @When("click on the featured innovations")
    public void clickOnTheFeaturedInnovations() {
        homePage.featuredButton.click();
    }

    @Then("check title the page")
    public void checkTitleThePage() {
        reusableMethods.checkTittle("Innovations for your");
    }

    @Then("ribbons is displayed on the left top of the image and check  the texts all headers")
    public void ribbonsIsDisplayedOnTheLeftTopOfTheImageAndCheckTheTextsAllHeaders() throws InterruptedException {
        List<String> ribbonTexts = new ArrayList<>();
        reusableMethods.createListforExpectedtexts(ribbonTexts);
        for (String a : ribbonTexts
        ) {
            System.out.println(a);

        }
        reusableMethods.checkRibbonHeaders(homePage.ribbonHeaders, ribbonTexts);
    }

    @Then("All images links are controlled with size")
    public void allImagesLinksAreControlledWithSize() throws InterruptedException {
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(homePage.images, reusableMethods.createArrayforImageNamesforfeatured(), mainTabHandle);
    }

    @And("verify the titles of the texts")
    public void verifyTheTitlesOfTheTexts() throws InterruptedException {
        reusableMethods.checkTittles(featuredCommercialPage.titles, reusableMethods.createlistforfeaturedtitles());
    }

    @Then("verify the texts contains ® or ™ or Rheem")
    public void verifyTheTextsContainsOrOrRheem() {
        reusableMethods.checkTexts(featuredCommercialPage.texts);
    }
}
