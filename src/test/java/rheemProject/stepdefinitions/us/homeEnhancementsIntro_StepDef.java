package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rheemProject.pages.usPages.homeEnhancementsIntroPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;

public class homeEnhancementsIntro_StepDef {
    homeEnhancementsIntroPage homeEnhancementsIntroPage=new homeEnhancementsIntroPage();

    @Given("go to the {string}")
    public void goToThe(String site) {
        selectURLandAcceptCookies.goTo(site);
    }

    @And("click on the Products menu button")
    public void clickOnTheProductsMenuButton() throws InterruptedException {
        reusableMethods.clickwhenDisplayed(homeEnhancementsIntroPage.productsButton,homeEnhancementsIntroPage.productsButton);
    }

    @And("click on the Home Enhancements button")
    public void clickOnTheHomeEnhancementsButton() {
        homeEnhancementsIntroPage.homeEnhancementsButton.click();
    }

    @Then("Verify image link and size")
    public void verifyImageLinkAndSize() throws InterruptedException {
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(homeEnhancementsIntroPage.images,reusableMethods.homeEnhancementsIntroPageImageNames(),mainTabHandle);
    }

    @Then("Rheem Home Enhancements text is displayed on the page.")
    public void rheemHomeEnhancementsTextIsDisplayedOnThePage() {
        reusableMethods.textAssert(homeEnhancementsIntroPage.introText ,"Rheem® has a nearly 100-year history of providing comfort essentials. But we also offer a number of solutions that are essential to the way we live today. From whole-home filters to systems for monitoring and controlling your comfort from anywhere—we make modern living more comfortable.");
    }

    @When("More button visibility is checked and clicked")
    public void moreButtonVisibilityIsCheckedAndClicked() throws InterruptedException {
        homeEnhancementsIntroPage.moreButton.click();
        Thread.sleep(3000);
    }



    @Then("Verify text in the Explore Products panel")
    public void verifyTextInTheExploreProductsPanel() {
        List<String> test=new ArrayList<>();
        reusableMethods.homeEnhancementsIntroPageProducts(test);
        reusableMethods.checkStringExistonList(homeEnhancementsIntroPage.productList, test);
    }

    //

    @And("EcoNet image is displayed on the on the home enhancements intro page")
    public void econetImageIsDisplayedOnTheOnTheHomeEnhancementsIntroPage() {
        reusableMethods.waitForVisibility(homeEnhancementsIntroPage.ecoNetImage,3);
        reusableMethods.checkImageSrc(homeEnhancementsIntroPage.ecoNetImage,"https://static.globalimageserver.com/media/uploads/iat/sites/36/2019/07/EcoNet-CTA1_small.png");
    }
    @Then("HOME INTEGRATION ribbon is displayed on the left top of the EcoNet image")
    public void homeINTEGRATIONRibbonIsDisplayedOnTheLeftTopOfTheEcoNetImage() {
      reusableMethods.scroolToElement(homeEnhancementsIntroPage.textTitle);
      reusableMethods.textAssert(homeEnhancementsIntroPage.ribbonHeaderHI,"HOME INTEGRATION");
       // reusableMethods.isTextCorrect(homeEnhancementsIntroPage.ribbonHeaderHI);
    }

    @And("HOME INTEGRATION texts are displayed on the right of the EcoNet image")
    public void homeINTEGRATIONTextsAreDisplayedOnTheRightOfTheEcoNetImage() {
        reusableMethods.textAssert(homeEnhancementsIntroPage.textTittleHI,"Protect Your Home\n" + "With Mobile Leak Alerts");
        reusableMethods.textAssert(homeEnhancementsIntroPage.firstLineHI,"The average water heater flood claim is $4,4401");
        reusableMethods.textAssert(homeEnhancementsIntroPage.secondLineHI,"Rheem smart water heaters with EcoNet® can notify you if there is a leak—helping you avoid water damage");
        reusableMethods.textAssert(homeEnhancementsIntroPage.thirdLineHI,"These products may help you qualify for insurance discounts");



    }
    @Then("HOME INTEGRATION learn more button displayed on the right of the EcoNet image")
    public void homeINTEGRATIONLearnMoreButtonDisplayedOnTheRightOfTheEcoNetImage() throws InterruptedException {
        homeEnhancementsIntroPage.learnMoreButtonHI.click();
        reusableMethods.waitForPageToLoad(2);
        reusableMethods.checkTittle("Upgrade your Smart Home with EcoNet® and Rheem Smart Air and Water Products - Rheem - Rheem Manufacturing Company");
    }

    @Then("ECONET ribbon is displayed on the left the top of the Smart Home image")
    public void econetRibbonIsDisplayedOnTheLeftTheTopOfTheSmartHomeImage() {
        reusableMethods.scroolToElement(homeEnhancementsIntroPage.ribbonHeaderE);
        reusableMethods.textAssert(homeEnhancementsIntroPage.ribbonHeaderE,"ECONET®");

    }

    @And("ECONET texts are displayed on the of the Smart Home image")
    public void econetTextsAreDisplayedOnTheOfTheSmartHomeImage() {

        reusableMethods.textAssert(homeEnhancementsIntroPage.textTitleE,"It Puts the “Smart” in Smart Home");
        reusableMethods.textAssert(homeEnhancementsIntroPage.textE,"The EcoNet® Smart Thermostat is more \u0003than just a new home comfort solution, \u0003it’s a hyper-intelligent device designed \u0003to help you save money");
    }

    @Then("ECONET learn more button displayed on the left Smart Home image")
    public void econetLearnMoreButtonDisplayedOnTheLeftEcoNetImage() throws InterruptedException {
       reusableMethods.scroolToElement(homeEnhancementsIntroPage.ribbonHeaderE);
       reusableMethods.clickwhenDisplayed(homeEnhancementsIntroPage.learnMoreButtonE, homeEnhancementsIntroPage.learnMoreButtonE);
        //homeEnhancementsIntroPage.learnMoreButtonE.click();
        reusableMethods.waitForPageToLoad(2);
        reusableMethods.checkTittle("EcoNet® Smart Thermostat - Rheem Manufacturing Company");
    }


    @Then("RESIDENTIAL AIR ribbon is displayed on the left top of the indoorquality image")
    public void residentialAIRRibbonIsDisplayedOnTheLeftTopOfTheIndoorqualityImage() {
        reusableMethods.scroolToElement(homeEnhancementsIntroPage.ribbonHeaderRA);
        reusableMethods.textAssert(homeEnhancementsIntroPage.ribbonHeaderRA,"RESIDENTIAL AIR");
    }

    @And("RESIDENTIAL AIR texts are displayed on the left indoorquality image")
    public void residentialAIRTextsAreDisplayedOnTheLeftIndoorqualityImage()  {
       reusableMethods.textAssert(homeEnhancementsIntroPage.textRA,"Explore Whole Home Exact \u0003Fit Media Air Cleaners");
        
    }

    @Then("RESIDENTIAL AIR learn more button displayed on the left indoorquality image")
    public void residentialAIRLearnMoreButtonDisplayedOnTheLeftIndoorqualityImage() {
        homeEnhancementsIntroPage.learnMoreButtonRA.click();
        reusableMethods.checkTittle("How to Improve your Indoor Air Quality at your Home or Business - Rheem Manufacturing Company");
    }



}

