import TestRail.TestRunCreation;

import java.awt.Robot;

public class TestRailTest {
    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();
        TestRunCreation createNewTestRun = new TestRunCreation(robot);
        createNewTestRun.CreateTestRun();
        createNewTestRun.AddTestRun("CENGAGE STAGE RELEASE 35", "ISP-1234","ENV WINDOWS 10", "SUT");

    }
}
