package rheemProject.pages.apacPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class electricInstantWaterHeatersPageApac {
    public electricInstantWaterHeatersPageApac() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='titledesktop desktop']")
    public WebElement headerElectric;

    @FindBys({
            @FindBy(xpath = "//*[@class=\"productImage\"]")

    })
    public List<WebElement> productsImages;

    @FindBys({
            @FindBy(xpath = "//*[@class=\"description\"]/h3")

    })
    public List<WebElement> productsTextHeaders;

    @FindBys({
            @FindBy(xpath = "//*[@class='rating']")

    })
    public List<WebElement> productsRatingTexts;

    @FindBys({
            @FindBy(xpath = "//*[@class=\"description\"]/h3/a")

    })
    public List<WebElement> productsHeadersButtons;

    @FindBys({
            @FindBy(xpath = "//*[@class='buttons-list']/a")

    })
    public List<WebElement> clickToLearnAboutThisProductButtons;                        ;

    @FindBys({
            @FindBy(xpath = "//button[@aria-expanded]")

    })
    public List<WebElement> viewDocumentsButtons ;


    @FindBys({
            @FindBy(xpath = "//*[@class=\"description\"]/ul/li")

    })
    public List<WebElement> productsDetailsListTexts;




    //*[@class='dropdown-item']


}
