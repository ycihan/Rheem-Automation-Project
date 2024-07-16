package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;

public class poolandspa_StepDef {
    rheemHomePage homePage=new rheemHomePage();
    @Given("the user navigates to {string}")

    public void theUserNavigatesTo(String string) throws InterruptedException {
        selectURLandAcceptCookies.goTo(string);
/*        switch (string) {
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
        }*/
    }

    @When("the user clicks on the Products menu")
    public void theUserClicksOnTheProductsMenu() throws InterruptedException {
        reusableMethods.clickwhenDisplayed(homePage.productsButton,homePage.poolandspaButton);
    }

    @And("the user selects Pool and Spa")
    public void theUserSelectsPoolAndSpa()
    {
        homePage.poolandspaButton.click();
    }

    @Then("verify that user sees a list of Rheem Pool and Spa products.")
    public void verifyThatUserSeesAListOfRheemPoolAndSpaProducts(){
        //reusableMethods.tryToClick(homePage.allowCookie);
        //Thread.sleep(1000);
        homePage.moreButton.click();
        //reusableMethods.clickWhenTextChanced(homePage.moreButton, "MORE","LESS");

        List<String> expectedProducts=new ArrayList<>();

        expectedProducts.add("Above Ground Heaters");
        expectedProducts.add("Electric Heaters");
        expectedProducts.add("Heat Pumps");
        expectedProducts.add("Pool and Spa Heater");

        reusableMethods.checkStringExistonList(homePage.productlistforpool,expectedProducts);
    }


    @And("the user clicks on a specific Pool and Spa product")
    public void theUserClicksOnASpecificPoolAndSpaProduct() throws InterruptedException {
        homePage.moreButton.click();
        Thread.sleep(1000);
        //reusableMethods.clickWhenTextChanced(homePage.moreButton, homePage.moreButton.getText(),"LESS");
        reusableMethods.randomClickonElementList(homePage.productlistforpool);
    }

    @Then("test the zip code on the find a rheem pro textbox")
    public void testTheZipCodeOnTheFindARheemProTextbox() throws InterruptedException {
        List<String> zipCode=new ArrayList<>();
        reusableMethods.addRandomzipCodeatList(zipCode,10);
        reusableMethods.writeArrayonElement(zipCode,homePage.findArheemPro,homePage.weFoundText);
    }

    @Then("test all images displayed")
    public void testAllImagesDisplayed() throws InterruptedException {
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(homePage.images,reusableMethods.createArrayforImageNames(),mainTabHandle);
    }
}
