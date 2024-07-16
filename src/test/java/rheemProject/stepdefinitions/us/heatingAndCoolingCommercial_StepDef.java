package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import rheemProject.pages.usPages.heatingAndCoolingCommercialPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;

public class heatingAndCoolingCommercial_StepDef {

    heatingAndCoolingCommercialPage heatingCommercialPage=new heatingAndCoolingCommercialPage();
    rheemHomePage homePage = new rheemHomePage();

    @Given("go to the {string} com")
    public void goToTheCom(String site) {
        selectURLandAcceptCookies.goTo(site);

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
            default:
                break;
        }

        */
    }

    @And("click the products button")
    public void clickTheProductsButton() throws InterruptedException {
        reusableMethods.clickwhenDisplayed(heatingCommercialPage.productsButton,heatingCommercialPage.productsButton);

    }

    @And("click the commercial button")
    public void clickTheCommercialButton() throws InterruptedException {
        reusableMethods.clickwhenDisplayed(heatingCommercialPage.commercialButton,heatingCommercialPage.commercialButton);

    }

    @And("click the heating and cooling button on list")
    public void clickTheHeatingAndCoolingButtonOnList() {
        heatingCommercialPage.heatingCoolingButton.click();

    }

    @Then("check the current url is equals to {string}")
    public void checkTheCurrentUrlIsEqualsTo(String url) {
        reusableMethods.CurrentUrl(Driver.getDriver().getCurrentUrl(),url);
    }

    @And("click the more button on left side")
    public void clickTheMoreButtonOnLeftSide() throws InterruptedException {
        heatingCommercialPage.moreButton.click();


    }

    @And("wait the loading the list")
    public void waitTheLoadingTheList() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Then("check whether the names of all products are correct")
    public void checkWhetherTheNamesOfAllProductsAreCorrect() {
        List<String> test=new ArrayList<>();
        reusableMethods.createListforHeatingandCoolingCommercialProducts(test);
        reusableMethods.checkStringExistonList(heatingCommercialPage.productListHeatingCoolingC, test);
    }

    @Then("check the all ribbons text is correct")
    public void checkTheAllRibbonsTextIsCorrect() throws InterruptedException {
        List<String> test = new ArrayList<>();
        reusableMethods.createListforHeatingandCoolingCommercialRibbons(test);
        reusableMethods.checkRibbonHeaders(heatingCommercialPage.ribbonHeadersH,test);



    }

    @Then("check the all image name are correct and the size is expected")
    public void checkTheAllImageNameAreCorrectAndTheSizeIsExpected() throws InterruptedException {
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(heatingCommercialPage.images,reusableMethods.createArrayforImageNamesHeatingAndCoolingCommercial(),mainTabHandle);

    }

    @Then("check all the texts contains the {string} text")
    public void checkAllTheTextsContainsTheText(String arg0) {


    }

    @Then("check the all header where the product panel")
    public void checkTheAllHeaderWhereTheProductPanel() throws InterruptedException {
        List<String> test = new ArrayList<>();
        reusableMethods.createListforHeatingandCoolingCommercialTextHeaders(test);
        reusableMethods.checkRibbonHeaders(heatingCommercialPage.textHeaders,test);
    }



}