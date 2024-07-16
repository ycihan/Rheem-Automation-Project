package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import rheemProject.utilities.Driver;

import java.util.List;

public class warrantiesFormPage {

    public warrantiesFormPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a[@data-gtmobject='Warranties'])[1]")
    public WebElement warrantiesButton;

    @FindAll({
            @FindBy(xpath = "//img[@alt='verify-warranty']"),
            @FindBy(xpath = "//img[@alt='register-product']"),
            @FindBy(xpath = "//div[@class='modal-content panel radiusallcorners']//img"),
            @FindBy(xpath = "//div[@class='desktopbackground']")

    })
    public List<WebElement> warrantiesImage;

    @FindBy(xpath = "//div[@class='titledesktop desktop']")
    public WebElement mainTitle;


    @FindAll({

            @FindBy(xpath = "(//h3[@style='text-align: center;'])[1]"),
            @FindBy(xpath = "(//h3[@style='text-align: center;'])[2]"),
            @FindBy(xpath = "(//h3[@style='text-align: center;'])[3]")

    })
    public List<WebElement> panelHeaders;

    @FindAll({

            @FindBy(xpath = "(//p[@class='matchcol'])[1]"),
            @FindBy(xpath = "(//p[@class='matchcol'])[2]"),
            @FindBy(xpath = "(//p[@style='text-align: center;']")

    })
    public List<WebElement> panelTexts;

    @FindBy(id = "serial-modal")
    public WebElement hyperText;

    @FindBy(id = "1")
    public WebElement checkhyperTextsPopUp;


    @FindAll({

            @FindBy(xpath = "(//a[contains(@class,'btn-primary inverted btn block')][normalize-space()='water heating'])[1]"),
            @FindBy(xpath = "(//a[contains(@class,'btn-primary inverted btn block')][normalize-space()='heating & cooling'])[1]"),
            @FindBy(xpath = "(//a[normalize-space()='Pool & Spa'])[1]"),
            @FindBy(xpath = "(//a[contains(@class,'btn-primary inverted btn block')][normalize-space()='water heating'])[2]"),
            @FindBy(xpath = "(//a[contains(@class,'btn-primary inverted btn block')][normalize-space()='heating & cooling'])[2]"),

    })
    public List<WebElement> panelButtons;

    @FindBy(xpath = "//a[@class='btn-primary inverted btn']")
    WebElement findProButton;
}
