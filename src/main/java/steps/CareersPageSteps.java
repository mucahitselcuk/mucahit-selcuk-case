package steps;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.CareersPage;
import reusableMethods.Log;

public class CareersPageSteps extends CareersPage {

    SoftAssert softAssert = new SoftAssert();
    public void areCareerSectionsVisible() {
        Log.info("Kariyer sayfasında, 'Teams', 'Locations', 'Life at Insider' alanlarının bulunduğu kontrol edilir.");
        scrollToElementWithAction(teamsArea);
        softAssert.assertTrue(isDisplayElement(teamsArea),"Teams alanı görüntülenemedi.");
        scrollToElementWithAction(careerArea);
        softAssert.assertTrue(isDisplayElement(careerArea),"Career alanı görüntülenemedi.");
        scrollToElementWithAction(lifeAtInsiderArea);
        softAssert.assertTrue(isDisplayElement(lifeAtInsiderArea),"Life at Insider alanı görüntülenemedi.");
        softAssert.assertAll();
    }
}
