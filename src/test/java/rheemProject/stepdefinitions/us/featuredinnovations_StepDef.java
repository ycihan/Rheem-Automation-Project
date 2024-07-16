package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import rheemProject.pages.usPages.featuredInnovationsPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;
import rheemProject.utilities.selectURLandAcceptCookies;

import java.util.ArrayList;
import java.util.List;

public class featuredinnovations_StepDef {
    rheemHomePage homePage=new rheemHomePage();
    featuredInnovationsPage innovationsPage = new featuredInnovationsPage();
    int invalidImageCount;

    @Given("go to {string}")
    public void goTo(String string) {
        selectURLandAcceptCookies.goTo(string);
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
        } */
    }
   /* @And("click on products")
    public void clickOnProducts() throws InterruptedException {
        //homePage.allowCookie.click();
        reusableMethods.clickwhenDisplayed(homePage.productsButton,homePage.featuredInnovationButton);
    } */

    @And("click on residential")
    public void clickOnResidential() {
        homePage.residentialButton.click();
    }

    @And("click on featured innovations")
    public void clickOnFeaturedInnovations() {
        homePage.featuredInnovationButton.click();
    }

    @Then("confirm that correct page opened")
    public void confirmThatCorrectPageOpened() {
       String alert= Driver.getDriver().getCurrentUrl().contains(configurationReader.getProperty("residentialInnovation"))?"True message":"False message";
        System.out.println(alert);
    }

    @And("check all images on the page are valid")
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



   /*     List<WebElement> imagesList = Driver.getDriver().findElements(By.tagName("img"));
        System.out.println("Total no. of images are " + imagesList.size());
        for (WebElement imgElement : imagesList) {
            if (imgElement != null) {
                try {
                    HttpClient client = HttpClientBuilder.create().build();

                    HttpGet request = new HttpGet(imgElement.getAttribute("src"));
                    HttpResponse response = client.execute(request);

                    // verifying response code he HttpStatus should be 200 if not,
                    // increment as invalid images count

                    if (response.getStatusLine().getStatusCode() != 200)
                        invalidImageCount++;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Total no. of invalid images are " + invalidImageCount);
*/
    }



    @Then("confirm that all of the expected products are listed")
    public void confirmThatAllOfTheExpectedProductsAreListed() {
        List<String> expectedProducts=new ArrayList<>();

        expectedProducts.add("Modulating R98V Furnaces");
        expectedProducts.add("Mini-Split Systems");
        expectedProducts.add("Hybrid Water Heater");
        expectedProducts.add("Marathon Water Heaters");
        expectedProducts.add("Water Heater Booster");
        expectedProducts.add("Tankless Water Heaters");
        expectedProducts.add("Combination Boiler");
        expectedProducts.add("EcoNet Smart Thermostat");
        expectedProducts.add("Integrated Air & Water");

        reusableMethods.checkStringExistonList(innovationsPage.innovationsProducts,expectedProducts);
    }



    @Then("confirm that motto title is correct")
    public void confirmThatTitleIsCorrect() {
        String actualTitle = innovationsPage.mottoTitle.getText();

        String expectedTitle= "BIG IDEAS. BETTER LIVING.";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");
     //   Assert.assertEquals("Title is correct",actualTitle,expectedTitle);

    }
}
