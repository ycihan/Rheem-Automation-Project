package rheemProject.pages.apacPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class speakToASpecialistPage {
    public speakToASpecialistPage() {PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name ="first-name")
    public WebElement firstName;
    @FindBy(name ="last-name")
    public WebElement lastName;
    @FindBy(name ="company-name")
    public WebElement companyName;
    @FindBy(name ="company-email")
    public WebElement companyEmail;
    @FindBy(name ="job-title")
    public WebElement jobTitle;
    @FindBy(name ="contact-number")
    public WebElement contactNumber;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap industry\"]/div[@class=\"nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect\"]")
    public WebElement industry;
    @FindBy(xpath = "//span[@class=\"wpcf7-form-control-wrap project-focus\"]/div[@class=\"nice-select wpcf7-form-control wpcf7-select wpcf7-validates-as-required form-control niceselect\"]")
    public WebElement projectFocus;
    @FindBy(xpath = "//*[@placeholder=\"Tell us more about your project\"]")
    public WebElement description;
    @FindBy(xpath = "//*[@value=\"Submit\"]")
    public WebElement submitButtonSpeak;
    @FindBy(xpath = "//*[@class=\"buttons-list\"]/a")
    public WebElement learnaboutthisproductButton;
    @FindBy(xpath = "//*[@class=\"rmc__hero--description--buttons\"]/button")
    public WebElement speakToSpecialistButton;
    @FindBy(className = "wpcf7-response-output")
    public WebElement outputResponse;



}
