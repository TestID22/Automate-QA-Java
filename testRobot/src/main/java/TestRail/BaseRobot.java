package TestRail;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class BaseRobot {
    Robot robot;

    BaseRobot(Robot robot) throws AWTException {
        this.robot = new Robot();
    }

    protected void Click(){
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    protected void Click(int delay){
        robot.delay(delay);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    protected void Step(int x, int y, int delay){
        robot.mouseMove(x,y); //test Run button
        robot.delay(delay);
    }

    protected void NextLine(int delay){
        robot.delay(delay);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
