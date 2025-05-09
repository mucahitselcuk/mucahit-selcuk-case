package steps;

import base.BaseTest;
import driver.DriverManager;
import org.testng.Assert;
import pages.HomePage;
import reusableMethods.Log;

public class HomePageSteps extends HomePage {

    public void acceptAllCookies() {
        waitVisibleByLocator(acceptAllCookiesButton);
        clickElement(acceptAllCookiesButton);
    }
    public void isHomePageLoaded() {
        Log.info("Insider Ana Sayfasının açıldığı doğrulanır.");
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), BaseTest.mainUrl,"Insider Ana Sayfası Açılmadı!");
    }

    public void goToCareersPage() {
        Log.info("Company menüsünden Careers sekmesine gidiliyor.");
        waitVisibleByLocator(companyMenu);
        hoverElement(companyMenu,2);
        clickElement(careersDropDown);
        waitSC(3);
    }
}
