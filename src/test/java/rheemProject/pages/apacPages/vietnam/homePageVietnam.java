package rheemProject.pages.apacPages.vietnam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class homePageVietnam {

    public homePageVietnam() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='wpml-ls-link'])[1]") //vietnam sayfası, ingilizce dil butonu
    public WebElement vietnamLanguageBtnEnglish;

    @FindBy(xpath = "(//a[@class='wpml-ls-link'])[2]") //vietnam sayfası, vietnamca dil butonu
    public WebElement vietnamLanguageBtnVietnamese;
}
