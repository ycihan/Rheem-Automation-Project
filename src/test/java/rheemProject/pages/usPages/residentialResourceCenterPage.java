package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class residentialResourceCenterPage {
    public residentialResourceCenterPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "(//div[@class='titledesktop desktop'])[1]")
    public WebElement Homeownerheader;

   @FindBy (xpath ="(//*[@class=\"navtitlewrapper matchcol\"])[6]" )
    public WebElement resourceButton;


    @FindAll
            ({
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[1]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[2]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[3]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[4]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[5]"),


            })
    public List<WebElement> quickLinks;
    @FindAll
            ({
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[2])/li[1]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[2])/li[2]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[2])/li[3]"),



            })
    public List<WebElement> warrantyInformation;
    @FindAll
            ({
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[1]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[2]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[3]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[4]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[5]"),




            })
    public List<WebElement> heatingandCooling;
    @FindAll
            ({
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[1]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[2]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[3]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[4]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[5]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[6]"),
                    @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[7]"),



            })
    public List<WebElement> waterHeating;

    @FindBy(xpath = "//*[@id='product-education-text']/h2[1]")
    public WebElement producteducationHeader ;
    @FindBy(xpath = "//*[@id='product-education-text']/p[1]")
    public WebElement producteducationtext ;

    @FindBy(xpath = "(//div[@class='btnholder'])[1]/a")
    public WebElement findSavings ;
    @FindBy(xpath = "(//div[@class='btnholder'])[2]/a")
    public WebElement getAnswers ;
    @FindBy(xpath = "(//div[@class='btnholder'])[3]/a ")
    public WebElement contactUs;
}







