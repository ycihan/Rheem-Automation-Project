package rheemProject.pages.apacPages.asia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class homePageAsia {
    public homePageAsia() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div[4]/a")
    public WebElement asiaContact;

}
