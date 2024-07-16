package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;


public class heating_StepDef {
    rheemHomePage homePage = new rheemHomePage();


    @Given("go to the rheem")
    public void goToTheRheem() {selectURLandAcceptCookies.goTo("rheem");}

    @And("click the products")
    public void clickTheProducts() throws InterruptedException {reusableMethods.clickwhenDisplayed(homePage.productsButton, homePage.heatingandcoolingButton);}

    @And("click the residential")
    public void clickTheResidential() {
        homePage.residentialButton.click();
    }

    @And("click the heating and cooling button")
    public void clickTheHeatingAndCoolingButton() {
        homePage.heatingandcoolingButton.click();
    }

    @Then("check text contains the header")
    public void checkTextContainsTheHeader() {reusableMethods.checkTextContainsOtherText(homePage.textP,homePage.header);}


    @When("click the more button")
    public void clickTheMoreButton() throws InterruptedException {
        Thread.sleep(1000);
        homePage.moreButton.click();
        Thread.sleep(2000);
        //reusableMethods.clickWhenTextChanced(homePage.moreButton,homePage.moreButton.getText(),"LESS");

    }
     @Then("check the all products name correct")
     public void checkTheAllProductsNameCorrect()
     {
         List<String> test=new ArrayList<>();
         reusableMethods.createListforHeatingandCoolingProducts(test);
         reusableMethods.checkStringExistonList(homePage.productList, test);
     }

     @Then("check the actual text equals expected text for all headers")
     public void checkTheActualTextEqualsExpectedTextForAllHeaders() throws InterruptedException {
         List<String> test = new ArrayList<>();
         reusableMethods.createListforHeatingandCoolingRibbons(test);
         reusableMethods.checkRibbonHeaders(homePage.ribbonHeaders,test);
     }

     @Then("write the zip on the textbox")
     public void writeTheZipOnTheTextbox() throws InterruptedException {
         List<String> zips =new ArrayList<>();
         reusableMethods.createListforHeatingandCoolingZips(zips);
         reusableMethods.writeArrayonElement(zips, homePage.findArheemPro, homePage.weFoundText);
     }


    @Then("image links are controlled with size")
    public void imageLinksAreControlledWithSize() throws InterruptedException {
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(homePage.images,reusableMethods.createArrayforImageNames(),mainTabHandle);
    }
}
