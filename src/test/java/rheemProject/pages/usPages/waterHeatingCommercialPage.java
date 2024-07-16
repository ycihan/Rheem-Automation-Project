package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class waterHeatingCommercialPage {
    public waterHeatingCommercialPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@class='products']")
    public WebElement productsButton;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookieButton;

    @FindBy(id = "2")
    public WebElement commercialButton;
    @FindBy(xpath = "(//div/a[@href='/products/commercial/water-heating/'])[2]")
    public  WebElement waterHeatingButton;
    @FindBy(xpath="//div[@class='more-btn red']")
    public WebElement moreButtonWaterHeatingProducts;
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    public WebElement lessButton;
    @FindBy(xpath = "//a[normalize-space()='commercial tankless water heaters']")
    public WebElement  commercialTanklessWaterHeaterslink;

    @FindAll
            ({
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[4]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[8]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[9]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[10]"),


            })
    public List<WebElement> images;
    @FindAll
            ({
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[1]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[2]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[3]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[4]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[5]"),

            })
    public List<WebElement> ribbonHeadersW;
    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[1]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[2]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[3]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[4]/a"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[5]/a"),
            })
    public List<WebElement> productListWaterHeatingC;

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



}
