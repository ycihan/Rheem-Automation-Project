package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import rheemProject.pages.usPages.partsNavigationPanelPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;

public class partsNavigationPanel_StepDef {
    partsNavigationPanelPage partsNavigationPanelPage=new partsNavigationPanelPage();
    rheemHomePage homePage = new rheemHomePage();
    @Given("go to the {string} comm")
    public void goToTheComm(String site) {

        selectURLandAcceptCookies.goTo(site);

        /*switch (string) {
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

    @And("mouse goes to home Page Parts navigation panel")
    public void mouseGoesToHomePagePartsNavigationPanel() throws InterruptedException {
        reusableMethods.wait(3);
      //reusableMethods.hover(partsNavigationPanelPage.partsButton);
        reusableMethods.hoverwhenDisplayed(partsNavigationPanelPage.partsButton,partsNavigationPanelPage.partsButton);

    }

    @Then("Check all texes in Parts Navigation Panel")
    public void checkAllTexesInPartsNavigationPanel() throws InterruptedException {

        reusableMethods.waitForVisibility(partsNavigationPanelPage.airConditioningHeatingConsumerButton,3);
        List<String> test = new ArrayList<>();
        reusableMethods.createListforPartsNavigationPanelTexts(test);
        reusableMethods.checkTexss(partsNavigationPanelPage.texts,test);
    }

    @Then("Check clickable Air Conditioning & Heating consumer button")
    public void checkClickableAirConditioningHeatingConsumerButton() {
    reusableMethods.waitForVisibility(partsNavigationPanelPage.airConditioningHeatingConsumerButton,3);
    partsNavigationPanelPage.airConditioningHeatingConsumerButton.click();
    reusableMethods.switchToWindow("Rheem Replacement Parts");

    }
    @Then("Check clickable Air Conditioning & Heating business button")
    public void checkClickableAirConditioningHeatingBusinessButton() {
        reusableMethods.waitForVisibility(partsNavigationPanelPage.airConditioningHeatingBusinessButton,3);
        partsNavigationPanelPage.airConditioningHeatingBusinessButton.click();
        reusableMethods.switchToWindow("Login");
    }


    @Then("Check clickable Water Heating Tank consumer button")
    public void checkClickableWaterHeatingTankConsumerButton() {
        reusableMethods.waitForVisibility(partsNavigationPanelPage.airConditioningHeatingConsumerButton,3);
        partsNavigationPanelPage.tanklessGasConsumerButton.click();
        reusableMethods.switchToWindow("Rheem Replacement Parts");
    }
    @Then("Check clickable Water Heating Tank business button")
    public void checkClickableWaterHeatingTankBusinessButton() {
        reusableMethods.waitForVisibility(partsNavigationPanelPage.airConditioningHeatingConsumerButton,3);
        partsNavigationPanelPage.waterHeatingTankBusinessButton.click();
        reusableMethods.switchToWindow("Login");
    }

    @Then("Check clickable Tankless Gas consumer button")
    public void checkClickableTanklessGasConsumerButton() {
        reusableMethods.waitForVisibility(partsNavigationPanelPage.airConditioningHeatingConsumerButton,3);
        partsNavigationPanelPage.tanklessGasConsumerButton.click();
        reusableMethods.switchToWindow("Rheem Replacement Parts");
    }

    @Then("Check clickable Tankless Gas business button")
    public void checkClickableTanklessGasBusinessButton() {
        reusableMethods.waitForVisibility(partsNavigationPanelPage.tanklesGasBusinessButton,3);
        partsNavigationPanelPage.tanklesGasBusinessButton.click();
        reusableMethods.switchToWindow("Login");
    }

    @Then("Check clickable Electric consumer button")
    public void checkClickableElectricConsumerButton() {
        reusableMethods.waitForVisibility(partsNavigationPanelPage.electricConsumerButton,3);
        partsNavigationPanelPage.electricConsumerButton.click();
        reusableMethods.switchToWindow("Eemax B2C");

    }
}
