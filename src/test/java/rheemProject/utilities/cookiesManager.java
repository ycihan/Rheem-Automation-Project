package rheemProject.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

public class cookiesManager {

    public static void acceptCookies(String siteName) {
        if (isCookiePopupPresent(siteName))
        {
            if(siteName.contains("rheem"))
            {
                Driver.getDriver().findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
            }
            else
            {
                Driver.getDriver().findElement(By.xpath("//span[@class=\"btn btn-primary\"]")).click();
            }
        }
    }

    public static boolean isCookiePopupPresent(String siteName) {
        try
        {
            if(siteName.contains("rheem"))
            {
                Thread.sleep(2000);
                return Driver.getDriver().findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).isDisplayed();
            }
            else
            {
                Thread.sleep(2000);
                return Driver.getDriver().findElement(By.xpath("//span[@class=\"btn btn-primary\"]")).isDisplayed();
            }
        }
        catch (NoSuchElementException | InterruptedException e)
        {
            return false;
        }
    }
}


