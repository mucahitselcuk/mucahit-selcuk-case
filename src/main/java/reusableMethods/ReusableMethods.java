/*
 * MIT License
 * Copyright (c) 2025 Mücahit Selçuk
 *
 * See LICENSE.md file in the root directory for full license information.
 */

package reusableMethods;

import base.BaseTest;
import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.Set;

public class ReusableMethods extends BaseTest {

    static Wait<WebDriver> wt = new FluentWait<>(DriverManager.getDriver())
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NoSuchElementException.class);

    public static void waitVisibleByLocator(WebElement element) {
        try {
            wt.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            Log.info("Element Bulunamadı.");
        }
    }
    public static void hoverElement(WebElement webElement, int second) {
        Actions action = new Actions(DriverManager.getDriver());
        action.moveToElement(webElement).pause(Duration.ofSeconds(second)).perform();
    }
    public static void clickElement(WebElement webElement) {
        scrollToElementWithAction(webElement);
        waitClickableByOfElement(webElement);
        Log.info("Elemente tıklanıyor");
        try {
            webElement.click();
        } catch (ElementClickInterceptedException e) {
            clickWithJS(webElement);
        } catch (ElementNotInteractableException e) {
            Log.info("Element erişilemez hatası, JS ile tekrar dene");
            clickWithJS(webElement);
        } catch (Exception ignored) {
        }
    }
    public static void scrollToElementWithAction(WebElement element) {
        try {
            Log.info("Elemente Scroll ediliyor.");
            new Actions(DriverManager.getDriver())
                    .scrollToElement(element)
                    .perform();
        } catch (Exception e) {
            Log.info("Elemente scroll edilirken hata oluştu.");
        }
    }
    public static void waitClickableByOfElement(WebElement element) {
        Log.info("Element tıklanabilir olana kadar bekleniyor.");
        try {
            wt.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            Log.error("Web element is not clickable!");
        }
    }
    public static void clickWithJS(WebElement element) {
        try {
            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", element);
        } catch (Exception ignored) {}
    }
    public static void waitSC(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            Log.error("Thread sleep interrupted: ", e);
            Thread.currentThread().interrupt();
        }
    }
    public static boolean isDisplayElement(WebElement webElement) {
        try {
            return new FluentWait<>(DriverManager.getDriver())
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
        } catch (Exception e) {
            Log.info("Element bulunamadı");
            return false;
        }
    }

    public static void navigateToSpecificURL(String url) {
        try {
            DriverManager.getDriver().navigate().to(url);
            DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        } catch (Exception ignored) {
        }
        Log.info(" URL: " + url);
    }

    public static void switchToOtherTab() {
        String currentTab = DriverManager.getDriver().getWindowHandle();
        Set<String> handles = DriverManager.getDriver().getWindowHandles();
        String newTab = null;
        for (String handle : handles) {
            if (!handle.equals(currentTab)) {
                newTab = handle;
                break;
            }
        }
        DriverManager.getDriver().switchTo().window(newTab);
    }
}


