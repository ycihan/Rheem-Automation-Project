package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class rheemHomePage {
    public rheemHomePage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = " //*[@class=\"products\"]")
    public WebElement productsButton;
    @FindBy(id = "2")
    public WebElement commercialButton;
    @FindBy(xpath = "(//*[@data-gtmobject=\"Warranties\"])[1]")
    public WebElement warrantiesButton;
    @FindBy(id = "parts-selector")
    public WebElement partsdropdown;
    @FindBy(id = "resource-selector")
    public WebElement resourcesdropdown;
    @FindBy(xpath = "(//*[@class=\"dropdown-item\"])[3]")
    public WebElement consumerButton;
    @FindBy(xpath = "(//*[@class=\"dropdown-item\"])[4]")
    public WebElement businessButton;
    @FindBy(xpath = "//*[@data-gtmlocation=\"residential-resources-nav\"]")
    public WebElement residentialresourcesButton;
    @FindBy(xpath = "//*[@data-gtmlocation=\"commercial-resources-nav\"]")
    public WebElement commercialresourcesButton;
    @FindBy(xpath = "//*[@data-gtmlocation=\"rebace-center-nav\"]")
    public WebElement rebacecenterButton;
    @FindBy(xpath = "//*[@data-gtmlocation=\"ilc-training-nav\"]")
    public WebElement ilctrainingButton;
    @FindBy(xpath = "//*[@data-gtmlocation=\"rheem-academy-nav\"]")
    public WebElement rheemacademy;
    @FindBy(xpath = "(//*[@data-gtmlocation=\"water-heating-blog-nav\"])[1]")
    public WebElement waterheatingblogButton;
    @FindBy(xpath = "(//*[@data-gtmlocation=\"water-heating-blog-nav\"])[2]")
    public WebElement airconditioningButton;
    @FindBy(xpath = "//*[@data-gtmlocation=\"faq-resources-nav\"]")
    public WebElement faqresources;
    @FindBy(xpath = "//div/a[@data-gtmobject=\"Sustainability\"]")
    public WebElement sustainbilityButton;
    @FindBy(xpath = "//div/a[@data-gtmobject=\"Careers\"]")
    public WebElement careersButton;
    @FindBy(xpath = "//div/a[@data-gtmobject=\"Contact\"]")
    public WebElement contactButton;
    @FindBy(xpath = "//div/a[@data-gtmobject=\"Partners\"]")
    public WebElement partnersButton;
    @FindBy(xpath = "//div/a[@data-gtmobject=\"Why Rheem\"]")
    public WebElement whyrheemButton;
    @FindBy(xpath = "//div/a[@data-gtmobject=\"Find a Pro\"]")
    public WebElement findaproButton;
    @FindBy(xpath = "//*[@class=\"fa fa-caret-down secondToggle\"]")
    public WebElement contrydropdownButton;
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookie;
    @FindBy(xpath = "(//*[@class=\"navtitlewrapper matchcol\"])[2]")
    public WebElement heatingandcoolingButton;
    @FindBy(xpath = "(//*[@class=\"navtitlewrapper matchcol\"])[1]")
    public WebElement featuredInnovationButton;
    @FindBy(xpath = "(//*[contains(@href, \"_commercial/\")])[1]")
    public WebElement featuredButton;
    @FindBy(id = "1")
    public WebElement residentialButton;
    @FindBy(xpath = "//*[@class=\"panel   autoposition\"]/p")
    public WebElement textP;
    @FindBy(xpath = "//*[contains(@class,\"leftside col-12\")]/div/h2/strong")
    public WebElement header;
    @FindBy(xpath = "//*[@class=\"exploregradient\"]/div[2]")

    public WebElement moreButton;
     @FindBy(id = "menu-item-5565")
      public WebElement tanklessCondensing;
    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[1]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[2]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[3]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[4]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[5]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[6]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[7]/a"),
            })
    public List<WebElement> productList;
    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[1]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[2]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[3]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[4]/a")
            })
    public List<WebElement> productlistforpool;
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
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[4] "),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[8]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[10]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[11]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[12]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[13]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[14]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[15]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[16]"),

            })
    public List<WebElement> images;
    @FindBy(xpath = "//*[contains(@class,\"rh-pro-\")]")
    public WebElement findArheemPro;
    @FindBy(xpath = "(//*[@class=\"ng-binding\"])")
    public WebElement weFoundText;
    @FindBy(xpath = "(//*[@class=\"navtitlewrapper matchcol\"])[4]")
    public WebElement poolandspaButton;




}
