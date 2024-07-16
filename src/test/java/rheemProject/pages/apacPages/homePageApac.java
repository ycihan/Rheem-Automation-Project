package rheemProject.pages.apacPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;


public class homePageApac {

    public homePageApac() {PageFactory.initElements(Driver.getDriver(), this);}

    //sorr
    @FindBy(xpath = "//*[@class='logo-block']")
    public WebElement rheemLogo;


    @FindBy(id = "searchBox")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class=\"top-menu__item\"])[1]")
    public WebElement sustainabilityButton;

    @FindBy(xpath = "//a[@class='top-menu__item'][normalize-space()='Blog']")
    public WebElement blogButton;

    @FindBy(xpath = "//*[@class=\"products main-menu__item\"]")
    public WebElement productsButtonApac;

    @FindBy(xpath = "//a[@class='main-menu__item'][contains(normalize-space(),'Warrant')]")
    public WebElement warrantiesButtonApac;



    //Product toolbar residential Water Heating Elements
    @FindBy(xpath = "(//*[contains(@id,\"water-heater\")]/li/a)[1]")
    public WebElement electricInstantWaterHeatersButton;
    @FindBy(xpath = "(//*[contains(@id,\"water-heater\")]/li/a)[2]")
    public WebElement electricStorageWaterHeatersButton;
    @FindBy(xpath = "(//*[contains(@id,\"water-heater\")]/li/a)[3]")
    public WebElement solarWaterHeatersButton;

    //Product toolbar Commercial Water Heating Elements
    @FindBy(xpath = "(//*[contains(@id,\"menu-commercial-water-heating\")]/li/a)[1]")
    public WebElement centralizedControlPanelsButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-commercial-water-heating\")]/li/a)[2]")
    public WebElement commercialElectricStorageWaterHeatersButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-commercial-water-heating\")]/li/a)[3]")
    public WebElement gasFiredWaterHeatersButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-commercial-water-heating\")]/li/a)[4]")
    public WebElement heatPumpWaterHeatersButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-commercial-water-heating\")]/li/a)[5]")
    public WebElement hotWaterStorageTanksButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-commercial-water-heating\")]/li/a)[6]")
    public WebElement tanklessElectricWaterHeatersButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-commercial-water-heating\")]/li/a)[7]")
    public WebElement thermalExpansionTanksButton;

    //Product toolbar Resource Center Elements
    @FindBy(xpath = "(//*[contains(@id,\"menu-resource-center\")]/li/a)[1]")
    public WebElement resourceCenterListFirstButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-resource-center\")]/li/a)[2]")
    public WebElement resourceCenterListSecondButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-resource-center\")]/li/a)[3]")
    public WebElement resourceCenterListThirdButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-resource-center\")]/li/a)[4]")
    public WebElement resourceCenterListFourthButton;
    @FindBy(xpath = "(//*[contains(@id,\"menu-resource-center\")]/li/a)[5]")
    public WebElement resourceCenterListFifthButton;


    @FindBy(xpath = "(//div[@class='col-auto'])[7]")
    public WebElement whyRheemButtonApac;

    @FindBy(xpath = "//a[@class='btn btn-primary main-menu__item--dealer']")
    public WebElement findAdealerButtonTopApac;

    @FindBy(xpath = "(//div[@class='iconholder '])[1]")
    public WebElement iconFindAdealerApac;

    @FindBy(xpath = "(//div[@class='iconholder '])[2]") //bazı sayfalarda bu ikon yok, olanların hepsinde aynı
    public WebElement iconProductRegistirationApac;

    @FindBy(xpath = "//div[@class='row features']/div[1]/h4[1]")
    public WebElement headerFindAdealerApac;

    @FindBy(xpath = "//div[2]//h4[1]") //bazı sayfalarda bu başlık yok,  olanların hepsinde aynı
    public WebElement headerProductRegistrationApac;

    @FindBy(xpath = "(//p[@class='matchcol'])[1]")
    public WebElement textFindAdealerApac;

    @FindBy(xpath = "(//p[@class='matchcol'])[2]") //bazı sayfalarda bu text yok, olanların hepsinde aynı
    public WebElement textProductRegistrationApac;

    @FindBy(xpath = "(//a[@class='btn btn-primary inverted'])[1]")
    public WebElement findAdealerButtonApac;

    @FindBy(xpath = "(//a[@class='btn btn-primary inverted'])[2]") //Bu buton bazı saylarda yok,olanların hepsinde aynı
    public WebElement getStartedButtonApac;


    @FindBy(xpath = "//*[@id=\"bumperWidgetText\"]/a")
    public WebElement apacPhone;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div[3]/a")
    public WebElement apacContact;
    @FindBy(xpath = "//*[@id=\"footer\"]/div[4]/div/div/div[1]/a")
    public WebElement apacLegalInfo;
    @FindBy(xpath = "//*[@id=\"footer\"]/div[4]/div/div/div[1]/div[1]")
    public WebElement apacCopyright;
    @FindBy(xpath = "//*[@id=\"footer\"]/div[4]/div/div/div[2]/a")
    public WebElement apacSiteMap;

    @FindAll({
            @FindBy(xpath = "//*[@id=\"rheemImages\"]/div[1]/div[1]/a/div/img"),
            @FindBy(xpath = "//*[@id=\"rheemImages\"]/div[2]/div[1]/a/div/img"),
            @FindBy(xpath = "//*[@id=\"rheemAccordion\"]/div[1]/div/div[1]/span/div/img"),
            @FindBy(xpath = "//*[@id=\"rheemAccordion\"]/div[2]/div/div[1]/span/div/img")
    })
    public List<WebElement> apacImages;

    @FindAll({
            @FindBy(xpath = "//*[@id=\"rheemAccordion\"]/div[1]/div/span"),
            @FindBy(xpath = "//*[@id=\"rheemAccordion\"]/div[2]/div/span")})
    public List<WebElement> apacIcons;

    @FindAll({
            @FindBy(xpath = "//*[@id=\"rheemAccordion\"]/div[1]/div/p"),
            @FindBy(xpath = "//*[@id=\"rheemAccordion\"]/div[2]/div/p")

    })
    public List<WebElement> apacCategoryName;

    @FindAll({
            @FindBy(xpath = "//*[@id=\"footer\"]/div[3]/div/div[2]/div/div/ul/li[1]/a"),
            @FindBy(xpath = "//*[@id=\"footer\"]/div[3]/div/div[2]/div/div/ul/li[2]/a"),
            @FindBy(xpath = "//*[@id=\"footer\"]/div[3]/div/div[2]/div/div/ul/li[3]/a")
    })
    public List<WebElement> apacSocialIcons;







    @FindAll
            ({
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[1]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[2]"),
                    @FindBy(xpath = "(//div/div/p[contains(@class, \"ribbon-header\")])[3]"),
            })
    public List<WebElement> ribbonHeadersApac;

    @FindAll({
                    @FindBy(xpath = "(//img[@loading='lazy'])[9]"),
                    @FindBy(xpath = "(//img[@loading='lazy'])[10]")
            })
    public List<WebElement> imagesofthepage;

    @FindBy(xpath = "  //h5[normalize-space()='Helpful for Homeowner']")
    public WebElement helpfulforHomeowner;


    @FindBy(xpath = "//h5[normalize-space()='Company Information']")
    public WebElement companyInformationheader;

    @FindBy(xpath = "//h5[normalize-space()='Commercial Solutions']")
    public WebElement commercialSolutionheader;
    @FindBy(xpath = "//li[@class='bold subNested']")
    public WebElement sustainabilityheader;
    @FindAll
            ({
                    @FindBy(xpath = " (//div[@id='footer']//li)[1]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[2]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[3]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[4]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[5]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[6]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[7]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[8]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[9]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[10]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[11]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[12]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[13]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[14]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[15]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[16]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[17]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[18]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[19]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[20]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[21]"),
                    @FindBy(xpath = " (//div[@id='footer']//li)[22]"),


            })
    public List<WebElement> subheadingsatthebottom;
    @FindBy(xpath = "//li[@class='bold subNested']")
    public WebElement sustainability;




}
