package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;


public class heatingandcoolingPage {
    public heatingandcoolingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookie;
    @FindBy(xpath = "(//*[@class=\"navtitlewrapper matchcol\"])[2]")
    public WebElement heatingandcoolingButton;
    @FindBy(xpath = "(//*[@class=\"navtitlewrapper matchcol\"])[1]")
    public WebElement featuredInnovationButton;
    @FindBy(id = "1")
    public WebElement residentialButton;

    @FindAll
            ({
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[1]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[2]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[3]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[4]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[5]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[6]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[7]"),
            })
    public List<WebElement> ribbonHeaders;
    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[1]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[2]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[3]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[4]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[5]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[6]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[7]"),
            })
    public List<WebElement> productList;
    @FindBy(xpath = "//*[@class=\"panel   autoposition\"]/p")
    public WebElement textP;
    @FindBy(xpath = "//*[contains(@class,\"leftside col-12\")]/div/h2/strong")
    public WebElement header;
    @FindBy(className = "more-btn red")
    public WebElement moreButton;
    @FindBy(className = "rh-pro-currentzipcode ng-pristine ng-valid ng-empty ng-touched")  //yok
    public WebElement findArheemPro;
    @FindBy(xpath = "(//*[@class=\"btn btn-primary inverted inline ng-scope se-menu-button\"])[1]") //yok
    public WebElement bookNowButton;

}
