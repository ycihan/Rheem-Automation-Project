package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import rheemProject.pages.usPages.commercialResourceCenterPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.List;

public class commercialResourceCenter_StepDef {

    int invalidImageCount;

    commercialResourceCenterPage resourceCenter = new commercialResourceCenterPage();

    rheemHomePage homePage=new rheemHomePage();
    @Given("Go to {string} site")
    public void goToSite(String string) {
        selectURLandAcceptCookies.goTo(string);
    }


    @And("click  on the commercial")
    public void clickOnTheCommercial() throws InterruptedException {
        resourceCenter.commercialButton.click();
    }


    @And("click on the Resource Center")
    public void clickOnTheResourceCenter() {
        resourceCenter.resourceButton.click();
    }

    @Then("ought to be sent to the page of the resource center.")
    public void oughtToBeSentToThePageOfTheResourceCenter() {
        String alert= Driver.getDriver().getCurrentUrl().contains(configurationReader.getProperty("resourceCenter"))?"True message":"False message";
        System.out.println(alert);
    }



    @Then("Commercial Resource Center header is displayed on the page")
    public void commercialResourceCenterHeaderIsDisplayedOnThePage() {
        if(resourceCenter.Homeownerheader.getText().contains("Homeowner\n" +
                "Resource Center"));
        {
            System.out.println("Header is correct");

        }
    }


    @Then("Verify the validity of each image on the website.")
    public void verifyTheValidityOfEachImageOnTheWebsite() {
        try {
            invalidImageCount = 0;
            List<WebElement> imagesList = Driver.getDriver().findElements(By.tagName("img"));
            System.out.println("Total no. of images are " + imagesList.size());
            for (WebElement imgElement : imagesList) {
                if (imgElement != null) {
                    reusableMethods.verifyimageActive(imgElement);
                }
            }
            System.out.println("Total no. of invalid images are "	+ invalidImageCount);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    @Then("sshould be redirected to the {string}")
    public void sshouldBeRedirectedToThe(String arg0) {
        Driver.getDriver().get(configurationReader.getProperty("resourceCenter"));
    }

    @When("click on the link")
    public void clickOnTheLink() {
        for (WebElement element:resourceCenter.revitfilesandDiagrams)
        {
            element.click();
        }

    }

    

    @When("click  link")
    public void clickLink() {
        for (WebElement element:resourceCenter.industries)
        {
            element.click();
        }
    }

    @Then("sshould be redirected to the link")
    public void sshouldBeRedirectedToTheLink() {
        
    }

    @Then("should be redirected to the link")
    public void shouldBeRedirectedToTheLink() {
    }
}




