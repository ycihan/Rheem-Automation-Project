package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;



public class commercialResourceCenterPage {

    public commercialResourceCenterPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "(//div[@class='titledesktop desktop'])[1]")
    public WebElement Homeownerheader;
    @FindBy (xpath ="(//*[@class=\"navtitlewrapper matchcol\"])[12]" )
    public WebElement resourceButton;
    @FindBy(id = "2")
    public WebElement commercialButton;






        @FindAll
                ({
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[1]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[2]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[3]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[1])/li[4]/a"),


                })
        public List<WebElement> revitfilesandDiagrams;
        @FindAll
                ({
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[2])/li[1]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[2])/li[2]/a"),


                })
        public List<WebElement> getItSized;
        @FindAll
                ({
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[1]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[2]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[3]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[4]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[5]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[3])/li[6]/a"),




                })
        public List<WebElement> industries;
        @FindAll
                ({
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[1]/a"),
                        @FindBy(xpath = "((//*[@class=\"list-unstyled\"])[4])/li[2]/a"),




                })
        public List<WebElement> roles;

        @FindBy(xpath = "(//*[@id=\"playlist-section\"])[1]")
        public WebElement producteducationHeader ;

    }

