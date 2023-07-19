package pages;

import core.Drive;
import maps.FrameMap;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

    FrameMap frameMap;

    public FramePage() {
        frameMap = new FrameMap();
        PageFactory.initElements(Drive.getDriver(), frameMap);
    }

    public void setTextFrame(String text){
        Drive.getDriver().switchTo().frame(frameMap.mainFrame);
        frameMap.frameField.sendKeys(text);
    }


}
