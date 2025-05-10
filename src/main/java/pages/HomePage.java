package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableMethods.ReusableMethods;

public class HomePage extends ReusableMethods {

    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-sub' and contains (.,'Careers')]")
    public static WebElement careersDropDown;
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink' and contains (.,'Company')]")
    public static WebElement companyMenu;
    @FindBy(id = "wt-cli-accept-all-btn")
    public static WebElement acceptAllCookiesButton;


}
