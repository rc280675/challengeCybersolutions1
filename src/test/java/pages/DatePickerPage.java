package pages;

import core.Drive;
import io.cucumber.java.hr.Kad;
import maps.DatePickerMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage {
    DatePickerMap datePickerMap;

    public DatePickerPage(){
        datePickerMap = new DatePickerMap();
        PageFactory.initElements(Drive.getDriver(), datePickerMap);
    }

    public void setDatePickerDisabled(String date){
        Drive.visibilityOf(datePickerMap.datePickerDisable);
//        datePickerMap.datePickerDisable.sendKeys(date);
        datePickerMap.datePickerDisable.sendKeys(date);
        datePickerMap.datePickerDisable.sendKeys(Keys.ENTER);
    }

    public void setDatePickerEnabled(String date){
        Drive.visibilityOf(datePickerMap.datePickerEnable);
        datePickerMap.datePickerEnable.sendKeys(date);
        datePickerMap.datePickerEnable.sendKeys(Keys.ENTER);
    }

}
