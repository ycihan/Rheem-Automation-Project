package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import rheemProject.pages.usPages.residentialResourceCenterPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static rheemProject.utilities.Driver.getDriver;

public class residentialResourceCenter_StepDef {
    int invalidImageCount;

    residentialResourceCenterPage resourceCenter = new residentialResourceCenterPage();
    rheemHomePage homePage=new rheemHomePage();
    @And("click on the Resource Center button")
    public void clickOnTheResourceCenterButton() {
        resourceCenter.resourceButton.click();

    }

    @Then("should be redirected to the resource center page")
    public void shouldBeRedirectedToTheResourceCenterPage() {
        String alert= Driver.getDriver().getCurrentUrl().contains(configurationReader.getProperty("resourceCenter"))?"True message":"False message";
        System.out.println(alert);
    }

    @Then("Homeowner Resource Center header is displayed on the page")
    public void homeownerResourceCenterHeaderIsDisplayedOnThePage() {
       // System.out.println(resourceCenter.Homeownerheader.getText());

       if(resourceCenter.Homeownerheader.getText().contains("Homeowner\n" +
                "Resource Center"));
        {
            System.out.println("Header is correct");

        }
    }

    @Then("Check all images on the page are valid")
    public void checkAllImagesOnThePageAreValid() {
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

    @When("click on {string}")
    public void clickOn(String arg0) throws Throwable {

        for (WebElement element:resourceCenter.quickLinks)
        {
            element.click();
        }
    }

    @Then("should be redirected to the {string}")
    public void shouldBeRedirectedToThe(String arg0, String arg1) {
        Driver.getDriver().get(configurationReader.getProperty("resourceCenter"));
    }

    @When("I click on {string}")
    public void ıClickOn(String arg0, String arg1) {
        for (WebElement element:resourceCenter.warrantyInformation)
        {
            element.click();
        }
    }

    @Then("I should be redirected to the {string}")
    public void ıShouldBeRedirectedToThe(String arg0, String arg1) {
        Driver.getDriver().get(configurationReader.getProperty("resourceCenter"));

    }

    @Then("Header and text will be true and visible")
    public void headerAndTextWillBeTrueAndVisible() {
        Assert.assertEquals(resourceCenter.producteducationHeader.getText(), "Rheem Product Education");
        Assert.assertEquals(resourceCenter.producteducationtext.getText(), "Let us teach you everything you need to know to make informed decisions about your heating, cooling and water heating equipment.");
      /*  if(resourceCenter.producteducationHeader.getText().contains("Rheem Product Education"));
        {
            System.out.println("Header is correct");

        }

        if (resourceCenter.producteducationtext.getText().contains
                ("Let us teach you everything you need to know to make informed decisions about your heating, cooling and water heating equipment."));
        {
            System.out.println("Text is correct");

        } */
    }

    @When("click on Find Savings button")
    public void clickOnFindSavingsButton() {
        resourceCenter.findSavings.click();
    }

    @Then("should be directed to the rebate page")
    public void shouldBeRedirectedToTheCorrectPage() {
        String actualURL = getDriver().getCurrentUrl();
        String expectedURL = "https://www.rheem.com/rebate-center/?ecr_rebateConsumerTypes=residential&zip=94025";
        assertEquals(actualURL, expectedURL);
        Driver.getDriver().get(configurationReader.getProperty("resourceCenter"));
    }
    @When("click on Get Answers button")
    public void clickOnGetAnswersButton() {
        resourceCenter.getAnswers.click();
    }
    @Then("should be directed to the FAQ page")
    public void shouldBeDirectedToTheFAQPage() {
        String actualURL = getDriver().getCurrentUrl();
        String expectedURL = "https://www.rheem.com/faqs/";
        assertEquals(actualURL, expectedURL);
        Driver.getDriver().get(configurationReader.getProperty("resourceCenter"));
    }
    @When("click on Contact Us button")
    public void clickOnContactUsButton() {
        resourceCenter.contactUs.click();
    }


    @Then("should be directed to the contact rheem page")
    public void shouldBeDirectedToTheContactRheemPage() {
        String actualURL = getDriver().getCurrentUrl();
        String expectedURL = "https://www.rheem.com/contact/";
        assertEquals(actualURL, expectedURL);
        Driver.getDriver().get(configurationReader.getProperty("resourceCenter"));
    }
}
