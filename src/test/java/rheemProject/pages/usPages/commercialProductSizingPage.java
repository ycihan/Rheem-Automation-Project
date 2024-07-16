package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class commercialProductSizingPage {
    public commercialProductSizingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h6[normalize-space()='ProjectSizing']")
    public WebElement productSizingButton;



    @FindAll
            ({
                    @FindBy(xpath = "//img[@src='//rmc-cdn.s3.amazonaws.com/media/uploads/iat/sites/36/2018/04/locker_room.png']"),
                    @FindBy(xpath = "//img[@class='c']"),
                    @FindBy(xpath = "//img[@class='card-img-top']"),
                    @FindBy(xpath = "(//img[@loading='lazy'])[4]"),
                    @FindBy(xpath = "//img[@class='c']"),

            })
    public List<WebElement> productSizingImgs;

    @FindBy(xpath = "//span[@class='rh-h1'][1]")
    public WebElement mainTitleProductSizing;

    @FindBy(xpath = "//p[@class='ribbon-header gray']")
    public WebElement ribbonComResourceCen;

    @FindAll
            ({
                    @FindBy(xpath = "//h5[@class='revit-title']/following-sibling::ul[@class='list-unstyled']/li[1]/a"),
                    @FindBy(xpath = "//h5[@class='revit-title']/following-sibling::ul[@class='list-unstyled']/li[2]/a"),
                    @FindBy(xpath = "//h5[@class='revit-title']/following-sibling::ul[@class='list-unstyled']/li[3]/a"),
                    @FindBy(xpath = "//h5[@class='revit-title']/following-sibling::ul[@class='list-unstyled']/li[4]/a"),
            })
    public List<WebElement> revitFiles;


    @FindAll
            ({
                    @FindBy(xpath = "//a[contains(text(),'RapidSpec™')]"),
                    @FindBy(xpath = "//a[contains(text(),'Get Help from a Pro')]"),

            })
    public List<WebElement> getItSized;


    @FindAll
            ({
                    @FindBy(xpath = "//h5[@class='industries-title']/following-sibling::ul[@class='list-unstyled']/li[1]"),
                    @FindBy(xpath = "//h5[@class='industries-title']/following-sibling::ul[@class='list-unstyled']/li[2]"),
                    @FindBy(xpath = "//h5[@class='industries-title']/following-sibling::ul[@class='list-unstyled']/li[3]"),
                    @FindBy(xpath = "//h5[@class='industries-title']/following-sibling::ul[@class='list-unstyled']/li[4]"),
                    @FindBy(xpath = "//h5[@class='industries-title']/following-sibling::ul[@class='list-unstyled']/li[5]"),
                    @FindBy(xpath = "//h5[@class='industries-title']/following-sibling::ul[@class='list-unstyled']/li[6]"),
            })
    public List<WebElement> industries;


    @FindAll
            ({
                    @FindBy(xpath = "//h5[@class='roles-title']/following-sibling::ul[@class='list-unstyled']/li[1]"),
                    @FindBy(xpath = "//h5[@class='roles-title']/following-sibling::ul[@class='list-unstyled']/li[2]"),
            })
    public List<WebElement> role;

    @FindBy(id = "2")
    public WebElement CommercialHeatingCoolingBtn;

    @FindAll
            ({
                    @FindBy(xpath = "//div[@class='panecontent']/p[1]/a[1]"),
                    @FindBy(xpath = "//div[@class='panecontent']/p[1]/a[2]"),
                    @FindBy(xpath = "//div[@class='panecontent']/p[2]/a[1]"),

            })
    public List<WebElement> hyperTextsComResourceCen;
}

