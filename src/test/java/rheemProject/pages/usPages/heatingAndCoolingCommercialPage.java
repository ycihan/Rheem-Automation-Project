package rheemProject.pages.usPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

import static rheemProject.utilities.Driver.driver;

public class heatingAndCoolingCommercialPage {
    public heatingAndCoolingCommercialPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookieButton;
    @FindBy(xpath = " //*[@class=\"products\"]")
    public WebElement productsButton;
    @FindBy(id = "2")
    public WebElement commercialButton;
    @FindBy(xpath = "(//div/a[@href=\"/products/commercial/heating-and-cooling/\"])[2]")
    public  WebElement heatingCoolingButton;
    @FindBy(xpath="//div[@class='more-btn red']")
    public WebElement moreButton;
    @FindAll
            ({
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[4]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[8]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[9]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[10]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[11]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[12]"),

            })
    public List<WebElement> images;
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
    public List<WebElement> ribbonHeadersH;
    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[1]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[2]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[3]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[4]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[5]/a"),
            })
    public List<WebElement> productListHeatingCoolingC;

    @FindAll
            ({
                    @FindBy(xpath = "//h2[contains(@class,'sectiontitle')]"),
                    @FindBy(xpath = "//strong[contains(text(),'Welcome to the')]"),
                    @FindBy(xpath = "//div[contains(@class,'maincontentside col-md-10')]//h3[1]"),
                    @FindBy(xpath = "//h2[normalize-space()='Spec It Fast']"),
                    @FindBy(xpath = "//strong[normalize-space()='Responsible Comfort\u0003']"),
                    @FindBy(xpath = "//h2[normalize-space()='Tested. Trusted. Tough.']"),
                    @FindBy(xpath = "//em[normalize-space()='Commercial KwikComfort Financing']"),
            })
    public List<WebElement> textHeaders;


    //div[@class='leftside col-12 col-lg-6 order-2 order-md-2 ']/style
    @FindBy(xpath ="//div[@class='leftside col-12 col-lg-6 order-2 order-md-2 ']/style")
    public WebElement rapidSpecStyleImage;
    @FindBy(xpath = "//li[contains(text(),'– Improved energy savings of over 30% when compare')]")
    public WebElement demo;

    @FindBy (css="#reallycost.lazy-background.visible")
    public WebElement elementWithBackgroundText;

    @FindBy (css="#reallycost.lazy-background.visible")
    public WebElement BackgroundImage;


    // String backgroundImageUrl = elementWithBackground.getCssValue("background-image");

}
