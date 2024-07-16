package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.pages.usPages.warrantiesFormPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static rheemProject.utilities.Driver.driver;

public class warrantiesFormStepDef {

    warrantiesFormPage page = new warrantiesFormPage();
    rheemHomePage home = new rheemHomePage();

    @Given("click on the Warranties button")
    public void click_on_the_warranties_button() {
       // home.allowCookie.click();
        page.warrantiesButton.click();
    }

    @Then("should be redirected to  commercial resource center page")
    public void should_be_redirected_to_commercial_resource_center_page() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.rheem.com/warranties/";
        //   assertEquals(actualUrl,expectedUrl);
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Success: URLs match! Actual URL: " + actualUrl);
        } else {
            assertEquals("Failure: URLs do not match!", expectedUrl, actualUrl);
        }
    }


   @Then("Check all images on the Warranties Form Page are valid")
    public void check_all_images_on_the_warranties_form_page_are_valid()  {
     /*   List<WebElement> imagesWarrantiesForm = page.warrantiesImage;
        String[] expectedImages= {"verify-warranty.png","register-product.png","warranty-service.png","warranty-header.png"};
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(imagesWarrantiesForm, expectedImages, mainTabHandle);*/
       try {
           int invalidImageCount = 0;
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

    @Then("verify the main title is correct")
    public void verify_the_main_title_is_correct() {
        String actualTitle = page.mainTitle.getText();
        String expectedTitle = "Warranties";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Success: Titles match! Actual URL: " + actualTitle);
        } else {
            assertEquals("Failure: Titles do not match!", expectedTitle, actualTitle);
        }
    }


    @Then("verify headers are correct")
    public void verify_headers_are_correct() throws InterruptedException {

        reusableMethods.checkTittles(page.panelHeaders,reusableMethods.createlistforWarrantiesHeaders());

    }
    @When("click on hyperTexts")
    public void click_on_hyper_texts() {
       page.hyperText.click();
    }

    @Then("should be redirected to the correct pop up")
    public void should_be_redirected_to_the_correct_pop_up() {

             String currentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        Iterator<String> i = allWindows.iterator();

     while(i.hasNext()){
            String childwindow = i.next();
            if(!childwindow.equalsIgnoreCase(currentWindow)){
                driver.switchTo().window(childwindow);
                System.out.println("The child window is "+childwindow);
            } else {
                System.out.println("There are no children");
            }
        }


       /* WebElement iframeElement =  driver.findElement(By.id("whereserial"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeElement"));


        driver.switchTo().frame(iframeElement);
        String actualTitle= Driver.getDriver().findElement(By.id("1")).getText();
        String expectedTitle = "Water Heating";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Success: Pop-up is opened!");
        } else {
            assertEquals("Failure: Pop-up is not opened !", expectedTitle, actualTitle);
        }*/

    }



    @When("click on {string} button")
    public void clickOnButton(String Button) {
        reusableMethods.clickButtonWarrantiesForm(page,Button);
    }
}

































































