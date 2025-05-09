package pages;

import org.openqa.selenium.WebDriver;

public class JobDetailsPage {
    WebDriver driver;
    public JobDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLeverApplicationPage() {
        return driver.getCurrentUrl().contains("lever.co");
    }
}
