package tests;

import org.testng.annotations.Test;
import stepInit.StepInit;

public class InsiderTest extends StepInit {

    @Test (description = "InsiderTaskTest")
    public void testInsiderCareerFlow() {
        homePageSteps.acceptAllCookies();
        homePageSteps.isHomePageLoaded();
        homePageSteps.goToCareersPage();
        careersPageSteps.areCareerSectionsVisible();
        qualityAssurancePageSteps.goToQualityAssurancePage();
        qualityAssurancePageSteps.clickSeeAllQaJobsButtonAndCheck();
        qualityAssurancePageSteps.checkJobsList();
        jobDetailsPageSteps.clickViewRoleButton();
        jobDetailsPageSteps.checkLeverApplicationPage();
    }
}
