package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class findaproPage {
    public findaproPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement waterandheatingRadioButton;
    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement heatingandcoolingRadioButton;
    @FindBy(xpath = "(//*[@type='radio'])[3]")
    public WebElement poolandspaRadioButton;
    @FindBy(xpath = "(//*[@type='radio'])[4]")
    public WebElement allRadioButton;
    @FindBy(xpath = "(//*[@type=\"button\"])[3]")
    public WebElement searchButton;
    @FindBy(xpath = "//*[@ng-model='zip']")
    public WebElement textBoxforzips;
    @FindBy(xpath = "(//*[@class=\"mb-2 se-menu-button rh-book-now-btn\"])[1]")
    public WebElement refButton;
    @FindBy(xpath = "//div/div/h2[@class=\"ng-binding\"]")
    public WebElement refText;
    @FindBy(xpath = "//*[@class=\"ng-pristine ng-valid ng-empty ng-touched\"]")
    public WebElement authorizedCheckBox;
}
