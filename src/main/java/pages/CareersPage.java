package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableMethods.ReusableMethods;

public class CareersPage extends ReusableMethods {
    public CareersPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(id = "career-find-our-calling")
    public static WebElement teamsArea;
    @FindBy(id = "career-our-location")
    public static WebElement careerArea;
    @FindBy(css = "section[data-id='a8e7b90']")
    public static WebElement lifeAtInsiderArea;




}
