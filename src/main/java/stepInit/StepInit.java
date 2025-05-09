package stepInit;

import base.BaseTest;
import steps.CareersPageSteps;
import steps.HomePageSteps;

public class StepInit extends BaseTest {
    public static HomePageSteps homePageSteps;
    public static CareersPageSteps careersPageSteps;

    public StepInit() {
        homePageSteps = new HomePageSteps();
        careersPageSteps = new CareersPageSteps();
    }

}
