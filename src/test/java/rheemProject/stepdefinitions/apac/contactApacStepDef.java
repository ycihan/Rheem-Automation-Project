package rheemProject.stepdefinitions.apac;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import rheemProject.pages.apacPages.contactPage;
import rheemProject.pages.sureComfortPages.sureComfortPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.reusableMethods;

import java.util.Map;

import static rheemProject.utilities.Driver.driver;

public class contactApacStepDef {

    contactPage contactPage = new contactPage();
    contactPage page = new contactPage();
    JavascriptExecutor js = (JavascriptExecutor)driver;
    @When("go to the contact page at {string}")
    public void goToTheContactPageAt(String sitename) {
        String last = "/contact/";
        switch (sitename) {
            case "singapore":
                Driver.getDriver().get(configurationReader.getProperty("singapore") + last);
                break;
            case "philippines":
                Driver.getDriver().get(configurationReader.getProperty("philippines") + last);
                break;
            case "vietnam":
                Driver.getDriver().get(configurationReader.getProperty("vietnam") + last);
                break;
            case "malaysia":
                Driver.getDriver().get(configurationReader.getProperty("malaysia") + last);
                break;
            case "indonesia":
                Driver.getDriver().get(configurationReader.getProperty("indonesia") + last);
                break;
            case "asia":
                Driver.getDriver().get(configurationReader.getProperty("asia") + last);
                break;
            default:
                break;
        }
    }

    @And("write your fullname{string}")
    public void writeYourFullname(String arg0) {

        contactPage.fullname.sendKeys(arg0);
    }

    @And("write your address{string}")
    public void writeYourAddress(String arg0) {

        contactPage.addressLine1.sendKeys(arg0);
    }

    @And("write your city{string}")
    public void writeYourCity(String arg0) {

        contactPage.city.sendKeys(arg0);
    }

    @And("select country {string}")
    public void selectCountry(String country) {
       // reusableMethods.scroolToElement(contactPage.fullname);
        Driver.getDriver().findElement(By.xpath("//span[@class='wpcf7-form-control-wrap "+"country"+"']//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']")).click();
        Driver.getDriver().findElement(By.xpath("(//li[normalize-space()='"+country+"'])[3]")).click();

        //    Map<String, String> countryOptions = Map.of("country", country);
        //    reusableMethods.selectDropdownValuesOnlineClaimSubmission(driver, countryOptions);
    }

    @And("enter the zip code{string}")
    public void enterTheZipCode(String arg0) {
        contactPage.zipPostalCode.sendKeys(arg0);
    }

    @And("enter your phone number{string}")
    public void enterYourPhoneNumber(String arg0) {

        contactPage.phone.sendKeys(arg0);
    }

    @And("write your email{string}")
    public void writeYourEmail(String arg0) {

        contactPage.email.sendKeys(arg0);

    }
    @And("select topic {string}")
    public void selectTopic(String arg0) {
        reusableMethods.waitFor(2);
       //reusableMethods.scroolToElement(contactPage.topic);
        // contactPage.topic.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", contactPage.topic);
        reusableMethods.waitFor(2);
       // Driver.getDriver().findElement(By.xpath("(//li[normalize-space()='"+arg0+"'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"wpcf7-f3-o1\"]/form/div[2]/div[2]/p[1]/span/div/ul/li[2]")).click();


        //Driver.getDriver().findElement(By.xpath("//span[@class='wpcf7-form-control-wrap "+"topic"+"']//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']")).click();
        //Driver.getDriver().findElement(By.xpath("//*[@value='"+arg0 +"']")).click();
       // Driver.getDriver().findElement(By.xpath("//*[@id=\"wpcf7-f3-o1\"]/form/div[2]/div[2]/p[1]/span/div")).click();
        //Driver.getDriver().findElement(By.xpath("//*[@id="wpcf7-f3-o1"]/form/div[2]/div[2]/p[1]/span/div/ul/li[2]")).click();
    }
    @And("write comment {string}")
    public void writeComment(String arg0) {
        contactPage.comments.sendKeys(arg0);

    }
    @Then("click submit button and confirm no error message shown")
    public void clickSubmitButtonAndConfirmNoErrorMessageShown() {
        String expectedUrl = "https://www.rheemsingapore.com/thank-you/";
        reusableMethods.wait(1);
        contactPage.submitButton.click();
        reusableMethods.wait(2);
        //reusableMethods.waitForVisibilityy(By.xpath("//*[@id=\"wpcf7-f3-o1\"]/form/div[3]"), 10);// if (Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Your message was sent successfully. Thanks.')]")).getText().equals("Your message was sent successfully. Thanks."))
        if (Driver.getDriver().getCurrentUrl().equalsIgnoreCase(expectedUrl))
        {
            System.err.println(contactPage.responseText.getText() + "\nNo error");
        } else if (contactPage.responseText.getText().equals("One or more fields have an error. Please check and try again.")) {
            System.err.println(contactPage.responseText.getText() + "\nError");
        } else {
            System.out.println(contactPage.responseText.getText() + "\nNo Error");
        }
    }


    @And("upload the upload file with {string}")
    public void uploadTheUploadFileWith(String arg0) {
        if (arg0.contains(".jpg") || !arg0.contains(".pdf")) {
            System.err.println("File must be pdf or jpg. Please check the file type.");
        }
        reusableMethods.fileSizeControl(arg0);
        page.uploadFile.sendKeys(arg0);
    }
}
