package rheemProject.pages.apacPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

public class contactPage {

    public contactPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(name = "fullName")
    public WebElement fullname;
    @FindBy(name = "addressLine1")
    public WebElement addressLine1;

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

    @FindBy(xpath = "//*[@id=\"wpcf7-f3-o1\"]/form/div[2]/div[2]/p[1]/span/div")
    public WebElement topic;

    @FindBy(name = "comments")
    public WebElement comments;

    @FindBy(name="your-file")
    public WebElement uploadFile;

    @FindBy(xpath = "//*[@id=\"wpcf7-f3-o1\"]/form/div[2]/div[2]/div[3]/input")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"wpcf7-f3-o1\"]/form/div[3]")
    public WebElement responseText;

}
