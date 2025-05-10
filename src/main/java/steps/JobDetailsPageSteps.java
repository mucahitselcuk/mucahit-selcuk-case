package steps;

import org.testng.asserts.SoftAssert;
import pages.JobDetailsPage;
import reusableMethods.Log;

import static pages.QualityAssurancePage.jobsPositionTitles;

public class JobDetailsPageSteps extends JobDetailsPage {
    String jobTitle;
    SoftAssert softAssert = new SoftAssert();

    public void clickViewRoleButton() {
        Log.info("'View Role' Butonuna tıklanır");
        scrollToElementWithAction(jobsPositionTitles.get(0));
        jobTitle = jobsPositionTitles.get(0).getText();
        hoverElement(viewRoleButton,2);
        clickElement(viewRoleButton);
    }
    public void checkLeverApplicationPage() {
        Log.info("Başvuru sayfasının açıldığı kontrol edilir.");
        switchToOtherTab();
        waitVisibleByLocator(leverApplicationPagePositionTitle);
        softAssert.assertTrue(isDisplayElement(applyForThisJobButton),"Başvuru butonu görüntülenemedi!");
        softAssert.assertEquals(leverApplicationPagePositionTitle.getText(),jobTitle
                ,"Tıklanan Job ile açılan Job farklı!");
        softAssert.assertAll();
    }
}
