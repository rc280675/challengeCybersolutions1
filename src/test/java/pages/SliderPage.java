package pages;

import core.Drive;
import maps.SliderMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class SliderPage {
    SliderMap sliderMap;

    public SliderPage(){
        sliderMap = new SliderMap();
        PageFactory.initElements(Drive.getDriver(), sliderMap);
    }

    public int setSlider(int value) throws InterruptedException {
        Drive.visibilityOf(sliderMap.slideBar);
        for(int i=0; i<value; i++){
            sliderMap.slideBar.sendKeys(Keys.ARROW_RIGHT);
        }
        Thread.sleep(3000);
        return 0;
    }

}
