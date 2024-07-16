package rheemProject.pages.sureComfortPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class sureComfortPage {
    public sureComfortPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "Name")
    public WebElement name;
    @FindBy(name = "Email")
    public WebElement email;
    @FindBy(name = "Address")
    public WebElement address;
    @FindBy(name = "City")
    public WebElement city;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap State\"]/select[@class=\"wpcf7-form-control wpcf7-select wpcf7-validates-as-required\"]")
    public WebElement statesandprovinces;
    @FindBy(name = "ZipCode")
    public WebElement zipcode;
    @FindBy(name = "Phone")
    public WebElement phone;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap Topic\"]/select[@class=\"wpcf7-form-control wpcf7-select wpcf7-validates-as-required\"]")
    public WebElement topic;
    @FindBy(name = "Message")
    public WebElement message;
    @FindBy(id = "sbmtbtn")
    public WebElement submitButton;
    @FindBy(className = "wpcf7-response-output")
    public WebElement validationOutputText;
    @FindBy(name = "modelNumber")
    public WebElement modelNumber;
    @FindBy(name = "serialNumber")
    public WebElement serialNumber;
    @FindBy(name = "copy-of-invoice")
    public WebElement copyofinvoince;
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
    @FindBy(name = "contractorCompanyName")
    public WebElement contractorCompanyName;
    @FindBy(name = "contractorName")
    public WebElement contractorName;
    @FindBy(name = "contractorAddressLine")
    public WebElement contractorAddressLine;
    @FindBy(name = "contractorCity")
    public WebElement contractorCity;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap contractorStateProvince\"]/select[@class=\"wpcf7-form-control wpcf7-select wpcf7-validates-as-required\"]")
    public WebElement contractorStatesProvinces;
    @FindBy(name = "contractorZipPostalCode")
    public WebElement contractorZipPostalCode;
    @FindBy(name = "contractorEmail")
    public WebElement contractorEmail;
    @FindBy(name = "contractorPhone")
    public WebElement contractorPhone;


}
