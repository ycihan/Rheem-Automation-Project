package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class featuredInnovationsCommercialPage {
    public featuredInnovationsCommercialPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"col-12 \"]/h2"),
                    @FindBy(xpath = "//*[@style=\"padding-top: 55px;\"]/h2"),
                    @FindBy(xpath = "//*[@id=\"getfaster\"]/h2"),
                    @FindBy(xpath = "(//*[@class=\"row section-panelradius\"]/div/div/h2)[2]"),
                    @FindBy(xpath = "//*[@style=\"padding-top: 70px;\"]/h2"),
                    @FindBy(xpath = "//*[@id=\"fullblock-img\"]/h2"),
                    @FindBy(xpath = "(//*[@style=\"color:#fff\"])[1]"),

            })
    public List<WebElement> titles;
    @FindAll
            ({
                    @FindBy(xpath = "//*[@class=\"col-12 \"]/p"),
                    @FindBy(xpath = "//*[@style=\"padding-top: 55px;\"]/p"),
                    @FindBy(xpath = "//*[@id=\"getfaster\"]/p"),
                    @FindBy(xpath = "(//*[@class=\"row section-panelradius\"]/div/div/p)[2]"),
                    @FindBy(xpath = "//*[@style=\"padding-top: 70px;\"]/p"),
                    @FindBy(xpath = "//*[@id=\"fullblock-img\"]/p"),
                    @FindBy(xpath = "(//*[@style=\"color:#fff\"])[2]"),

            })
    public List<WebElement> texts;
    //
    @FindAll
            ({
                    @FindBy(xpath = "(//*[@class=\"btnholder\"]/a)[1]"),
                    @FindBy(xpath = "(//*[@class=\"btnholder\"]/a)[2]"),
                    @FindBy(xpath = "(//*[@class=\"btnholder\"]/a)[3]"),
                    @FindBy(xpath = "(//*[@class=\"btnholder\"]/a)[4]"),
                    @FindBy(xpath = "(//*[@class=\"btnholder\"]/a)[5]"),
                    @FindBy(xpath = "(//*[@class=\"btnholder\"]/a)[6]"),
                    @FindBy(xpath = "(//*[@class=\"btnholder\"]/a)[7]"),

            })
    public List<WebElement> learnMoreButtons;



}
