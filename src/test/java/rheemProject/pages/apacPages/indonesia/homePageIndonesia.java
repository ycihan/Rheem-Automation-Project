package rheemProject.pages.apacPages.indonesia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class homePageIndonesia{
    public homePageIndonesia() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//span[@class='wpml-ls-native'])[1]") //endonezya sayfası, ingilizce dil butonu
    public WebElement indonesiaLanguageBtnEnglish;

    @FindBy(xpath = "(//span[@class='wpml-ls-native'])[2]") //endonezya sayfası, endonezce dil butonu
    public WebElement indonesiaLanguageBtnIndonesian;

}
