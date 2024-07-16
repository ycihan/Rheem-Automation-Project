package rheemProject.pages.usPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rheemProject.utilities.Driver;

import java.util.List;

public class poolandspaPage {
    public poolandspaPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindAll
            ({
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[4] "),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[8]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[10]"),
                    @FindBy(xpath = "(//img[@loading=\"lazy\"])[12]"),



            })
    public List<WebElement> images;

}
