package rheemProject.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static rheemProject.utilities.reusableMethods.scroolToElement;

public class apacReusableMethods {

    public static void textAssert(WebElement actual, String expected) {
        Assert.assertEquals(actual.getText(), expected);
        System.out.println("My Message :" + actual.getText());
    }

    public static void checkTittle(String expectedTitle) {
        String currentTittle =Driver.getDriver().getTitle();
        System.out.println("Current title: " + Driver.getDriver().getTitle());
        System.out.println("Expected title: " + expectedTitle);
        if (currentTittle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else if (currentTittle.contains(expectedTitle)) {
            System.out.println("Title contains expectedTitle");
        } else {
            System.out.println("Not a match");
        }
    }

    public static void checkImageSrc(WebElement image, String expectedSource) {
        if (image.isDisplayed()) {
            System.out.println("Image is displayed");
            String imageSource = image.getAttribute("src");
            Assert.assertEquals(imageSource, expectedSource);
            System.out.println("My Message : True");
        } else {
            System.out.println("Image is not displayed ");

        }
    }

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void checkTittles(List<WebElement> titles,List<String> test) throws InterruptedException {
        for (WebElement title : titles) {
            scroolToElement(title);
            Thread.sleep(1000);
            //if (test.contains(title.getText())) {
                Assert.assertEquals(test,title.getText());
                //System.out.println(String.format("%-25s%s", title.getText(), " title is contains"));
           // } else {
                //System.out.println(String.format("%-25s%s", title.getText(), " title is not contains"));
           // }
        }
    }


    public static void imgControl(List<WebElement> images, String[] expectedImagesNames, String mainTabHandle) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        for (String expectedImageName : expectedImagesNames) {
            boolean imageFound = false;
            for (WebElement image : images) {
                String imgURL = image.getAttribute("src");
                String[] urlParts = imgURL.split("/");
                int actualWidth = Integer.parseInt(image.getAttribute("width"));
                int actualHeight = Integer.parseInt(image.getAttribute("height"));
                String imageName = urlParts[urlParts.length - 1];

                if (expectedImageName.equals(imageName)) {
                    imageFound = true;
                    System.out.println(imageName + " Found this image");

                    // Resmi yeni sekmede aç
                    ((JavascriptExecutor) driver).executeScript("window.open('" + imgURL + "','_blank')");
                    switchToNewTab(driver, mainTabHandle);

                    // Yeni sekmenin başlığını al
                    String newTabTitle = driver.getTitle();
                    System.err.println(newTabTitle);
                    Thread.sleep(1000);

                    // Başlık içindeki boyutları kontrol et
                    int startIndex = newTabTitle.lastIndexOf("(") + 1;
                    int endIndex = newTabTitle.lastIndexOf(")");

                    if (startIndex != -1 && endIndex != -1) {
                        String dimensions = newTabTitle.substring(startIndex, endIndex);

                        // Boyutları al ve karşılaştır
                        String[] dimensionParts = dimensions.split("×");

                        if (dimensionParts.length == 2) {
                            int width = Integer.parseInt(dimensionParts[0].trim());
                            int height = Integer.parseInt(dimensionParts[1].trim());

                            // Gerçek boyutları al ve karşılaştır

                            System.out.println(actualWidth);
                            System.out.println(actualHeight);

                            if (width == actualWidth && height == actualHeight) {
                                System.out.println("Boyutlar doğru.");
                            } else {
                                System.err.println("Boyutlar yanlış.");
                            }
                        } else {
                            System.err.println("Geçersiz boyutlar.");
                        }
                    } else {
                        System.err.println("Başlık içinde boyutlar bulunamadı.");
                    }
                    //Thread.sleep(1000);
                    driver.close();
                    driver.switchTo().window(mainTabHandle);
                }

            }

            if (!imageFound) {
                System.err.println("Not Found this image: " + expectedImageName);
            }
        }
    }

    public static void switchToNewTab(WebDriver driver, String mainTabHandle) {
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainTabHandle)) {
                driver.switchTo().window(handle);
                return;
            }
        }
    }


    public static void clickwhenDisplayed(WebElement click, WebElement display) throws InterruptedException {
        do {
            System.out.println(display.getText() + "button is not visible");
            click.click();
            System.out.println(click.getText() + " button was clicked");
            Thread.sleep(500);
        }
        while (!display.isDisplayed());
        System.out.println(display.getText() + " button is visible");
    }

    public static void scriptforHeaders(List<WebElement> productsTextHeaders)
    {
        String start="productNameList.add(\"";
        String end="\");";
        for (WebElement header:productsTextHeaders)
        {
            System.out.println(start+header.getText()+end);
        }
    }
    public static void clickEditGroupandsigntomyrheem(int order)
    {
        String xpath="(//*[@class=\"btn btn-primary mt-4\"])";
        String xpath2="["+(order+1)+"]";
        String originalWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath(xpath+xpath2)).click();
        for (String windowHandle : Driver.getDriver().getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                Driver.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        Driver.getDriver().findElement(By.name("username")).sendKeys("valentin.vergilyush@orioninc.com");
        Driver.getDriver().findElement(By.name("password")).sendKeys("XXrz2zcVcyL#9i$");
        Driver.getDriver().findElement(By.xpath("//*[@class=\"btn green pull-right\"]")).click();
    }
    public static void checkproductDetails(String first,String second,String third)
    {
        List <WebElement> expectedDetails=Driver.getDriver().findElements(By.xpath("(//*[@style=\"height: 400px;\"])[1]/ul/li"));
        System.out.println(expectedDetails.get(0).getText());
        System.out.println(expectedDetails.get(1).getText());
        System.out.println(expectedDetails.get(2).getText());
        if(expectedDetails.get(0).getText().contains(first)&&expectedDetails.get(1).getText().contains(second)&&expectedDetails.get(2).getText().contains(third))
            System.out.println("Details are correct");
    }



 /*   public static void elementToBeClickable(WebElement locate){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        if(wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locate.getText())))==null)

    }

    public static List<String>(String string){
    switch (string) {
        case "Electric Instant Water Heaters Page Singapore":
            return string;
            break;
        case "singaporeIAT":
            Driver.getDriver().get(configurationReader.getProperty("singaporeIAT"));
            break;
        case "singaporeUAT":
            Driver.getDriver().get(configurationReader.getProperty("singaporeUAT"));
            break;
        default:
            break;
    }
}

*/
   // Electric Instant Water Heaters Page Singapore

}
