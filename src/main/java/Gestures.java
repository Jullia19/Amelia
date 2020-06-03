import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.Dimension;

import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Gestures {

    /*public void scroll(int startx, int starty, int endx, int endy) {

        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(point(startx, starty))
                .waitAction(WaitOptions.waitOptions(ofSeconds(2)))
                .moveTo(point(endx, endy))
                .release()
                .perform();

    }

    public void swipeRight() {

        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.95);
        int endx = (int) (size.width * 0.05);
        int starty = size.height / 2;
        scroll(startx, starty, endx, starty);

    }*/
}
