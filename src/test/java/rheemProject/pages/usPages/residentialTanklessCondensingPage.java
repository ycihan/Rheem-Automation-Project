package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class residentialTanklessCondensingPage {
    public  residentialTanklessCondensingPage(){
        PageFactory.initElements(Driver.getDriver(), this);}


  //  @FindBy(id = "menu-item-5565")
    // public WebElement tanklessCondensing;
    //*[@id="menu-item-5565"]/a
    @FindBy(xpath = "//*[@id=\"tier2header\"]/div[1]/div/div/div/div[1]")
    public WebElement pageTitle;

    @FindBy(xpath = "/html/body/div[6]/div/div/div")
    public WebElement introText;

    @FindAll({@FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/a/h3"
    ), @FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/a/h3"
    ), @FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div[1]/a/h3"
    ), @FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[1]/a/h3"
    ), @FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[5]/div/div[2]/div/div[1]/a/h3"
    ), @FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[6]/div/div[2]/div/div[1]/a/h3"
    ), @FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[7]/div/div[2]/div/div[1]/a/h3"
    ), @FindBy(
            xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div[8]/div/div[2]/div/div[1]/a/h3"
    )})
    public List<WebElement> tanklessProducts;


}
