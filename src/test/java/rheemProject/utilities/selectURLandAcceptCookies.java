package rheemProject.utilities;

import org.openqa.selenium.By;

public class selectURLandAcceptCookies {
    public static void goTo(String siteName)
    {
        switch (siteName)
        {

            case "rheem":
                Driver.getDriver().get(configurationReader.getProperty("rheem"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "rheemIAT":
                Driver.getDriver().get(configurationReader.getProperty("rheemIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "rheemUAT":
                Driver.getDriver().get(configurationReader.getProperty("rheemUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "canada":
                Driver.getDriver().get(configurationReader.getProperty("canada"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "canadaIAT":
                Driver.getDriver().get(configurationReader.getProperty("canadaIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "canadaUAT":
                Driver.getDriver().get(configurationReader.getProperty("canadaUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "asia":
                Driver.getDriver().get(configurationReader.getProperty("asia"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "asiaIAT":
                Driver.getDriver().get(configurationReader.getProperty("asiaIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "asiaUAT":
                Driver.getDriver().get(configurationReader.getProperty("asiaUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "indonesia":
                Driver.getDriver().get(configurationReader.getProperty("indonesia"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "indonesiaIAT":
                Driver.getDriver().get(configurationReader.getProperty("indonesiaIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "indonesiaUAT":
                Driver.getDriver().get(configurationReader.getProperty("indonesiaUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "singapore":
                Driver.getDriver().get(configurationReader.getProperty("singapore"));
                try
                {
                    Driver.getDriver().findElement(By.xpath("//*[@class=\"pum-close popmake-close\"]")).click();
                }
                catch (Exception e)
                {
                    System.out.println("The close button not found");
                }
                cookiesManager.acceptCookies(siteName);
                break;
            case "singaporeIAT":
                Driver.getDriver().get(configurationReader.getProperty("singaporeIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "singaporeUAT":
                Driver.getDriver().get(configurationReader.getProperty("singaporeUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "philippines":
                Driver.getDriver().get(configurationReader.getProperty("philippines"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "philippinesIAT":
                Driver.getDriver().get(configurationReader.getProperty("philippinesIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "philippinesUAT":
                Driver.getDriver().get(configurationReader.getProperty("philippinesUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "vietnam":
                Driver.getDriver().get(configurationReader.getProperty("vietnam"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "vietnamIAT":
                Driver.getDriver().get(configurationReader.getProperty("vietnamIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "vietnamUAT":
                Driver.getDriver().get(configurationReader.getProperty("vietnamUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "malaysia":
                Driver.getDriver().get(configurationReader.getProperty("malaysia"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "malaysiaIAT":
                Driver.getDriver().get(configurationReader.getProperty("malaysiaIAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "malaysiaUAT":
                Driver.getDriver().get(configurationReader.getProperty("malaysiaUAT"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "onlineclaimsubmission":
                Driver.getDriver().get(configurationReader.getProperty("onlineclaimsubmission"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "weatherking":
                Driver.getDriver().get(configurationReader.getProperty("weatherking"));
                cookiesManager.acceptCookies(siteName);
                break;
            case "productSizing":
                Driver.getDriver().get(configurationReader.getProperty("productSizing"));
                cookiesManager.acceptCookies(siteName);
                default:
                break;

        }
    }
}
