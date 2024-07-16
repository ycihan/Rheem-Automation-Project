package rheemProject.stepdefinitions.us;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import rheemProject.pages.usPages.heatingandcoolingPage;
import rheemProject.pages.usPages.rheemHomePage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.reusableMethods;

import java.util.List;

public class productList_StepDef {
    rheemHomePage homePage=new rheemHomePage();
    heatingandcoolingPage heatingPage=new heatingandcoolingPage();
    @Then("asdfdgnhmgfds")
    public void asdfdgnhmgfds() throws InterruptedException {
        Driver.getDriver().get("https://www.rheem.ca/");
        reusableMethods.clickwhenDisplayed(Driver.getDriver().findElement(By.className("products")),Driver.getDriver().findElement(By.xpath("//*[@id='menu-residential-water-heating']")));


        List<WebElement> asdasd= Driver.getDriver().findElements(By.xpath("//*[@id=\"menu-residential-water-heating\"]/li"));
        for (WebElement listElement:asdasd)
        {
            listElement.click();
            List<WebElement> productHeader=Driver.getDriver().findElements(By.xpath("//*[@class=\"description\"]/h3/a"));
        }
        Driver.getDriver().get("https://www.rheem.com/");
        Thread.sleep(3);
        Driver.getDriver().findElement(By.className("products")).click();
        List<WebElement> asdasda= Driver.getDriver().findElements(By.xpath("//*[@id=\"menu-residential-water-heating\"]/li"));
        System.out.println(asdasda.size());
    }
}
