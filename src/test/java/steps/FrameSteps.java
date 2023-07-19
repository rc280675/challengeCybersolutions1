package steps;

import core.Drive;
import io.cucumber.java.en.When;
import pages.FramePage;

import java.io.IOException;
import java.sql.Time;

public class FrameSteps {
    FramePage framePage = new FramePage();

    @When("fill the field frame {string}")
    public void fillTheFieldFrame(String text) throws InterruptedException, IOException {
        framePage.setTextFrame(text);
        Drive.printScreen("fill the field frame");
    }
}
