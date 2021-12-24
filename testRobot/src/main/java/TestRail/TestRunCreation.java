package TestRail;

import java.awt.*;
import java.awt.event.InputEvent;

public class TestRunCreation {
    Robot robot;
    public TestRunCreation(Robot robot){
        this.robot = robot;
    }

    public void CreateTestRun(){
        robot.delay(2000);
        robot.mouseMove(1550,190); //test Run button
        robot.delay(1000);
        Click();
        robot.mouseMove(1000,546); // Dropdowm
        robot.delay(1000);
        Click();
        robot.mouseMove(1000,580); //Author
        robot.delay(1000);
        Click();
        robot.mouseMove(800,635);  //Ok button
        robot.delay(1000);
        Click();
    }

    private void Click(){
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

}
