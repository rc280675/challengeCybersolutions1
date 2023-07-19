package steps;

import core.Drive;
import io.cucumber.java.en.When;
import maps.SliderMap;
import pages.SliderPage;

import java.io.IOException;


public class SliderSteps {

    SliderPage sliderPage = new SliderPage();
    @When("I perform the slider action with {int} percents")
    public void iPerformTheSliderActionWithPercents(int value) throws InterruptedException, IOException {
        sliderPage.setSlider(value);
        Drive.printScreen("I perform the slider action with {int} percents");

    }

}
