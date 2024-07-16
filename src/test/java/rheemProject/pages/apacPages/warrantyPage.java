package rheemProject.pages.apacPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class warrantyPage {
    public warrantyPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(name = "fullName")
    public WebElement fullname;
    @FindBy(name = "addressLine1")
    public WebElement addressLine1;
    @FindBy(name = "addressLine2")
    public WebElement addressLine2;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "country")
    public WebElement country;
    @FindBy(name = "zipPostalCode")
    public WebElement zipPostalCode;
    @FindBy(name = "phone")
    public WebElement phone;
    @FindBy(name = "email")
    public WebElement email;
    @FindBy(name = "SerialNumber")
    public WebElement serialnumber;
    @FindBy(id = "cf7mls-next-btn-cf7mls_step-1")
    public WebElement nextButton1;
    @FindBy(id = "cf7mls-next-btn-cf7mls_step-2")
    public WebElement nextButton2;
    @FindBy(name ="purchase-price")
    public WebElement purchasePrice;
    @FindBy(name ="your-date")
    public WebElement purchaseDate;
    @FindBy(name ="promo-code")
    public WebElement promecode;
    @FindBy(name ="where-did-you-purchase")
    public WebElement wheredidyou;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap find-out-about-rheem\"]/div[@class=\"nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required niceselect\"]")
    public WebElement wheredidyoudropdown;

    @FindBy(name ="your-file")
    public WebElement choosefile;
    @FindBy(xpath ="//*[@value=\"Submit\"]")
    public WebElement submitButton;
    @FindBy(xpath = "(//*[@style=\"display: block;\"])[1]")
    public WebElement warningText;
    @FindBys
            ({
                    @FindBy(className = "wpcf7-not-valid-tip")
            })
    public List<WebElement> warningtexts;


}
