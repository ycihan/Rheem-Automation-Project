package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class partsNavigationPanelPage {
    public partsNavigationPanelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookieButton;

    @FindBy(id = "parts-selector")
    public WebElement partsButton;






    @FindAll
            ({
                    @FindBy(id = "parts-selector-a"),
                    @FindBy(xpath = "//span[normalize-space()='Air Conditioning & Heating']"),
                    @FindBy(xpath = "//div[@id='parts-options']//a[1]"),
                    @FindBy(xpath = "//div[@id='parts-selector']//a[2]"),
                    @FindBy(xpath = "//span[normalize-space()='Water Heating']"),
                    @FindBy(xpath = "//span[normalize-space()='Tank']"),
                    @FindBy(xpath = "//div[@id='parts-selector']//a[3]"),
                    @FindBy(xpath = "//div[@id='parts-selector']//a[4]"),
                    @FindBy(xpath = "//span[normalize-space()='Tankless']"),
                    @FindBy(xpath = "//span[normalize-space()='Gas']"),
                    @FindBy(xpath = "//div[@id='parts-selector']//a[5]"),
                    @FindBy(xpath = "//div[@id='parts-selector']//a[6]"),
                    @FindBy(xpath = "//span[normalize-space()='Electric']"),
                    @FindBy(xpath = "//a[@href='https://parts.eemax.com/']")


            })
    public List<WebElement> texts;



    @FindBy(xpath = "//div[@id='parts-options']//a[1]")
    public WebElement airConditioningHeatingConsumerButton;
    @FindBy(xpath = "//div[@id='parts-options']//a[2]")
    public WebElement airConditioningHeatingBusinessButton;

    @FindBy(xpath = "//div[@id='parts-options']//a[3]")
    public WebElement waterHeatingTankConsumerButton;
    @FindBy(xpath = "//div[@id='parts-options']//a[4]")
    public WebElement waterHeatingTankBusinessButton;

    @FindBy(xpath ="//div[@id='parts-options']//a[5]")
    public WebElement tanklessGasConsumerButton;

    @FindBy(xpath ="//div[@id='parts-options']//a[6]")
    public WebElement tanklesGasBusinessButton;

    @FindBy(xpath = "//a[@href='https://parts.eemax.com/']")
    public WebElement electricConsumerButton;




}
