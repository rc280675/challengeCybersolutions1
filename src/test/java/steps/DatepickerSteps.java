package steps;

import core.Drive;
import io.cucumber.java.en.When;
import pages.DatePickerPage;

import java.io.IOException;
import java.util.Map;

public class DatepickerSteps {
    DatePickerPage datePickerPage = new DatePickerPage();

    @When("choose the date in datepicker")
    public void chooseTheDateInDatepicker(Map<String, String> map) throws InterruptedException, IOException {
        String datepickerdisabled = map.get("datepickerdisabled");
        String datepickerenable = map.get("datepickerenable");
        datePickerPage.setDatePickerDisabled(datepickerdisabled);
        datePickerPage.setDatePickerEnabled(datepickerenable);
        //Drive.printScreen("choose the date in datepicker");
        Thread.sleep(3000);

    }
}
