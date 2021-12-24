package TestRail;

import java.awt.*;
import java.awt.event.InputEvent;

public class BaseRobot {
    Robot robot;

    BaseRobot(Robot robot) throws AWTException {
        this.robot = new Robot();
    }

    protected void Click(int delay){
        robot.delay(delay);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    protected void Click(){
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    protected void Step(int x, int y, int delay){
        robot.mouseMove(x,y); //test Run button
        robot.delay(delay);
    }

}
