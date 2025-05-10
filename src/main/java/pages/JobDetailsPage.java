package pages;


import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableMethods.ReusableMethods;

public class JobDetailsPage extends ReusableMethods {
    public JobDetailsPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5' and contains (.,'View Role')])[1]")
    public static WebElement viewRoleButton;
    @FindBy(css = "div[class='posting-headline'] > h2")
    public static WebElement leverApplicationPagePositionTitle;
    @FindBy(xpath = "//div[@class='postings-btn-wrapper']//a[@class='postings-btn template-btn-submit shamrock' and contains (.,'Apply for this job')]")
    public static WebElement applyForThisJobButton;
}
