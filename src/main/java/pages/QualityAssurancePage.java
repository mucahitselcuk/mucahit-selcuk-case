package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableMethods.ReusableMethods;

import java.util.List;

public class QualityAssurancePage extends ReusableMethods {
    public QualityAssurancePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "a[href='https://useinsider.com/careers/open-positions/?department=qualityassurance']")
    public static WebElement seeAllQaJobsButton;
    @FindBy(id = "career-position-list")
    public static WebElement careerPositionListArea;
    @FindBy(css = "span[aria-labelledby='select2-filter-by-location-container'] > span[class='select2-selection__arrow']")
    public static WebElement locationDropdown;
    @FindBy(css = "span[aria-labelledby='select2-filter-by-department-container'] > span[class='select2-selection__arrow']")
    public static WebElement departmentDropdown;
    @FindBy(xpath = "//ul[@class='select2-results__options']//li[@id and contains (.,'Istanbul, Turkiye')]")
    public static WebElement locationOfIstanbul;
    @FindBy(xpath = "//ul[@class='select2-results__options']//li[@id and contains (.,'Quality Assurance')]")
    public static WebElement departmentOfQualityAssurance;
    @FindBy(id = "jobs-list")
    public static WebElement jobsList;
    @FindBy(css = "span[class='totalResult']")
    public static WebElement resultCounter;
    @FindBy(css = "span[title='Quality Assurance']")
    public static WebElement departmentText;
    @FindBy(css = "div[class='jobs-pagination'] > button > i[class='icon-arrow-right']")
    public static WebElement arrowRight;
    @FindBy(css = "div[class='position-list-item-wrapper bg-light'] > p[class='position-title font-weight-bold']")
    public static List<WebElement> jobsPositionTitles;
    @FindBy(css = "div[class='position-list-item-wrapper bg-light'] > span[class='position-department text-large font-weight-600 text-primary']")
    public static List<WebElement> jobsDepartmentName;
    @FindBy(css = "div[class='position-list-item-wrapper bg-light'] > div[class='position-location text-large']")
    public static List<WebElement> jobsLocationName;
}
