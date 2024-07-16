package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class waterHeatingPage {
    public waterHeatingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='products']")
    public WebElement productsBtn;

    @FindBy(xpath = "(//h6)[3]")
    public WebElement waterHeating;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement acceptAll;

    @FindBy(xpath = "//input[@class='rh-pro-currentzipcode ng-valid ng-dirty ng-valid-parse ng-empty ng-touched']")
    public WebElement prosArround;

    @FindBy(xpath = "(//a[@class='btn btn-primary inverted inline'])[3]")
    public WebElement viewMorePro;

    @FindBy(xpath = "//a[@href='https://www.rheem.com/products/residential/water-heating/tankless/']")
    public WebElement TanklessWaterHeaters;

    @FindBy(xpath = "(//span[@class='rh-h1'])[1]")
    public WebElement twhText;

    @FindBy(xpath = "//a[@href='/products/residential/water-heating/tank/residential_gas/']")
    public  WebElement gasTwh;

    @FindBy(id = "1")
    public WebElement residential;

    @FindBy(xpath = "//h2[@class='sectiontitle']")
    public WebElement resWaterHeatersHeader;

    @FindBy(xpath = "//div[@class='col-md-12 text']")
    public WebElement resWaterHeatersText;

    @FindAll({
            @FindBy(xpath = "//ul[@class='explorelist']/li[1]"),@FindBy(xpath = "//ul[@class='explorelist']/li[2]"),
            @FindBy(xpath = "//ul[@class='explorelist']/li[3]"),@FindBy(xpath = "//ul[@class='explorelist']/li[4]"),
            @FindBy(xpath = "//ul[@class='explorelist']/li[5]"),@FindBy(xpath = "//ul[@class='explorelist']/li[6]"),
            @FindBy(xpath = "//ul[@class='explorelist']/li[7]"),@FindBy(xpath = "//ul[@class='explorelist']/li[8]"),
            @FindBy(xpath = "//ul[@class='explorelist']/li[9]"),@FindBy(xpath = "//ul[@class='explorelist']/li[10]"),
            @FindBy(xpath = "//ul[@class='explorelist']/li[11]"),@FindBy(xpath = "//ul[@class='explorelist']/li[12]"),
            @FindBy(xpath = "//ul[@class='explorelist']/li[13]"),
    })
    public List<WebElement> explorelist;


    @FindBy(xpath = "//div[@class=\'more-btn red\']")
    public WebElement moreButton;




















}
