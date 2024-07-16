package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class homeEnhancementsIntroPage {
    public homeEnhancementsIntroPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@class='products']")
    public WebElement productsButton;

    @FindBy(xpath = "//h6[normalize-space()='HomeEnhancements']")
    public WebElement homeEnhancementsButton;

    @FindAll
            ({
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[4]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[8]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[9]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[10]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[11]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[12]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[13]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[14]"),
            })
    public List<WebElement> images;

    @FindBy(xpath = "//*[@data-gtmlocation=\"residential-resources-nav\"]")
    public WebElement residentialresourcesButton;

    @FindBy(xpath = "//*[@class=\"exploregradient\"]/div[2]")
    public WebElement moreButton;

    @FindBy(xpath="//*[@class=\"post post-page current-item\"]")
    public WebElement textPage;

    @FindBy(xpath = "//h3[normalize-space()='Rheem Home Enhancements']")
    public WebElement textTitle;

    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[1]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[2]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[3]"),
                    @FindBy(xpath = "//*[@class=\"explorelist\"]/li[4]"),
            })
    public List<WebElement> productList;

   //HOME INTEGRATION Panel
    @FindBy(xpath="//p[normalize-space()='Home Integration']")
    public WebElement ribbonHeaderHI ;


    @FindBy(xpath="//h2[normalize-space()='Protect Your Home With Mobile Leak Alerts']")
    public WebElement textTittleHI ;

    @FindBy(xpath="//div[contains(@class,'maincontentside col-md-10')]//li[1]")
    public WebElement firstLineHI ;

    @FindBy(xpath="//div[contains(@class,'maincontentside col-md-10')]//li[2]")
    public WebElement secondLineHI;

    @FindBy(xpath="//li[contains(text(),'These products may help you qualify for insurance ')]")
    public WebElement thirdLineHI;

    @FindBy(xpath="//a[@href='/econet/']")
    public WebElement learnMoreButtonHI;

    @FindBy(xpath = "//img[@alt='EcoNet-CTA1_small']")
    public WebElement ecoNetImage;

    //RESIDENTIAL AIR Panel
    @FindBy(xpath="(//div/div/p[contains(@class, \"ribbon-header\")])[3]")
    public WebElement ribbonHeaderRA;
    @FindBy(xpath="//h2[normalize-space()='Explore Whole Home Exact \u0003Fit Media Air Cleaners']")
    public WebElement textRA;
    @FindBy(xpath="//a[contains(@href,'/products/indoor-air-quality/')]")
    public WebElement learnMoreButtonRA;
    @FindBy(xpath="/html/body/div[7]/div/div[2]/div[3]/div/div/div[2]/style/text()")
    public WebElement residentialAirImage;

    //ECONET® panel
    @FindBy(xpath="(//div/div/p[contains(@class, \"ribbon-header\")])[2]")
    public WebElement ribbonHeaderE;
    @FindBy(xpath="//h2[contains(text(),'It Puts the “Smart” in Smart Home')]")
    public WebElement textTitleE;

    @FindBy(xpath = "//div[@id='smarthome']/p[1]")
    public WebElement textE;

    @FindBy(xpath="//div[contains(@class,'leftside col-12 col-lg-6 order-2 order-md-2 order-lg-1 ')]//style[1]")
    public WebElement smartHomeImage;
    @FindBy(xpath="//a[contains(@class,'btn btn-primary knockout inline')]")
    public WebElement learnMoreButtonE;
  //  @FindBy(xpath ="(//div[@class='btnholder'])[2]")


    @FindBy(xpath="//body/div[contains(@class,'container')]/div[contains(@class,'row')]/div[contains(@class,'maincontentside col-md-10')]/div[contains(@class,'container')]/div[contains(@class,'')]/div[contains(@class,'row')]/div[contains(@class,'col-12')]/p[1]")
    public WebElement introText;




}
