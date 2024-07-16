package rheemProject.pages.ruudPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class contactPageRuud {
    public contactPageRuud() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "fullName")
    public WebElement fullName;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap country\"]/select[@class=\"wpcf7-form-control wpcf7-select form-control\"]")
    public WebElement country;
    @FindBy(name = "address")
    public WebElement addresss;
    @FindBy(name = "city")
    public WebElement cityy;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap state\"]/select[@class=\"wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control\"]")
    public WebElement states;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap state\"]/select[@class=\"wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control\"]/option")
    public WebElement statesoptions;
    @FindBy(name="zipcode")
    public WebElement zipcode;
    @FindBy(name="email")
    public WebElement emaill;
    @FindBy(name="phone")
    public WebElement phone;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap topic\"]/select[@class=\"wpcf7-form-control wpcf7-select form-control\"]")
    public WebElement topic;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap subtopic\"]/select[@class=\"wpcf7-form-control wpcf7-select form-control\"]")
    public WebElement subtopic;
    @FindBy(name="modelNumber")
    public WebElement modelNumber;
    @FindBy(name="serialNumber")
    public WebElement serialNumber;
    @FindBy(xpath = "(//*[@name=\"contractorName\"])[1]")
    public WebElement contractorName1;
    @FindBy(xpath = "(//input[@name='contractorName'])")
    public WebElement contractorName2;
    @FindBy(name="contractorNumber")
    public WebElement contractorNumber;
    @FindBy(name="comments")
    public WebElement comments;
    @FindBy(className = "wpcf7-response-output")
    public WebElement validationText;
    @FindBy(id = "sbmtbtn")
    public WebElement submitButton;
    @FindBy(name = "contractorCompanyName")
    public WebElement contractorCompanyName;
    @FindBy(name = "serialNumber")
    public WebElement serialNumberW;
    @FindBy(name = "contractorAddressLine")
    public WebElement contractorAddressLine;
    @FindBy(name = "contractorCity")
    public WebElement contractorCity;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap contractorStateProvince\"]/select[@class=\"wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect\"]")
    public WebElement contractorStates;
    @FindBy(name = "contractorZipPostalCode")
    public WebElement contractorZipPostalCode;
    @FindBy(name = "contractorEmail")
    public WebElement contractorEmail;
    @FindBy(name = "contractorPhone")
    public WebElement contractorPhone;
    @FindBy(name = "copy-of-invoice")
    public WebElement copyofinvoice;
    @FindBy(name = "closing-statement")
    public WebElement closingstatement;
    @FindBy(name = "email-history")
    public WebElement emailhistory;
    @FindBy(name = "install-photo-1")
    public WebElement installphoto1;
    @FindBy(name = "install-photo-2")
    public WebElement installphoto2;
    @FindBy(name = "install-photo-3")
    public WebElement installphoto3;
    @FindBy(name = "other-docs")
    public WebElement otherdocs;




}
