package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import rheemProject.pages.usPages.residentialTanklessCondensingPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;

import java.util.ArrayList;
import java.util.List;

public class residentialtanklesscondensing_StepDef {
    residentialTanklessCondensingPage tanklessPage = new residentialTanklessCondensingPage();
    rheemHomePage homePage=new rheemHomePage();

    @And("click on tankless condensing")
    public void clickOnTanklessCondensing() {
        reusableMethods.waitFor(2);
       homePage.tanklessCondensing.click();
    }

    @Then("Check if the correct page opened")
    public void checkIfTheCorrectPageOpened() {
        String alert= Driver.getDriver().getCurrentUrl().contains(configurationReader.getProperty("tanklessCondensing"))?"True message":"False message";
        System.out.println(alert);
    }

    @Then("Check if the title is correct")
    public void checkIfTheTitleIsCorrect() {
        String actualTitle = tanklessPage.pageTitle.getText();

        String expectedTitle= "Super High Efficiency Tankless Water Heaters";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");
    }
    @Then("Check the intro text is correct")
    public void checkTheIntroTextIsCorrect() {String actualText = tanklessPage.introText.getText();

        String expectedText="Enjoy the comfort and convenience of continuous hot water. Available in both indoor and outdoor models, Rheem® high-efficiency condensing tankless gas water heaters are loaded with features to help you save money and reduce water waste. And these ultra low NOx tankless solutions are up to 96% efficient to reduce energy costs, too.";
        if(actualText.equalsIgnoreCase(expectedText))
            System.out.println("Text Matched");
        else
            System.out.println("Text didn't match");
    }

    @Then("check that all of the expected products are listed")
    public void checkThatAllOfTheExpectedProductsAreListed() {
        List<String> expectedProducts=new ArrayList<>();

        expectedProducts.add("Performance Platinum Super High Efficiency Condensing Tankless Gas Water Heaters With Built-in Wi-Fi");
        expectedProducts.add("Performance Platinum Super High Efficiency Condensing Tankless Gas Water Heaters");
        expectedProducts.add("RTGH Series Super High Efficiency Condensing Tankless Gas Water Heater With Built-In Wi-Fi");
        expectedProducts.add("RTGH Series Super High Efficiency Condensing Tankless Gas Water Heaters");
        expectedProducts.add("Rheem IKONIC Super High Efficiency Condensing Tankless Gas Water Heater with Recirculating Pump");
        expectedProducts.add("Rheem IKONIC Super High Efficiency Condensing Tankless Gas Water Heater");
        expectedProducts.add("Rheem ThermaForce Super High Efficiency Condensing Tankless Gas Water Heaters");
        expectedProducts.add("Performance Condensing Tankless Gas Water Heaters with Built-in Recirculation");

        reusableMethods.checkStringExistonList(tanklessPage.tanklessProducts,expectedProducts);
    }

    @Then("check product images are correct")
    public void checkProductImagesAreCorrect() throws InterruptedException{
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(homePage.images,reusableMethods.createArrayForTanklessCondensingImageNames(),mainTabHandle);
    }
}
