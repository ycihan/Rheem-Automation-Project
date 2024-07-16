package rheemProject.utilities;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import rheemProject.pages.usPages.commercialProductSizingPage;
import rheemProject.pages.usPages.warrantiesFormPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class reusableMethods {

    private static int timeout = 5;
    static Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/raporlar/Screenshots/" + name + date + ".png";

        File finalDestination = new File(target);
        // save the screenshot to the path given
        //FileUtils.copyFile(source, finalDestination);

        return target;
    }

    //========Switching Window=====//
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

    //========Hover Over=====//

    /**
     * Bu metot bir webelementin ustune gidip beklemeyi saglar.
     *
     * @param element ustune gidilip beklenecek elementin locate'dir
     */
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //===============Thread.sleep Wait==============//
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(15))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }

    /**
     * Performs double click action on an element
     *
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     *
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public static void waitAndClick(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static void waitAndClick(WebElement element) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static void waitAndSendText(WebElement element, String text, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }


    public static void waitAndSendText(WebElement element, String text) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static void waitAndSendTextWithDefaultTime(WebElement element, String text) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static String waitAndGetText(WebElement element, int timeout) {
        String text = "";
        for (int i = 0; i < timeout; i++) {
            try {
                text = element.getText();
                return text;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
        return null;
    }


    //5 seconds
    public static void waitAndClickElement(WebElement element, int seconds) {
        for (int i = 0; i < seconds; i++) {

            try {
                element.click();
                break;
            } catch (Exception e) {
                wait(1);
            }
        }
    }

    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForVisibilityy(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static Boolean waitForInVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command, element);
    }

    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
        wait(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }
    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param elements
     */
    public static void clickWithJSAsList(List<WebElement> elements) {
        for (WebElement each : elements) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", waitForVisibility(each, 5));
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", each);
        }
    }

    public static void selectByVisibleText(WebElement element, String text) {
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element, int index) {
        Select objSelect = new Select(element);
        objSelect.selectByIndex(index);
    }

    public static void selectByValue(WebElement element, String value) {
        Select objSelect = new Select(element);
        List<WebElement> elementCount = objSelect.getOptions();
        objSelect.selectByValue(value);
        System.out.println("number of elements: " + elementCount.size());
    }

    public static void sleep(int timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitAndClickLocationText(WebElement element, String value) {
        Driver.getDriver().findElement(By.xpath("//*[text()='" + value + "']")).click();
    }

    public static void uploadFile(String gonderilecekDosyaContentRoot) {
        String herkesteFarkliOlan = System.getProperty("user.dir");
        String herkesteAyniOlan = gonderilecekDosyaContentRoot;
        String dosyaYolu = herkesteFarkliOlan + herkesteAyniOlan;
    }

    public static void scrollIntoViewJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * bu metot ile JS yolu string olarak verilen elementi JavascriptExecutor kullanarak tiklayabilirim
     *
     * @param javascriptYolu click yapilacak webelement yolu string olarak verilir
     */
    public static void clickJSElementWithJavaScript(String javascriptYolu) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        WebElement webElement = (WebElement) jse.executeScript("return " + javascriptYolu + "");
        jse.executeScript("arguments[0].click();", webElement);

    }

    /**
     * Bu metot ile elementin xpath değeri string olarak verilerek o classtaki text alinir.
     * * @param  xpath text degeri alinmak istenen elementin xpathi string olarak verilir
     *
     * @return
     */
    public static String getTextWithJavaScriptXpath(String xpath) {
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));

        // JavaScriptExecutor kullanarak elementin içeriğini al
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        String text = (String) jsExecutor.executeScript("return arguments[0].textContent;", element);
        return text;
    }

    /**
     * İşlem yapılacak olan webelementin arkaplanını renklendirir
     *
     * @param element etrafi cizilecek element
     * @param driver  driver
     */
    public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String elementColor = element.getCssValue("backgroundColor"); //locate alinan yerin  arka plan rengini alir
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,0,0)", element, driver); //elemente siyah renk verir rgb kizmi rengi belirtir
            //changeColor("rgb(255,0,0)", element, driver); //kirmizi renk
            //changeColor("rgb(0,255,0)", element, driver); //yesil renk
            changeColor(elementColor, element, driver);
        }
    }

    /**
     * flash metoduna renk degistirme islemini yaptirir. Elementin arka plan renginin parametre olarak atanacagini bildirir.
     *
     * @param color   arka plan rengi
     * @param element arka plan rengi degisecek element
     * @param driver
     */
    public static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver; //javascript kodlarini calistirir
        js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element); //elementin renginin degismesini sağlar

        try {
            Thread.sleep(20);
        } catch (Exception e) {

        }
    }

    /**
     * Bu metot islem yapilacak elementin etrafina renkli cerceve cizerek belirgin hale getirir.
     *
     * @param locate islem yapilacak elementin cssSelector turunden locate string olarak girilmeli
     */
    public static void showElementWithFrame(String locate) {
        WebElement element = Driver.getDriver().findElement(By.cssSelector("" + locate + ""));
        String script = "arguments[0].style.border='3px solid red';";
//        String script = "arguments[0].style.border='3px solid white';";
//        String script = "arguments[0].style.border='3px solid yellow';";
//        String script = "arguments[0].style.border='3px solid green';";
        ((JavascriptExecutor) Driver.getDriver()).executeScript(script, element);

    }

    /**
     * Bu metot tıklanacak elementin tıklandığından emin olamk için referans verilen bir elementin
     * görünürlüğü baz alarak tıklama yaptırır.
     */
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

    /**
     * Bu methot girilen @param list webelement dizisinin textinin girilen stringi içerip içermediğini
     * kontrol ediyor.
     */
    public static void checkStringExistonList(List<WebElement> list, List<String> testList) {

        List<String> localArray = new ArrayList<>();
        for (WebElement a : list) {
            localArray.add(a.getText());
        }
        System.err.println("Your list= " + localArray);

        localArray.retainAll(testList);
        for (String a : localArray) {
            String formatText = String.format("%-25s%s", a, " is available on product list");
            System.out.println(formatText);
        }

        // int dataIndex;
        // int j=0;
        // String[] localArray=new String[list.size()];
        // for (WebElement a:list)
        // {
        //     localArray[j]=a.getText();
        //     j++;
        //     System.out.println(a.getText());
        // }
        // for (int i = 0; i <= list.size(); i++) {
        //     dataIndex = Arrays.binarySearch(localArray,testList[i]);
        //     if (dataIndex < 0) {
        //         System.err.println(testList[i] + " is not available in the product list.");
        //     } else {
        //         System.out.println(testList[i] + " is available in the product list.");
        //     }
        // }


    }


    public static void writeArrayonElement(List<String> list, WebElement element, WebElement ref) throws InterruptedException {
        for (String s : list) {
            element.clear();
            element.sendKeys(s);
            Thread.sleep(1000);
            boolean isCorrect = isTextCorrect(ref);
            if (isCorrect) {
                System.out.println(s + " is correct for search");
            } else {
                Assert.fail(s + " is wrong for search");
            }
        }
    }


    public static boolean isTextCorrect(WebElement ref) throws InterruptedException {
        Thread.sleep(3000);
        String[] words = ref.getText().split(" ");
        int sayi = 0;
        try {
            sayi = Integer.parseInt(words[2]);
        } catch (NumberFormatException e) {
            sayi = 0; // set default value the int when we catch exception
            System.err.println("Number conversion error: " + e.getMessage());
        }
        System.out.println("Number of pro/pros: " + sayi);

        if (sayi > 0) {
            return true;
        } else {

            return false;
        }
    }

    public static void writezips(WebElement textBoxforzips, Integer int1) throws InterruptedException {
        textBoxforzips.clear();
        Thread.sleep(1000);
        textBoxforzips.click();
        textBoxforzips.sendKeys(Integer.toString(int1));
        if (int1.toString().length() <= 4 || int1.toString().length() >= 6) {
            Assert.fail("The ZIP code is invalid");
        } else {
            List<WebElement> plumbers = Driver.getDriver().findElements(By.xpath("//*[@class=\"rh-contractor-list-container\"]/div"));
            if (plumbers.size() == 1) {
                if (Driver.getDriver().findElement(By.xpath("//*[contains(text(), \"There are no Pros found matching your search criteria.\")]")).isDisplayed()) {
                    Assert.fail("There are no Pros found matching your search criteria.");
                }
            }
            else System.err.println("There are " + plumbers.size() + "Pros found matching your search criteria.");
        }
    }


    public static void checkRibbonHeaders(List<WebElement> ribbonHeaders, List<String> test) throws InterruptedException {
        for (WebElement header : ribbonHeaders) {
            scroolToElement(header);
            Thread.sleep(1000);
            if (test.contains(header.getText())) {
                System.out.println(String.format("%-25s%s", header.getText(), " is available on ribbon headers list"));
            } else {
                Assert.fail(String.format("%-25s%s", header.getText(), " is not available on ribbon headers list"));
            }

        }
    }

    public static void scroolToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void tryToClick(WebElement element) {

        try {
            if (element.isDisplayed()) {
                element.click();
                System.out.println("Click to: " + element);
            }
        } catch (java.util.NoSuchElementException e) {
            System.out.println(element + " not found");
        }
    }

    /*first element contains second element
     */
    public static void checkTextContainsOtherText(WebElement big, WebElement small) {

        System.out.print("Text to search: ");
        splinterForDot(big.getText());
        System.out.print("Searched text: ");
        splinterForDot(small.getText());
        if (!big.getText().contains(small.getText())) Assert.fail("Does not contains");
        toUppersecondinFirst(big.getText(), small.getText());
    }

    public static void toUppersecondinFirst(String big, String small) {

        int start = big.indexOf(small);
        int end = start + small.length();
        splinterForDot(big.substring(0, start) + big.substring(start, end).toUpperCase() + big.substring(end));


    }

    public static void splinterForDot(String text) {
        Pattern spliter = Pattern.compile("\\.\\s");
        String[] units = spliter.split(text);
        for (String unit : units) {
            System.out.println(unit);
        }

    }

    public static void randomClickonElementList(List<WebElement> list) {
        Random random = new Random();
        int rnd = random.nextInt(list.size());
        System.out.println(list.get(rnd).getText());
        list.get(rnd).click();
    }

    public static void addRandomzipCodeatList(List<String> zipCode, int last) {
        Random random = new Random();
        for (int i = 0; i < last; i++) {
            int rndNumber = 10000 + random.nextInt(90000);
            zipCode.add(Integer.toString(rndNumber));
        }


    }

    public static void clickWhenTextChanced(WebElement element, String currentText, String expectedText) {
        while (true) {
            if (element.getText().equals(currentText))  // Check the text of the element
            {
                element.click(); // Click if it's currentText

                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3)); // Wait until "less" text appears (up to 3 seconds)
                wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
            } else {
                // If it's not expectedText, click again
                element.click();
            }
        }
    }

    public static void createListforHeatingandCoolingProducts(List<String> test) {
        test.add("Furnaces");
        test.add("Air Conditioners");
        test.add("Cooling Coils");
        test.add("Air handlers");
        test.add("Heat Pumps");
        test.add("Mini-Splits");
        test.add("Oil Furnaces");
    }

    public static void createListforHeatingandCoolingRibbons(List<String> test) {
        test.add("RESIDENTIAL AIR");
        test.add("HOME INTEGRATION");
        test.add("SUSTAINABILITY");
        test.add("HEATING & COOLING");
        test.add("FIND A RHEEM PRO");
        test.add("FINANCING");
    }

    public static void createListforHeatingandCoolingZips(List<String> zips) {
        zips.add("12345");
        zips.add("12376");
        zips.add("87654");
        zips.add("30303");
        zips.add("30304");
        zips.add("30324");
        zips.add("30045");
        zips.add("29300");
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
                                Assert.fail("Boyutlar yanlış.");
                            }
                        } else {
                            Assert.fail("Geçersiz boyutlar.");
                        }
                    } else {
                        Assert.fail("Başlık içinde boyutlar bulunamadı.");
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

    public static String switchToNewTab(WebDriver driver, String mainTabHandle) {
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainTabHandle)) {
                driver.switchTo().window(handle);
                return handle;
            }
        }
        return null;
    }

    public static String[] createArrayforImageNames() {
        String[] expectedImagesNames =
                {
                        "res-air-title-desktop.png",
                        "360_Icon.png",
                        "res-air-img-3.png",
                        "EcoNet-White.png", "res-air-intro-econetbezel.png",
                        "GDOG-logo-homepage.png",
                        "GDOG-HCCat-product.png",
                        "RELIABILITY1-FLAG11-product-only3.png",
                        "contractor-sm.png"
                };
        return expectedImagesNames;

    }

    public static String[] createArrayforImageNamesforpoolandspa() {
        String[] expectedImagesNames =
                {
                        "poolspa-title-desktop.png",
                        "ahri-cert-logo.png",
                        "contractor-sm.png",
                        "rheemracing.svg",

                };
        return expectedImagesNames;

    }

    public static String[] createArrayForTanklessCondensingImageNames() {
        String[] expectedImagesNames =
                {
                        "performance-platinum-super-high-efficiency-condensing-tankless-gas-water-heaters-with-built-in-wi-fi-17834ee6-928b-42f6-a5c0-2ef8c725f94e-160x160.png",
                        "rtgh-series-super-high-efficiency-condensing-tankless-gas-water-heaters--a88c81fd-0f6e-4077-9f83-259dc62a9296-160x160.png",
                        "performance-platinum-super-high-efficiency-condensing-tankless-gas-water-heaters-0ea87979-7024-47ae-b931-b117de1e3c45-160x160.png",
                        "rtgh-series-super-high-efficiency-condensing-tankless-gas-water-heater-with-built-in-wi-fi-79dfaf80-fba1-4a4b-943b-a5730732e10c-160x160.png",
                        "rheem-ikonic-super-high-efficiency-condensing-tankless-gas-water-heater-with-recirculating-pump-f099fb2d-860e-46bd-99f8-0901b0708908-160x160.png",
                        "rheem-ikonic-super-high-efficiency-condensing-tankless-gas-water-heater-523ecd63-c565-4a68-af35-2415b6379c94-160x160.png",
                        "rheem-thermaforce-super-high-efficiency-condensing-tankless-gas-water-heaters-d9028fc8-51d7-40f5-be7c-2c9cff38211d-160x160.png",
                        "performance-condensing-tankless-gas-water-heaters-with-built-in-recirculation-62ff5e45-35cc-4070-a757-50d728ee30ce-160x160.png"
                };
        return expectedImagesNames;

    }

    public static void verifyimageActive(WebElement imgElement) {
        int invalidImageCount = 0;
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
        }
    }

    public static void textAssert(WebElement actual, String expected) {
        assertEquals(actual.getText(), expected);
        System.out.println("My Message :" + actual.getText());
    }


    public static void checkImageSrc(WebElement image, String expectedSource) {
        if (image.isDisplayed()) {
            System.out.println("Image is displayed");
            String imageSource = image.getAttribute("src");
            assertEquals(imageSource, expectedSource);
            System.out.println("My Message : True");
        } else {
            System.out.println("Image is not displayed ");

        }
    }


    public static void checkImageUrl(WebElement image, String expectedSource) {
        if (image.isDisplayed()) {
            System.out.println("Image is displayed");
            String imageSource = image.getAttribute("url");
            assertEquals(imageSource, expectedSource);
            System.out.println("My Message : True");
        } else {
            System.out.println("Image is not displayed ");

        }
    }

    public static void homeEnhancementsIntroPageProducts(List<String> test) {
        test.add("EcoNet® Smart Thermostat");
        test.add("Thermostats");
        test.add("Indoor Air Quality");
        test.add("Water Softeners");
    }

    public static String[] homeEnhancementsIntroPageImageNames() {
        String[] expectedImagesNames =
                {
                        "he-title-desktop.png",
                        "EcoNet-CTA1_small.png",
                        "contractor-sm.png",
                        "Arrow.svg",
                        "rheemracing.svg",
                        "rheem-app-icon.svg",
                        "AppleAppStore.svg",
                        "GooglePlay.svg"
                };
        return expectedImagesNames;

    }

    public static void waterHeatingProducts(List<String> testExplorelist) {
        testExplorelist.add("Tankless Water Heaters");
        testExplorelist.add("Hybrid Water Heaters");
        testExplorelist.add("Tank-Type Gas");
        testExplorelist.add("Tank-Type Electric");
        testExplorelist.add("Specialty Water Heaters");
        testExplorelist.add("Tankless Condensing");
        testExplorelist.add("Tankless Non-Condensing");
        testExplorelist.add("Tankless  Mid-Efficiency");
        testExplorelist.add("Tankless Electric");
        testExplorelist.add("Heat Pump Water Heaters");
        testExplorelist.add("Point-of-Use");
        testExplorelist.add("Solar Water Heaters");
        testExplorelist.add("Combination Boiler");
    }


    public static void createListforExpectedtexts(List<String> ribbonsTexts) {
        ribbonsTexts.add("SUSTAINABILITY");
        ribbonsTexts.add("AIR INNOVATIONS");
        ribbonsTexts.add("FINANCING");
        ribbonsTexts.add("WATER INNOVATIONS");
        ribbonsTexts.add("INTEGRATED INNOVATIONS");
        ribbonsTexts.add("HEATING & COOLING");
    }


    public static String[] createArrayforImageNamesforfeatured() {
        String[] expectedImagesNames =
                {
                        "commercialinnovations-title.png",
                        "DOI-logo.png",
                        "commercial-pkg.png",
                        "getfaster-header.png",
                        "rheem-orion.png",
                        "commercial-tankless.png",
                        "Rheem-H2AC_System_HighRes.png",
                        "RELIABILITY1-FLAG1-product-only.png",
                        "res-inno-gal-2.png"
                };
        return expectedImagesNames;
    }


    public static List<String> createlistforfeaturedtitles() {
        List<String> expectedTitles = new ArrayList<>();

        expectedTitles.add("TECHNOLOGY TO GET THE JOB DONE");
        expectedTitles.add("Renaissance");
        expectedTitles.add("Get It Faster");
        expectedTitles.add("Triton");
        expectedTitles.add("Commercial Tankless");
        expectedTitles.add("H2AC");
        expectedTitles.add("Tested. Trusted. Tough.");

        return expectedTitles;
    }


    public static List<String> createlistforWarrantiesHeaders() {
        List<String> expectedHeaders = new ArrayList<>();

        expectedHeaders.add("Register Your Product");
        expectedHeaders.add("Verify Your Warranty");
        expectedHeaders.add("Need Warranty Service?");


        return expectedHeaders;
    }


    public static void checkTittles(List<WebElement> titles, List<String> test) throws InterruptedException {
        for (WebElement title : titles) {
            scroolToElement(title);
            Thread.sleep(1000);
            if (test.contains(title.getText())) {
                System.out.println(String.format("%-25s%s", title.getText(), " title is contains"));
            } else {
                Assert.fail(String.format("%-25s%s", title.getText(), " title is not contains"));
            }
        }
    }

    public static List<String> createlistforfeaturedtexts() {
        List<String> expectedTexts = new ArrayList<>();

        expectedTexts.add("®");
        expectedTexts.add("™");
        expectedTexts.add("Rheem");

        return expectedTexts;
    }

    public static void checkTexts(List<WebElement> texts) {
        for (WebElement text : texts) {
            if (text.getText().contains("®") || text.getText().contains("™") || text.getText().contains("Rheem"))
                System.out.println("The text contains ® or ™ or Rheem");
            else Assert.fail("The text is not contains ® or ™ or Rheem");
        }
    }


    public static void CurrentUrl(String currentUrl, String expectedUrl) {
        System.out.println("Current url: " + currentUrl);
        System.out.println("Expected url: " + expectedUrl);
        if (currentUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Url Matched");
        } else if (currentUrl.contains(expectedUrl)) {
            System.out.println("Url contains expectedUrl");
        } else {
            System.out.println("Not a match");

        }
    }


    public static void compareUrls(List<String> currentUrls, List<String> expectedUrls) {
        if (currentUrls.size() != expectedUrls.size()) {
            throw new IllegalArgumentException("List sizes do not match");
        }

        for (int i = 0; i < currentUrls.size(); i++) {
            String currentUrl = currentUrls.get(i);
            String expectedUrl = expectedUrls.get(i);

            System.out.println("Current url: " + currentUrl);
            System.out.println("Expected url: " + expectedUrl);

            if (currentUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println("Url Matched");
            } else if (currentUrl.contains(expectedUrl)) {
                System.out.println("Url contains expectedUrl");
            } else {
                Assert.fail("Not a match");
            }
        }
    }

    public static void createListforHeatingandCoolingCommercialProducts(List<String> test) {
        test.add("Packaged Air Conditioners");
        test.add("Packaged Heat Pumps");
        test.add("Packaged Gas Electric");
        test.add("Split Air Conditioners");
        test.add("Air Handlers");

    }

    public static void createListforHeatingandCoolingCommercialRibbons(List<String> test) {
        test.add("INTEGRATED SOLUTIONS");
        test.add("RAPIDSPEC™");
        test.add("SUSTAINABILITY");
        test.add("HEATING & COOLING");
        test.add("FIND A RHEEM PRO");
        test.add("FINANCING");
    }

    public static String[] createArrayforImageNamesHeatingAndCoolingCommercial() {
        String[] expectedImagesNames =
                {
                        "comm-title-desktop.png",
                        "renaissance-feature1.png",
                        "GDOG-logo-homepage.png",
                        "DOI-CommRenProductClipped.png",
                        "RELIABILITY1-FLAG11-product-only2.png",
                        "contractor-sm.png"
                };
        return expectedImagesNames;

    }

    public static void createListforHeatingandCoolingCommercialTextHeaders(List<String> test) {
        test.add("Rheem Commercial Heating and Cooling Products");
        test.add("Welcome to the\n" + "Rebirth of Cool");
        test.add("UP TO\n" + "50% OFF\n" + "WATER HEATING COSTS");
        test.add("Spec It Fast");
        test.add("Responsible Comfort\u0003");
        test.add("Tested. Trusted. Tough.");
        test.add("Grow your business With\n" + "Commercial KwikComfort Financing");
    }


    public static void createListforWaterHeatingCommercialProducts(List<String> test) {
        test.add("Commercial Tankless Water Heaters");
        test.add("Commercial Tank-Type Gas Water Heaters");
        test.add("Commercial Tank-Type Electric Water Heaters");
        test.add("Storage Tank");
        test.add("Commercial Heat Pump Water Heater");

    }


    public static String[] createArrayforImageNamesWaterHeatingCommercial() {
        String[] expectedImagesNames =
                {
                        "comm-water-title-desktop.png",
                        "com-water-img-2.png",
                        "GDOG-logo-homepage.png",
                        "DOI-CommTritonProductTaller.png"
                };
        return expectedImagesNames;

    }

    public static void createListforWaterHeatingCommercialTextHeaders(List<String> test) {
        test.add("Rheem Commercial Water Heaters");
        test.add("Ultra Low NOx\n" + "Water Heaters");
        test.add("Rheem Commercial Heat Pump\n" + "Water Heater Split System");
        test.add("Introducing Triton™: The Most Intelligent Water Heater on the Market");
        test.add("Making a Big Difference\u0003\n");
        test.add("Common Vent up to 10 Units");
        test.add("Spec It Fast");
        test.add("Grow your business With\n" + "Commercial KwikComfort Financing");
    }

    public static void createListforWaterHeatingCommercialRibbons(List<String> test) {

        test.add("SUSTAINABILITY");
        test.add("COMMERCIAL WATER");
        test.add("RESOURCES");
        test.add("FIND A RHEEM PRO");
        test.add("FINANCING");
    }

    public static void createListforcommercialProductSizingRevitFilesURL(List<String> test) {
        test.add("https://www.bimobject.com/en-us/Rheem_Manufacturing_Company?location=tr");
        test.add("https://www.rheem.com/revit-files/");
        test.add("http://static.globalimageserver.com/site/rheemdotcom/resources/commercial-resources/docs/Tankless+Piping+Diagrams.pdf");
        test.add("http://static.globalimageserver.com/site/rheemdotcom/resources/commercial-resources/docs/RR118.pdf");
    }


    public static String getExpectedURL(String pages) {
        // Beklenen sayfa URL'sini getirmek için bir switch-case yapısı kullanabilirsiniz
        switch (pages) {
            case "BIM Resources page":
                return "https://www.bimobject.com/en-us/Rheem_Manufacturing_Company?location=tr";
            case "View All Revit Files page":
                return "https://www.rheem.com/revit-files/";
            case "Tankless Installation Diagrams page":
                return "http://static.globalimageserver.com/site/rheemdotcom/resources/commercial-resources/docs/Tankless+Piping+Diagrams.pdf";
            case "Tank Installation Diagrams page":
                return "http://static.globalimageserver.com/site/rheemdotcom/resources/commercial-resources/docs/RR118.pdf";
            default:
                throw new IllegalArgumentException("Invalid page: " + pages);
        }
    }

    public static void createListforExpectedUrls(List<String> expectedUrls) {
        expectedUrls.add("https://www.bimobject.com/en-us/Rheem_Manufacturing_Company?location=tr");
        expectedUrls.add("https://www.rheem.com/revit-files/");
        expectedUrls.add("http://static.globalimageserver.com/site/rheemdotcom/resources/commercial-resources/docs/Tankless+Piping+Diagrams.pdf");
        expectedUrls.add("http://static.globalimageserver.com/site/rheemdotcom/resources/commercial-resources/docs/RR118.pdf");

    }


    public static void clickButtonAndHandleWindow(List<String> visitedURLProductSizing, WebDriver driver) {
        String mainWindowHandle = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        visitedURLProductSizing.add(driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(mainWindowHandle);
    }


    public static void clickButton(commercialProductSizingPage page, String button) {

        List<WebElement> revitFiles = page.revitFiles;
        List<WebElement> getItSized = page.getItSized;
        List<WebElement> industries = page.industries;
        List<WebElement> role = page.role;


        switch (button) {
            case "BIM Resources":
                revitFiles.get(0).click();
                break;
            case "View All Revit Files":
                revitFiles.get(1).click();
                break;
            case "Tankless Installation Diagrams":
                revitFiles.get(2).click();
                break;
            case "Tank Installation Diagrams":
                revitFiles.get(3).click();
                break;

            case "RapidSpec™":
                getItSized.get(0).click();
                break;

            case "Get Help from a Pro":
                getItSized.get(1).click();
                break;

            case "Hospitality":
                industries.get(0).click();
                break;

            case "Education":
                industries.get(1).click();
                break;

            case "Healthcare":
                industries.get(2).click();
                break;

            case "Restaurants":
                industries.get(3).click();
                break;

            case "Energy":
                industries.get(4).click();
                break;
            case "Retail":
                industries.get(5).click();
                break;

            case "Spec Engineers":
                role.get(0).click();
                break;

            case "Commercial Contractors":
                role.get(1).click();

            default:

                throw new IllegalArgumentException("Invalid button: " + button);
        }
    }


    public static void clickButtonWarrantiesForm(warrantiesFormPage page, String Button) {

        List<WebElement> panelButtons = page.panelButtons;

        switch (Button) {
            case "water heating":
                panelButtons.get(0).click();
                String waterHeating = Driver.getDriver().getCurrentUrl();
                assertEquals("https://rheem.registermyunit.com/", waterHeating);
                System.out.println("Button 'water heating' redirected to the correct page: " + waterHeating);
                break;
            case "heating and cooling":
                panelButtons.get(1).click();
                String heatingCooling = Driver.getDriver().getCurrentUrl();
                assertEquals("https://rheem.registermyunit.com/", heatingCooling);
                System.out.println("Button 'heating and cooling' redirected to the correct page: " + heatingCooling);
                break;
            case "pool and spa":
                panelButtons.get(2).click();
                String poolSpa = Driver.getDriver().getCurrentUrl();
                assertEquals("https://raypak.registermyunit.com/", poolSpa);
                System.out.println("Button 'pool and spa' redirected to the correct page: " + poolSpa);
                break;
            case "water heating verify":
                panelButtons.get(3).click();
                String waterHeatingVerify = Driver.getDriver().getCurrentUrl();
                assertEquals("https://rheem.registermyunit.com/", waterHeatingVerify);
                System.out.println("Button 'water heating verify' redirected to the correct page: " + waterHeatingVerify);
                break;
            case "heating and cooling verify":
                panelButtons.get(4).click();
                String heatingCoolingVerify = Driver.getDriver().getCurrentUrl();
                assertEquals("https://rheem.registermyunit.com/", heatingCoolingVerify);
                System.out.println("Button 'heating and cooling verify' redirected to the correct page: " + heatingCoolingVerify);
                break;
            default:
                throw new IllegalArgumentException("Invalid button: " + Button);
        }

    }


    public static void checkTexss(List<WebElement> texts, List<String> test) throws InterruptedException {
        for (WebElement text : texts) {
            if (test.contains(text.getText())) {
                System.out.println(String.format("%-25s%s", text.getText(), " is available on list"));
            } else {
                System.out.println(String.format("%-25s%s", text.getText(), " is not available on list"));
            }

        }
    }


    public static void createListforPartsNavigationPanelTexts(List<String> test) {

        test.add("parts");
        test.add("Air Conditioning & Heating");
        test.add("Consumer");
        test.add("Business");
        test.add("Water Heating");
        test.add("Tank");
        test.add("Consumer");
        test.add("Business");
        test.add("Tankless");
        test.add("Gas");
        test.add("Consumer");
        test.add("Business");
        test.add("Electric");
        test.add("consumer");
    }


    public static void hoverwhenDisplayed(WebElement hover, WebElement display) throws InterruptedException {
        do {
            System.out.println(display.getText() + "button is not visible");
            hover(hover);
            System.out.println(hover.getText() + " button was hover");
            Thread.sleep(500);
        }
        while (!display.isDisplayed());
        System.out.println(display.getText() + " button is visible");
    }

    public static void checkTextsCommerical(List<WebElement> texts) {
        for (WebElement text : texts) {
            if (text.getText().contains("commercial")) {
                System.out.println("++++++++++++++++");
                System.out.println(text.getText());
                System.out.println("The text contains commercial");
                System.out.println("++++++++++++++++");

            } else {
                System.out.println("---------------------------");
                System.out.println(text.getText());
                System.out.println("The text is not contains commercial ");
                System.out.println("---------------------------");


            }
            ;
        }
    }

    public static void createListforHeatingAndCoolingCommercialTexts(List<String> test) {

        test.add("parts");
        test.add("Air Conditioning & Heating");
        test.add("Consumer");
        test.add("Business");
        test.add("Water Heating");
        test.add("Tank");
        test.add("Consumer");
        test.add("Business");
        test.add("Tankless");
        test.add("Gas");
        test.add("Consumer");
        test.add("Business");
        test.add("Electric");
        test.add("consumer");
    }

    public static void clickButtonAndHandleWindows(List<String> visitedURLProductSizings, WebDriver driver) {
        String mainWindowHandle = driver.getWindowHandle();

        commercialProductSizingPage page = new commercialProductSizingPage();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        visitedURLProductSizings.add(driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(mainWindowHandle);
    }

    public static void createListforExpectedUrlsGetItSized(List<String> expectedUrlsGetItSized) {

        expectedUrlsGetItSized.add("http://www.rapidspec.com/");
        expectedUrlsGetItSized.add("https://www.rheem.com/products/commercial/commercial_resource_center/commercial-project-sizing-selection-solutions/");


    }



  /*  public static void selectDropdownValues(WebDriver driver, String dropdownLocator, Map<String, String> options) {
        for (Map.Entry<String, String> entry : options.entrySet()) {
            String optionValue = entry.getValue();

            WebElement dropdown = driver.findElement(By.xpath(dropdownLocator));
            dropdown.click();

            WebElement option = driver.findElement(By.xpath("//li[normalize-space()='" + optionValue + "']"));
            option.click();
        }


    }*/

    public static void selectDropdownValuesOnlineClaimSubmission(WebDriver driver, Map<String, String> options) {
        String optionValue = null;
        String dropdownName = null;
        try {
            for (Map.Entry<String, String> entry : options.entrySet()) {
                dropdownName = entry.getKey();
                optionValue = entry.getValue();

                WebElement dropdown = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap " + dropdownName + "']//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']"));
                dropdown.click();

                WebElement option = driver.findElement(By.xpath("//li[normalize-space()='" + optionValue + "']"));
                option.click();
            }
        } catch (NoSuchElementException e) {

            throw new RuntimeException("Hata: " + dropdownName + " dropdown'ı veya " + optionValue + " seçeneği bulunamadı.");

        }
    }

    public static void fileSizeControl(String path) {
        File file = new File(path);
        long fileSize = file.length();
        System.err.println(fileSize <= Math.pow(2, 20) ? "Less than 10MB" : "Higher than 10MB" + "\nThe file size= " + fileSize);
    }


    public static void controltheName(String arg0, String text) {
        if (arg0.isEmpty()) {
            Assert.fail("The " + text + " field musn't be empty.");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a)) {
                    Assert.fail("The " + text + " must be alphabetic.");
                    break;
                }
            }
        }
    }


    public static void controltheZip(String arg0, String text) {
        if (arg0.isEmpty()) {
            System.err.println("The " + text + " field musn't be empty.");
            Assert.fail("The " + text + " field musn't be empty.");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isAlphabetic(a) && !Character.isDigit(a)) {
                    Assert.fail("The " + text + " must be alphabetic or numeric.");
                    break;
                }
            }
        }
    }


    public static void selectDropdownValuesPoolAndSpaContact(WebDriver driver, Map<String, String> options) {
        String optionValue = null;
        String dropdownName = null;
        try {
            for (Map.Entry<String, String> entry : options.entrySet()) {
                dropdownName = entry.getKey();
                optionValue = entry.getValue();

                WebElement dropdown = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap " + dropdownName + "']//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']"));
                dropdown.click();

                WebElement option = driver.findElement(By.xpath("//option[normalize-space()='" + optionValue + "']"));
                option.click();
            }
        } catch (NoSuchElementException e) {

            throw new RuntimeException("Hata: " + dropdownName + " dropdown'ı veya " + optionValue + " seçeneği bulunamadı.");

        }
    }

    public static void selectDropdownValuesPoolAndSpaSelectSubtopic(WebDriver driver, Map<String, String> options) {
        String optionValue = null;
        String dropdownName = null;
        try {
            for (Map.Entry<String, String> entry : options.entrySet()) {
                dropdownName = entry.getKey();
                optionValue = entry.getValue();

                WebElement dropdown = driver.findElement(By.xpath("//span[@class='wpcf7-form-control-wrap " + dropdownName + "']//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control']"));
                dropdown.click();

                WebElement option = driver.findElement(By.xpath("//option[normalize-space()='" + optionValue + "']"));
                option.click();
            }
        } catch (NoSuchElementException e) {

            throw new RuntimeException("Hata: " + dropdownName + " dropdown'ı veya " + optionValue + " seçeneği bulunamadı.");
        }

    }

    public static void controltheMail(String arg0, String text) {
        if (arg0.isEmpty()) {
            Assert.fail("The " + text + " field musn't be empty.");
        } else {
            if (!arg0.contains("@") && !arg0.contains(".com")) {
                Assert.fail("The e-mail address entered is invalid.");
            }
        }
    }

    public static void controlthePhone(String arg0, String text) {
        if (arg0.isEmpty()) {
            Assert.fail("The " + text + " field musn't be empty.");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isDigit(a)) {
                    Assert.fail("The " + text + " must be numeric.");
                    break;
                }
            }
        }
    }

    public static void controlthePhonewithlenght(String arg0, String text) {
        if (arg0.isEmpty()) {
            Assert.fail("The " + text + " field musn't be empty.");
        } else if (arg0.length() <= 9) {
            Assert.fail("The phone number is too short");
        } else {
            for (char a : arg0.toCharArray()) {
                if (!Character.isDigit(a)) {
                    Assert.fail("The " + text + " must be numeric.");
                    break;
                }
            }

        }
    }


    public static void checkTittle(String expectedTitle) {

        String currentTittle = Driver.getDriver().getTitle();
        System.out.println("Current title: " + Driver.getDriver().getTitle());
        System.out.println("Expected title: " + expectedTitle);
        assertEquals(currentTittle, expectedTitle);

        try {
            currentTittle.equalsIgnoreCase(expectedTitle);
            System.out.println("Title Matched");
        } catch (Exception e) {
            System.out.println("Not a match " + e.getMessage());
        }

      /*  if (currentTittle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else if (currentTittle.contains(expectedTitle)) {
            System.out.println("Title contains expectedTitle");
        } else {

            System.out.println("Not a match");
        }

       */
    }
}