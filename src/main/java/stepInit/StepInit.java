package stepInit;

import base.BaseTest;
import steps.CareersPageSteps;
import steps.HomePageSteps;
import steps.JobDetailsPageSteps;
import steps.QualityAssurancePageSteps;

public class StepInit extends BaseTest {
    public static HomePageSteps homePageSteps;
    public static CareersPageSteps careersPageSteps;
    public static QualityAssurancePageSteps qualityAssurancePageSteps;
    public static JobDetailsPageSteps jobDetailsPageSteps;

    public StepInit() {
        homePageSteps = new HomePageSteps();
        careersPageSteps = new CareersPageSteps();
        qualityAssurancePageSteps = new QualityAssurancePageSteps();
        jobDetailsPageSteps = new JobDetailsPageSteps();
    }

}
