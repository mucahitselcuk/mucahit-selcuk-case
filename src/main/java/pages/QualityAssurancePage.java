package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableMethods.ReusableMethods;

import java.util.List;

public class QualityAssurancePage extends ReusableMethods {
    public QualityAssurancePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "a[href='https://useinsider.com/careers/']")
    public static WebElement careersDropDown;
    @FindBy(id = "navbarDropdownMenuLink")
    public static WebElement companyMenu;
    @FindBy(id = "wt-cli-accept-all-btn")
    public static WebElement acceptAllCookiesButton;
}
