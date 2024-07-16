package rheemProject.stepdefinitions.apac.singapore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import rheemProject.pages.apacPages.electricInstantWaterHeatersPageApac;
import rheemProject.pages.apacPages.homePageApac;
import rheemProject.utilities.*;

import java.util.List;

public class singaporeElectricInstantWaterHeaters_StepDef {
    electricInstantWaterHeatersPageApac electricInstantWaterHeaters =new electricInstantWaterHeatersPageApac();
    homePageApac homePageApac=new homePageApac();

    @Given("Go to {string} home page")
    public void goToHomePage(String string) {
        selectURLandAcceptCookies.goTo(string);
    }


    @When("click the products button on the Singapore home page")
    public void clickTheProductsButtonOnTheSingaporeHomePage() throws InterruptedException {

        apacReusableMethods.clickwhenDisplayed(homePageApac.productsButtonApac,homePageApac.electricInstantWaterHeatersButton);

    }


    @And("click on the electric instant water heaters button Singapore home page")
    public void clickOnTheElectricInstantWaterHeatersButtonSingaporeHomePage() {
        homePageApac.electricInstantWaterHeatersButton.click();
    }
    @Then("check the texts of products on the {string} page {string} product {string}")
    public void checkTheTextsOfProductsOnThePageProduct(String siteName, String pageName, String productName) {


        int productOrder=apacJsonLists.selectProductName(siteName,pageName).indexOf(productName);

        List<WebElement> detailText=Driver.getDriver().findElements(By.xpath("//*[@class=\"description\"]/ul/li"));
        String first=detailText.get(productOrder*3).getText();
        String second=detailText.get((productOrder*3)+1).getText();
        String third=detailText.get((productOrder*3)+2).getText();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        apacReusableMethods.clickEditGroupandsigntomyrheem(productOrder);
        apacReusableMethods.checkproductDetails(first,second,third);
    }



    @Then("check if product titles buttons are clickable on the {string} page at {string}")
    public void checkIfProductTitlesButtonsAreClickableOnThePageAt(String pageName, String siteName) throws InterruptedException {
        apacReusableMethods.checkTittles(electricInstantWaterHeaters.productsTextHeaders, apacJsonLists.selectProductName(siteName,pageName));



    }

    @Then("check if product titles buttons are clickable on the {string} page at {string} {string}")
    public void checkIfProductTitlesButtonsAreClickableOnThePageAt(String pageName, String siteName, String productName) throws InterruptedException {


        //apacReusableMethods.scriptforHeaders(electricInstantWaterHeaters.productsTextHeaders);
        //int productOrder=apacJsonLists.selectProductName(siteName,pageName).indexOf(productName);

        //List<WebElement> detailText=Driver.getDriver().findElements(By.xpath("//*[@class=\"description\"]/ul/li"));
        //String first=detailText.get(productOrder*3).getText();
        //String second=detailText.get((productOrder*3)+1).getText();
        //String third=detailText.get((productOrder*3)+2).getText();

        //String actualName=electricInstantWaterHeaters.productsTextHeaders.get(productOrder).getText();
        //System.out.println(apacJsonLists.selectProductName(siteName, pageName).contains(actualName) ? "Product name is correct" : "Product name is not correct");

        //String productImageName=electricInstantWaterHeaters.productsImages.get(productOrder).getAttribute("src");


        //apacReusableMethods.clickEditGroupandsigntomyrheem(productOrder);
        //apacReusableMethods.checkproductDetails(first,second,third);
        //String expectedProductImageName=Driver.getDriver().findElement(By.id("imgPrimaryImage")).getAttribute("src");
        //int startIndex = expectedProductImageName.lastIndexOf("/") + 1;
        //int endIndex = expectedProductImageName.lastIndexOf(".");
        //String uniqueImageName=expectedProductImageName.substring(startIndex,endIndex);
        //System.out.println(productImageName.contains(uniqueImageName) ? "Product image is correct" : "Product image is not correct");

        //apacReusableMethods.checkTittles(electricInstantWaterHeaters.productsTextHeaders, apacJsonLists.selectProductName(siteName,pageName));
        //apacReusableMethods.scriptforHeaders(electricInstantWaterHeaters.productsTextHeaders);



    }



}
