package rheemProject.pages.weatherkingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class weatherkingContactPage {
    public weatherkingContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"desktopMenu\"]/ul/li[6]/a")
    public WebElement contactUsButton;

    @FindBy(name = "username")
    public WebElement name;
    @FindBy(name = "address")
    public WebElement address;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "zip")
    public WebElement zip;
    @FindBy(name = "phone")
    public WebElement phone;
    @FindBy(name = "email")
    public WebElement email;
    @FindBy(name = "modelNumber")
    public WebElement modelNumber;
    @FindBy(name = "serialNumber")
    public WebElement serialNumber;
    @FindBy(xpath = "//*[@placeholder=\"Contractor/Plumber Name\"]")
    public WebElement plumberName;
    @FindBy(xpath = "//*[@placeholder=\"Contractor/Plumber Phone\"]")
    public WebElement plumberPhone;
    @FindBy(name = "message")
    public WebElement message;
    @FindBy(xpath = "//*[@class=\"wpcf7-list-item-label\"]")
    public WebElement human;
    @FindBy(id = "sbmtbtn")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@placeholder=\"Contractor Company Name\"]")
    public WebElement contractorCompanyName;
    @FindBy(xpath = "//*[@placeholder=\"Contractor Address*\"]")
    public WebElement contractorAddress;
    @FindBy(xpath = "//*[@placeholder=\"Contractor City*\"]")
    public WebElement contractorCity;
    @FindBy(xpath = "//*[@placeholder=\"Contractor ZIP*\"]")
    public WebElement contractorZip;
    @FindBy(xpath = "//*[@placeholder=\"Contractor Email*\"]")
    public WebElement contractorEmail;
    @FindBy(xpath = "//*[@placeholder=\"Contractor Phone: 555-555-5555*\"]")
    public WebElement contractorPhone;
    @FindBy(xpath = "(//*[@class=\"12u 12u$(xsmall)\"]/span/input)[7]")
    public WebElement copyofinvoice;
    @FindBy(xpath = "(//*[@class=\"12u 12u$(xsmall)\"]/span/input)[8]")
    public WebElement closingstatement;
    @FindBy(xpath = "(//*[@class=\"12u 12u$(xsmall)\"]/span/input)[9]")
    public WebElement emailhistory;
    @FindBy(xpath = "(//*[@class=\"12u 12u$(xsmall)\"]/span/input)[10]")
    public WebElement photoone;
    @FindBy(xpath = "(//*[@class=\"12u 12u$(xsmall)\"]/span/input)[11]")
    public WebElement phototwo;
    @FindBy(xpath = "(//*[@class=\"12u 12u$(xsmall)\"]/span/input)[12]")
    public WebElement photothree;
    @FindBy(xpath = "(//*[@class=\"12u 12u$(xsmall)\"]/span/input)[13]")
    public WebElement otherdocuments;

    @FindBy(name = "topic")
    public WebElement topic;
    @FindBy(name = "state")
    public WebElement state;
    @FindBy(name = "country")
    public WebElement country;
    @FindBy(name = "contractorStateProvince")
    public WebElement contractorstateprovinces;
    @FindBy(className = "wpcf7-response-output")
    public WebElement outputResponse;

}
