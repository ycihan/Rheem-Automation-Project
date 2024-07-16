package rheemProject.pages.usPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import rheemProject.utilities.Driver;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static rheemProject.utilities.Driver.driver;

public class onlineClaimSubmissionFormPage {

    public onlineClaimSubmissionFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//p[contains(text(),': This form is only for US customers, if you exper')]")
    public WebElement disclaimerheaderText;

    @FindBy(xpath="//h3[contains(text(),'Customer Type (required):')]")
    public WebElement customerTypeheaderText;

    @FindBy(xpath="//h3[contains(text(),'Customer Information:')]")
    public WebElement customerInformationheaderText;

    @FindBy(xpath="//h3[contains(text(),'Unit Information:')]")
    public WebElement unitInformationheaderText;

    @FindBy(xpath="//h3[contains(text(),'Service Technician Information')]")
    public WebElement serviceTechnicianInformationheaderText;

    @FindBy(xpath="//h3[contains(text(),'Reimbursement Information')]")
    public WebElement reimbursementInformationheaderText;

    @FindBy(xpath = "//p[@class='privacy-text']")
    public WebElement privacyPolicyText;

  //  @FindBy(xpath="//select[@name='customer-type']")
  //  public WebElement customerType;

    @FindBy(xpath="//span[@class='wpcf7-form-control-wrap customer-type']") // Replace "dropdown_id" with the actual dropdown ID
    public WebElement customerType;

 //   @FindBy(xpath = "//li[contains(text(),'Home Owner')]")
    //  public WebElement homeOwner;

   // @FindBy(xpath = "//li[contains(text(),'Service Contractor')]")
  //  public WebElement serviceContractor;

    @FindAll({
            @FindBy(xpath = "//li[contains(text(),'Home Owner')]"),
            @FindBy(xpath = "//li[contains(text(),'Service Contractor')]")
    }
    )
    public List<WebElement> customerTypeDropdownOptions;

    public void selectCustomerTypeOption(String optionText) {
        customerType.click();
        for (WebElement option : customerTypeDropdownOptions) {
            if (option.getText().equals(optionText)) {
                option.click();
                break;
            }
        }
    }
    public void selectProductTypeOption(String optionsText) {
        productType.click();
        for (WebElement options : productTypeList  ) {
            if (options.getText().equals(optionsText)) {
                options.click();
                break;
            }
        }
    }

    @FindBy(xpath="//span[@class='wpcf7-form-control-wrap product-type']//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect']")
    public WebElement productType;

    @FindAll({
            @FindBy(xpath = "//li[contains(text(),'Commercial')]"),
            @FindBy(xpath = "//li[contains(text(),'Residential Electric')]"),
            @FindBy(xpath = "//li[contains(text(),'Residential Gas')]"),
            @FindBy(xpath = "//li[contains(text(),'Tankless Gas')]")

    }


    )
    public List<WebElement> productTypeList;
    @FindBy(xpath = "//input[@name='first-name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='last-name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='email-confirm']")
    public WebElement emailConfirm;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement addressLine1;

    @FindBy(xpath = "//input[@name='address2']")
    public WebElement addressLine2;

    @FindBy(id="select-state")
    public WebElement selectState;

    @FindAll({@FindBy (xpath="//select[@name='state']/option")})
    public List <WebElement> baris;

    @FindBy(id = "select-county")
    public WebElement selectCounty;

    @FindBy(id = "select-city")
    public WebElement selectCity;

    public void goToPage() {
        // Code to navigate to the page with dependent dropdowns
    }

    public void selectState1(String state) {
       Select stateSelect = new Select(selectState);

       stateSelect.selectByVisibleText(state);

        // Implement wait for county options to load based on the selected state
    }

    @FindBy(xpath="//select[@name='state']/option")
    public WebElement Alabama;

    public void selectCounty(String county) {

        //Select countySelect = new Select(selectCounty);
        //countySelect.selectByVisibleText(county);
        // Implement wait for city options to load based on the selected county
    }

    public void selectCity(String city) {
        Select citySelect = new Select(selectState);
        citySelect.selectByVisibleText(city);
    }



    @FindAll({
            @FindBy(xpath = "//li[contains(text(),'Home Owner')]"),
            @FindBy(xpath = "//li[contains(text(),'Service Contractor')]")
    }
    )
    public List<WebElement> stateDropdownOptions;

    @FindAll
            ({
                    @FindBy(xpath = "//li[contains(text(),'Alabama')]"),
                    @FindBy(xpath = "//li[contains(text(),'Alaska')]"),
            })
    public List<WebElement> states;

    @FindAll
            ({
                    @FindBy(xpath = "//li[contains(text(),'AUTAUGA')]"),
                    @FindBy(xpath = "//li[contains(text(),'BALDWIN')]"),

            })
    public List<WebElement> county;


    @FindAll
            ({
                    @FindBy(xpath = "//li[contains(text(),'Autaugaville')"),
            })

    public List<WebElement> cities;

    @FindBy(xpath = "//input[@name='zip']")

    public WebElement zip;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='cell']")
    public WebElement cell;

    @FindBy(xpath = "//input[@name='fax']")
    public WebElement fax;

    @FindBy(xpath = "//input[@name='serial-number']")
    public WebElement serialNumber;

    @FindBy(xpath = "//input[@name='model-number']")
    public WebElement modelNumber;

    @FindBy(xpath = "//input[@name='wcn']")
    public WebElement WCN;



     @FindBy(xpath = "//input[@type='date']")
     public WebElement date;

    @FindBy(xpath = "//input[@name='company-name']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@name='company-phone']")
    public WebElement companyPhone;

    @FindBy(xpath = "//input[@name='rep-name']")
    public WebElement representativeName;

    @FindBy(xpath = "//textarea[@name='work-description']")
    public WebElement descriptionOfWorkDone;

    @FindBy(xpath = "//textarea[@name='comments']")
    public WebElement commentsNotes;

    @FindBy(xpath = "//input[@name='part-cost']")
    public WebElement partCost;

    @FindBy(xpath = "//input[@name='labor-cost']")
    public WebElement laborCost;

    @FindBy(xpath = "//input[@name='additional-cost']")
    public WebElement additionalCost;

    @FindBy(xpath = "//input[@name='invoice-attachment']")
    public WebElement fileUploadInvoiceAttachment;

    @FindBy(xpath = "//input[@name='proof-of-purchase']")
    public WebElement fileUploadProofOfPurchase;

    @FindBy(xpath = "//input[@name='proof-of-payment']")
    public WebElement fileUploadProofOfPayment;

    @FindBy(xpath = "//input[@name='additional-attachment']")
    public WebElement fileUploadAdditionalAttachment;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookieButton;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(),'One or more fields have an error. Please check and try again.')]")
    public WebElement errorMessage;



    @FindBy(xpath = "//div[contains(text(),'Claim has been submitted successfully.')]")
    public  WebElement message;

    @FindBy(xpath = "//div[@class='wpcf7-response-output']")
    public WebElement submissionResult;

    @FindBy(xpath = "//input[@name='company-name-customer']")
    public WebElement CompanyNameFirst;

    @FindBy(xpath = "//input[@name='company-ein']")
    public WebElement CompanyEinNumber;


    @FindBy(xpath = "//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect open']")
    public  WebElement state;





    @FindBy(xpath = "//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect open']")
    public  WebElement counties;



    @FindBy(xpath = "//div[@class='nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect open']")
    public  WebElement citiess;




    @FindBy(xpath = "//span[contains(@class,'wpcf7-form-control-wrap customer-type')]//div[contains(@class,'nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect')]")
    public  WebElement selectCustumerType;











}







////

