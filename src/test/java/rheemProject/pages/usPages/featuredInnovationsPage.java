package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class featuredInnovationsPage {
    public featuredInnovationsPage(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(className = "sectiontitle")
    public WebElement mottoTitle;
    @FindAll({@FindBy(
            xpath = "//*[@id=\"airInnovations\"]/div/div[1]/div/h2"
    ), @FindBy(
            xpath = "//*[@id=\"airInnovations\"]/div/div[2]/div/h2"
    ), @FindBy(
            xpath = "//*[@id=\"waterInnovations\"]/div[1]/div[1]/div/div[2]/h2"
    ), @FindBy(
            xpath = "//*[@id=\"waterInnovations\"]/div[1]/div[2]/div/h2"
    ), @FindBy(
            xpath = "//*[@id=\"waterInnovations\"]/div[2]/div[1]/div/h2"
    ), @FindBy(
            xpath = "//*[@id=\"waterInnovations\"]/div[2]/div[2]/div/div[3]/h2"
    ), @FindBy(
            xpath = "//*[@id=\"waterInnovations\"]/div[3]/div/div/div[1]/div/h2"
    ), @FindBy(
            xpath = "//*[@id=\"waterInnovations\"]/div[3]/div/div/div[2]/div/h2"
    ), @FindBy(
            xpath = "//*[@id=\"fullblock-img\"]/h2"
    )})
    public List<WebElement> innovationsProducts;
}
