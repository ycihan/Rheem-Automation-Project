package rheemProject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//To make reports more readable
                "html:target/default-cucumber-reports.html",
                "json:target/default-cucumber-reports.json",
                "junit:target/default-cucumber-reports.xml",
        },
        monochrome = true,//To make reports appear legible in the console
        features = "src/test/resources/features",//features folder path
        glue = {"rheemProject/stepdefinitions","rheemProject/hooks"},
        tags = "@demo",
        dryRun = false
)
public class runner
{

}
