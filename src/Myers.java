import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Myers {

    public static void main(String[] args) throws AWTException {
        Robot r = new Robot();
        //for (int i = 0; i < 1000; i++) {
            r.mouseMove(1330, 390);
            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
            
            r.delay(100);
            
            r.mouseMove(1330, 545);
            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
            
            r.delay(500);
            
            r.mouseMove(1500, 1035);
            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        //}
        
        
        
    }

}
