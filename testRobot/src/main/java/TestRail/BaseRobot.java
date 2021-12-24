package TestRail;

import java.awt.*;
import java.awt.event.InputEvent;

public class BaseRobot {
    Robot robot;

    BaseRobot(Robot robot) throws AWTException {
        this.robot = new Robot();
    }

    protected void Click(){
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

}
