package steps;
import driver.DriverManager;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.QualityAssurancePage;
import reusableMethods.Log;

public class QualityAssurancePageSteps extends QualityAssurancePage {

    SoftAssert softAssert = new SoftAssert();

    public void goToQualityAssurancePage() {
        Log.info("Quality Assurance sayfasına gidiliyor.");
        navigateToSpecificURL(mainUrl + "careers/quality-assurance/");
        waitVisibleByLocator(seeAllQaJobsButton);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl()
                , mainUrl + "careers/quality-assurance/"
                , "Quality Assurance Sayfası Açılmadı!");
    }

    public void clickSeeAllQaJobsButtonAndCheck() {
        Log.info("See all QA jobs Butonuna tıklanır ve Filtreler Kontrol Edilir.");
        clickElement(seeAllQaJobsButton);
        waitVisibleByLocator(careerPositionListArea);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl()
                , mainUrl + "careers/open-positions/?department=qualityassurance"
                , "QA Jobs Sayfası Açılmadı!");
        waitVisibleByLocator(departmentText);
        clickElement(locationDropdown);
        clickElement(locationOfIstanbul);
        clickElement(departmentDropdown);
        clickElement(departmentOfQualityAssurance);
        Assert.assertTrue(isDisplayElement(jobsList), "İşler listelenmedi!");
    }

    public void checkJobsList() {
        Log.info("Pozisyon, Departman ve Lokasyon alanları kontrol edilir.");
        scrollToElementWithAction(arrowRight);
        int totalProduct = jobsPositionTitles.size();
        scrollToElementWithAction(resultCounter);
        for (int i = 0; i < totalProduct; i++) {
            scrollToElementWithAction(jobsLocationName.get(i));
            softAssert.assertTrue(jobsPositionTitles.get(i).getText().contains("Quality Assurance")
                    , "Pozisyon Başlığı 'Quality Assurance' içermiyor!");
            softAssert.assertEquals(jobsDepartmentName.get(i).getText(), "Quality Assurance"
                    , "Departman Başlığı 'Quality Assurance' içermiyor!");
            softAssert.assertEquals(jobsLocationName.get(i).getText(), "Istanbul, Turkiye"
                    , "Lokasyon Başlığı 'Istanbul, Turkiye' içermiyor!");
        }
        softAssert.assertAll();
    }
}
