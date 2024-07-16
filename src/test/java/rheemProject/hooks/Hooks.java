package rheemProject.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import rheemProject.utilities.BaseClass;
import rheemProject.utilities.Driver;

public class Hooks extends BaseClass {

    @Before
    public void beforeScenario(){

    }
    @After
    public void afterScenario(io.cucumber.java.Scenario sc) {
        System.out.println("This will run after the Scenario");
        if (sc.isFailed())
        {
            TakesScreenshot ts = (TakesScreenshot) Driver.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshot, "image/png", "Screenshot attached for failed scenario");
        }
        else
        {
            TakesScreenshot ts = (TakesScreenshot) Driver.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshot, "image/png", "Screenshot attached for successful scenario");

        }
    }
}
