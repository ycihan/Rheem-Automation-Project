package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class contactPagePoolAndSpaFormPage {
    public contactPagePoolAndSpaFormPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookieButton;

    @FindBy(xpath ="//a[@data-gtmlocation='header'][normalize-space()='Contact']")
    public WebElement ContactButton ;

    @FindBy(xpath = "//label[normalize-space()='Pool & Spa']")
    public WebElement poolAndSpaButton ;

    @FindBy(xpath ="//div[@class='headercontent desktop textonly']//div[@class='titledesktop desktop']//span[@class='rh-h1'][normalize-space()='Contact Rheem']")
    public WebElement tittle ;

    //*[@id='question-subtopic']

    @FindBy(id="gonow")
        public WebElement goToRaypakButton;



    @FindBy(xpath ="//input[@placeholder='Full Name*']")
    public WebElement fullName ;
    @FindBy(xpath ="//input[@placeholder='Address 1*']")
    public WebElement address1 ;
    @FindBy(xpath ="//input[@placeholder='Address 2']")
    public WebElement address2  ;
    @FindBy(xpath = "//input[@placeholder='City*']")
    public WebElement city ;



    @FindBy(xpath = "//input[@placeholder='ZIP / Postal Code*']")
    public WebElement postalCode ;

    @FindBy(xpath = "//input[@placeholder='Company Name']")
    public WebElement companyName ;
    @FindBy(xpath = "//input[@placeholder='Phone: 555-555-5555*']")
    public WebElement phone ;
    @FindBy(xpath = "//input[@placeholder='Email*']")
    public WebElement email ;



    @FindBy(xpath = "//input[@placeholder='Model Number']")
    public WebElement modelNumber ;
    @FindBy(xpath = "//input[@placeholder='Serial Number']")
    public WebElement serialNumber;

    @FindBy(xpath = "//input[@placeholder='Contractor/Plumber Name']")
    public WebElement plumberName ;
    @FindBy(xpath = "//input[@placeholder='Contractor/Plumber Phone']")
    public WebElement plumberPhone;

    @FindBy(xpath = "//textarea[@name='comments']")
    public WebElement comments ;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton ;





}


