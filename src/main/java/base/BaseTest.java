package base;

import driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static String mainUrl = "https://useinsider.com/";
    @BeforeMethod
    public void setUp() {
        DriverManager.getDriver().get(mainUrl);
    }
    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
