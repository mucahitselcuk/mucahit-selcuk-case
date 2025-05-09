package tests;

import org.testng.annotations.Test;
import reusableMethods.Log;
import stepInit.StepInit;

public class InsiderTest extends StepInit {

    @Test (description = "InsiderTaskTest")
    public void testInsiderCareerFlow() {
        homePageSteps.acceptAllCookies();
        homePageSteps.isHomePageLoaded();
        homePageSteps.goToCareersPage();
        careersPageSteps.areCareerSectionsVisible();

        //CareersPage careersPage = new CareersPage(driver);
        //Assert.assertTrue(careersPage.areCareerSectionsVisible(), "Career sections are not visible");

//        driver.get("https://useinsider.com/careers/quality-assurance/");

//        QualityAssurancePage qaPage = new QualityAssurancePage(driver);
//        qaPage.clickSeeAllQAJobs();
//        qaPage.applyFilters();

//        Assert.assertFalse(qaPage.getJobListings().isEmpty(), "No QA jobs listed");
//
//        qaPage.getJobListings().forEach(job -> {
//            String text = job.getText();
//            Assert.assertTrue(text.contains("Quality Assurance"), "Job text does not contain 'Quality Assurance'");
//            Assert.assertTrue(text.contains("Istanbul, Turkey"), "Job location is not 'Istanbul, Turkey'");
//        });
//
//        qaPage.getJobListings().get(0).click();

//        JobDetailsPage detailsPage = new JobDetailsPage(driver);
//        Assert.assertTrue(detailsPage.isLeverApplicationPage(), "Not redirected to Lever application page");
    }
}
