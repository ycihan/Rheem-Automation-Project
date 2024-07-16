package rheemProject.stepdefinitions.apac;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import rheemProject.pages.apacPages.warrantyPage;
import rheemProject.utilities.Driver;
import rheemProject.utilities.configurationReader;
import rheemProject.utilities.cookiesManager;
import rheemProject.utilities.reusableMethods;

public class warrantApacStepDef {
    warrantyPage warrantyPage = new warrantyPage();
    static String modelname="";

    @When("go to the warranty page at {string}")
    public void goToTheWarrantypageAt(String sitename) {
        String last = "/warranty-registration/";
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
        cookiesManager.acceptCookies(sitename);
    }

    @When("write the fullname{string}")
    public void writeTheFullname(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.fullname);
        warrantyPage.fullname.sendKeys(arg0);
        //Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary']")).click();
    }

    @When("write the address{string}")
    public void writeTheAddress(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.addressLine1);
        warrantyPage.addressLine1.sendKeys(arg0);
    }

    @When("write the addresstwo{string}")
    public void writeTheAddresstwo(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.addressLine2);
        warrantyPage.addressLine2.sendKeys(arg0);}

    @When("write the city{string}")
    public void writeTheCity(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.city);
        warrantyPage.city.sendKeys(arg0);}


    @When("select the country {string}")
    public void selectTheCountry(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.country);
        Driver.getDriver().findElement(By.xpath("//span[@class='wpcf7-form-control-wrap " + "country" + "']//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']")).click();
        Driver.getDriver().findElement(By.xpath("(//li[normalize-space()='" + arg0 + "'])[3]")).click();
    }


    @When("write the zip{string}")
    public void writeTheZip(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.zipPostalCode);
        warrantyPage.zipPostalCode.sendKeys(arg0);
    }

    @When("write the phone{string}")
    public void writeThePhone(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.phone);
        warrantyPage.phone.sendKeys(arg0);
    }

    @When("write the mail{string}")
    public void writeTheMail(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.email);
        warrantyPage.email.sendKeys(arg0);
    }

    @And("click next button then observe the warnings")
    public void clickNextButtonThenObserveTheWarnings() {
        warrantyPage.nextButton1.click();
        if(!warrantyPage.warningtexts.isEmpty())
        {
            System.out.println("Warning at first page");
        }
        else
        {
            System.out.println("No warnings");
        }
    }
    @When("select the model one {string}")
    public void selectTheModelOne(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("//span[@class=\"wpcf7-form-control-wrap Model-Series\"]/div[@class=\"nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required niceselect\"]")).click();
        Driver.getDriver().findElement(By.xpath("//*[@data-value='"+arg0 +"']")).click();
        modelname = arg0.substring(0, arg0.indexOf(" ", arg0.indexOf(" ")))+"-models";
    }

    @And("select the model two {string}")
    public void selectTheModelTwo(String arg0) {
        Driver.getDriver().findElement(By.xpath("//span[@class='wpcf7-form-control-wrap "+modelname+"']/div[@class=\"nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required niceselect\"]")).click();
        Driver.getDriver().findElement(By.xpath("//*[@data-value='"+arg0 +"']")).click();
    }


    @When("write the serialnumber{string}")
    public void writeTheSerialnumber(String arg0) {warrantyPage.serialnumber.sendKeys(arg0);}
    @And("click next button two then observe the warnings")
    public void clickNextButtonTwoThenObserveTheWarnings() {
        reusableMethods.scroolToElement(warrantyPage.serialnumber);
        warrantyPage.nextButton2.click();
        if(!warrantyPage.warningtexts.isEmpty())
        {
            System.out.println("Warning at second page");
            Driver.getDriver().quit();
        }
        else
        {
            System.out.println("No warnings");
        }
    }


    @When("write the purchase price {string}")
    public void writeThePurchasePrice(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        warrantyPage.purchasePrice.sendKeys(arg0);}

    @When("write the purchase date {string}")
    public void writeThePurchaseDate(String arg0) {warrantyPage.purchaseDate.sendKeys(arg0);}

    @When("write the promo code {string}")
    public void writeThePromoCode(String arg0) {warrantyPage.promecode.sendKeys(arg0);}

    @When("write the where did u buy {string}")
    public void writeTheWhereDidUBuy(String arg0) {warrantyPage.wheredidyou.sendKeys(arg0);}

    @When("write the how did u find out {string}")
    public void writeTheHowDidUFindOut(String arg0) {
        reusableMethods.scroolToElement(warrantyPage.promecode);
        warrantyPage.wheredidyoudropdown.click();
        Driver.getDriver().findElement(By.xpath("//*[@data-value='"+arg0 +"']")).click();
    }

    @When("choose the file {string}")
    public void chooseTheFile(String arg0) {warrantyPage.choosefile.sendKeys(arg0);}
    @Then("click the submit button and observe the warnings")
    public void clickTheSubmitButtonAndObserveTheWarnings() {
        reusableMethods.scroolToElement(warrantyPage.wheredidyoudropdown);
        warrantyPage.submitButton.click();
        if(!warrantyPage.warningtexts.isEmpty())
        {
            System.out.println("Warning at third page");
            Driver.getDriver().quit();
        }
        else
        {
            System.out.println("No warnings");
            System.out.println("This scenario is successful");
        }
    }
}
