package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import rheemProject.pages.usPages.commercialProductSizingPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static rheemProject.utilities.Driver.driver;

public class commercialProductSizingStepDef {

    commercialProductSizingPage page = new commercialProductSizingPage();
    rheemHomePage home = new rheemHomePage();
    List<String> visitedURLProductSizing = new ArrayList<>();
    List<String> visitedURLProductSizings = new ArrayList<>();


    @And("click on  commercial button")
    public void clickOnCommercialButton() {
        home.commercialButton.click();
    }

    @When("click on the Product Sizing button")
    public void click_on_the_product_sizing_button() {

        page.productSizingButton.click();
    }

    @Then("should be redirected to the commercial resource center page")
    public void should_be_redirected_to_the_commercial_resource_center_page() {

        String actualURLproductSizing = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.rheem.com/products/commercial/commercial_resource_center/";

    }
    @Then("should be clicked")
    public void should_be_clicked() {
       // home.allowCookie.click();
        //  page.getItSized.get(1).click();
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),\"Get Help\")]")).click();

    }

    @Then("verify main title is correct")
    public void verify_main_title_is_correct() {
        String expectedMainTitle = "Commercial Resource Center";
        String actualMainTitle = page.mainTitleProductSizing.getText();
        assertEquals(expectedMainTitle, actualMainTitle);
    }

    @Then("Checked all images on the page are valid")
    public void checked_all_images_on_the_page_are_valid() throws InterruptedException {
        List<WebElement> imagesComProductSizing = page.productSizingImgs;
        String[] expectedImages = {"locker_room.png", "innovation-learning-center.png", "plumber.png", "GDOG-resourcetile.png", "hvac-enivronment.jpg", "innovation-learning-center.png"};
        String mainTabHandle = Driver.getDriver().getWindowHandle();
        reusableMethods.imgControl(imagesComProductSizing, expectedImages, mainTabHandle);
    }

    @When("click on the {string} button")
    public void click_on_the_button(String Button) {

       // home.allowCookie.click();


        reusableMethods.clickButton(page, "BIM Resources");
        reusableMethods.clickButtonAndHandleWindow(visitedURLProductSizing, driver);

        reusableMethods.clickButton(page, "View All Revit Files");
        visitedURLProductSizing.add(driver.getCurrentUrl());
        driver.navigate().back();

        reusableMethods.clickButton(page, "Tankless Installation Diagrams");
        reusableMethods.clickButtonAndHandleWindow( visitedURLProductSizing, driver);

        reusableMethods.clickButton(page, "Tank Installation Diagrams");
        reusableMethods.clickButtonAndHandleWindow( visitedURLProductSizing, driver);

    }


    @Then("should be redirected to the {string} page")
    public void shouldBeRedirectedToThePage(String Page) {
        List<String> createListforExpectedUrls = new ArrayList<>();
        reusableMethods.createListforExpectedUrls(createListforExpectedUrls);
        reusableMethods.compareUrls(visitedURLProductSizing, createListforExpectedUrls);
    }

    @When("click on the {string} buttons")
    public void click_on_the_buttons(String Button) {
        //home.allowCookie.click();

        reusableMethods.clickButton(page, "RapidSpec™");
        reusableMethods.clickButtonAndHandleWindows(visitedURLProductSizing, driver);

        reusableMethods.clickButton(page, "Get Help from a Pro");
        visitedURLProductSizings.add(driver.getCurrentUrl());
        // driver.navigate().back();
    }

    @Then("should be redirected to {string} page")
    public void should_be_redirected_to_page(String Page) {
        List<String> createListforExpectedUrlsGetItSized = new ArrayList<>();
        reusableMethods.createListforExpectedUrlsGetItSized(createListforExpectedUrlsGetItSized);
        System.out.println("visitedURL:" + visitedURLProductSizing);
        System.out.println("createListforExpectedUrlsGetItSized = " + createListforExpectedUrlsGetItSized);
        System.out.println(createListforExpectedUrlsGetItSized);
        reusableMethods.compareUrls(visitedURLProductSizing, createListforExpectedUrlsGetItSized);
    }
}